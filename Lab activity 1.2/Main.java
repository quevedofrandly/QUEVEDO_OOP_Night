package Main;

import java.util.Scanner;


public class Main {
    
    public static boolean isAsciiLower(char ch) {
        return ch >= 'a' && ch <= 'z';
    }
    
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the message: ");
        String message = scanner.nextLine();

        if (Misplacedletter(message)) {
            System.err.println("JEJE!!");
        } else {
            System.out.println("uwu");
        }
    }

    public static boolean Misplacedletter(String message) {
        boolean prevLetter = false;
        
        for (char ch : message.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (prevLetter && !isAsciiLower(ch)) {
                    return true;
                }
                prevLetter = true;
            } else {
                prevLetter = false;
            }
        }
        return false;
    }

}
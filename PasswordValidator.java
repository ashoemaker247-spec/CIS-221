/* 
    Alec Shoemaker
    Chapter 8 Programming Challenge 5
    I did not copy code from other p1eople or sources other than our CIS-172 textbook. I did not use any AI software to help write code.
 */
import java.util.*;

public class PasswordValidator {

    public static boolean isValid(String password) {
        if (password.length() < 6) {
            return false;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        return hasUpper && hasLower && hasDigit;
    }

    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.print("Enter a password: ");
            String inputPassword = keyboard.nextLine();
            
            if (isValid(inputPassword)) {
                System.out.println("Password is valid.");
            } else {
                System.out.println("Password is invalid.");
                System.out.println("It must be at least 6 characters long, include at least one uppercase letter, one lowercase letter, and one digit.");
            }
        }
    }
}

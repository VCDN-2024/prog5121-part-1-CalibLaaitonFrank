import java.util.Scanner;
import java.util.regex.Pattern;

public class AccountCreation {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int MAX_USERNAME_LENGTH = 5;
    private static final String USERNAME_REGEX = "^[a-z A-Z _]{1," + MAX_USERNAME_LENGTH + "}_";
    private static final String PASSWORD_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        String Name = SCANNER.nextLine();

        System.out.print("Enter your surname: ");
        String Surname = SCANNER.nextLine();

        System.out.print("Enter your username (no more than 5 characters and must contain an underscore at the end): ");
        String username = SCANNER.nextLine();

        if (isValidUsername(username)) {
            System.out.println("Username successfully captured.");
        } else {
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore at the end and is no more than " + MAX_USERNAME_LENGTH + " characters in length.");
        }

        System.out.print("Enter your password (must contain atleast 8 characters, a capital letter, a number and a special character): ");
        String password = SCANNER.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Password successfully captured.");
        } else {
            System.out.println("Password is not correctly formatted, please ensure that the password contains atleast 8 characters, a capital letter, a number and a special character");
        }

        System.out.print("Enter your Username: ");
        String Username = SCANNER.nextLine();
        if (isValidUsername(username)) 
            System.out.print("Enter your Password: ");
            String Password = SCANNER.nextLine();
        {
            {
                if (authenticate(Username, Password)) {
            System.out.println("Welcome " + getFirstName(Name)+ getLastName(Surname) + " ,it is great to see you again");
        } else {
             //System.out.println("Username or password incorrect, please try again.");
             System.out.println("Welcome, it is great to see you again");
            }                                            
          }
        }
    }

    private static boolean isValidUsername(String username) {
        return Pattern.matches(USERNAME_REGEX, username);
    }

    private static boolean isValidPassword(String password) {
        return Pattern.matches(PASSWORD_REGEX, password);
    }

    private static boolean authenticate(String username, String password) {
        //Replace this with your own authenic login
        return username.equals("john_doe") && password.equals("SecurePassword1!");
    }

    private static String getFirstName(String Name) {
        return Name.split("_")[0];
    }

    private static String getLastName(String Surname) {
        return Surname.split("_")[1];
    }
}







//W3Schools.com. (n.d.). Java Strings. W3Schools.com. Retrieved from https://www.w3schools.com/java/java_strings.asp 
//Bro Code. (2020). Java login system [Online video]. YouTube. Retrieved from https://www.youtube.com/watch?v=Hiv3gwJC5kw
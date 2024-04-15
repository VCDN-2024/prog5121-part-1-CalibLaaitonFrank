import java.util.Scanner;

public class AccountLogin {
    private static final Scanner SCANNER = new Scanner(System.in);
    
    public static void main (String[] args){
       
        System.out.print("Enter your username: ");
        String username = SCANNER.nextLine();
        System.out.print("Enter your password: ");
        String password = SCANNER.nextLine();

        if (authenticate(username, password)) {
            System.out.println("Welcome " + getFirstName(username) + "" + getLastName(username) + " ,it is great to see you again");
} else {
    System.out.println("Username or password incorrect, please try again.");
  } 
}

private static boolean authenticate(String username, String password){
      //Replace this with your own authenic login
      return username.equals("john_doe")&& password.equals("SecurePassword1!");
}

private static String getFirstName (String username) {
    return username.split("_")[0];
}

private static String getLastName (String username) {
    return username.split("_")[1];
}
}


//TED. (2022). The most important lesson from 83,000 brain scans | Daniel Amen | TEDxOrangeCoast [Online video]. YouTube. Retrieved from https://www.youtube.com/watch?v=jHSBrX8lLWk
//Stack Overflow. (n.d.). How to code a very simple login system with Java? Stack Overflow. Retrieved from https://stackoverflow.com

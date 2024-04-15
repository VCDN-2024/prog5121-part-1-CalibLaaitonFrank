import java.util.Scanner;

public class Account { 
    private String username;
    private String password;

public Account (String username, String password) {
    this. username = username;
    this. password = password;
}

public boolean checkUserName(){
    return username. contains ("-") && username.length() <=5;
}
public boolean checkPasswordComplexity (){
    return password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}%"); 
}

public String registerUser() {
    if (!checkUserName()) {
        return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
    }
if (!checkPasswordComplexity()) {
    return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
}
return "User registered successfully.";
}
public boolean loginUser(String username, String password) {
    return this.username.equals (username) && this. password.equals (password);
}

public String getFirstName() {
    return username. split("_")[0];
}

public String getLastNamed() {
    return username. split("_")[1];
}

public String returnLoginStatus()
{
    return "mn ";
}

public String returnLoginstatus(boolean isAuthenticated) {

       if (isAuthenticated) {
          return "Welcome" + getFirstName() + "" + getLastNamed() + " ,it is great to see you again.";

  } else {
       return "Username or password incorrect, please try again.";
          }
  }

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Account account = new Account("","");

    System.out.print("Enter your username: ");
    String username = scanner.nextLine();
    System.out.print("Enter your password: ");
    String password = scanner.nextLine();

    account = new Account (username, password);

    System.out.println(account.registerUser ());

    System.out.print("Enter your username: ");
    username = scanner.nextLine();
    System.out.print("Enter your password: ");
    password = scanner.nextLine();
    
    //System.out.println(account.returnLoginStatus(account.loginUser(username, password)));
    String status = account.returnLoginStatus();
   
    System.out.println("");
  } 
}


//Nanyang Technological University. (n.d.). Nanyang Technological University. Retrieved from https://www3.ntu.edu.sg/
//Java Guides. (2020). Java GUI account code - YouTube. Retrieved from https://www.youtube.com/watch?v=mgw1sAvhjy8
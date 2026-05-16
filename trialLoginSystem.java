import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
       //First you have to login. Once you login, it should recognize your name (some accounts will be default included) and welcome you
       //Next it should also recognize your access level -> do you have access to change and edit everything or is it only to see your credentials
       //Schedule vacations, enter hours worked, see next payday (it would be cool if it could automatically get the date of today)
       //Emphasize choice -> the prior system I created led you through different things -> you couldn't choose if you wanted to do this or that
    //login()

userSession currentSession = new userSession(false, 1000, "John Doe", "employee");

System.out.println(currentSession.getLoginSuccessful());
System.out.println(currentSession.getLoginID());
System.out.println(currentSession.getUsername());
System.out.println(currentSession.getAccessLevel());

System.out.println("Please enter a username: ");
String username = scanner.nextLine();
System.out.println("Please enter your password: ");
String password = scanner.nextLine();

// userSession session = new userSession(username, password);
// System.out.println(session.)
    }

  /*  
    public static char menu(){
        return 'A';
    }*/
}

class userSession{
    //What do I actually want to return with this? I am using an object to be able to return and access multiple values
    //1. A boolean value that says if login has actually been successful (that there is a password match). 2. The ID for the person logging in. 3. The access level of the person logging in (administrator, hiring manager, employee, etc.)
    private boolean loginSuccessful;
    private int loginID;
    private String username;
    private String accessLevel; // default is lowest level so that they don't actually have access to anything unless they login


    userSession(boolean loginSuccessful, int loginID, String username, String accessLevel){

        this.loginSuccessful = loginSuccessful;
        this.loginID = loginID;
        this.username = username;
        this.accessLevel = accessLevel;
    }
    
    public boolean getLoginSuccessful(){
      return this.loginSuccessful;
    }
    
    public int getLoginID(){
      return this.loginID;
    }
    
    public String getUsername(){
      return this.username;
    }
    
    public String getAccessLevel(){
      return this.accessLevel;
    }
}

// class processLogin{

//     processLogin(Scanner scanner){

//       // System.out

//     }    

// }

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        boolean correctPassword = false;
        Scanner myScanner = new Scanner(System.in);
        String password = "apple1234";
        do{
        System.out.println("Enter your password: ");
        correctPassword = checkPassword(myScanner.nextLine(), password);
        }while(!correctPassword);
        System.out.println("Now the program is outside of the do-while loop!");
    }
    public static boolean checkPassword(String input, String password){
        System.out.println("You entered: " + input);
        if(password.equals(input)){
            System.out.println("The password stored matches what you entered.");
            return true;
        } else{
            System.out.println("The password you entered does not match what is stored in the system.");
        return false;
            
        }
    }
}

import java.util.Scanner;
public class Login {
        public static void main(String[]args) {
	       String correctusername= "CSC200"; /** Correct username */
    	       String correctpassword= "XXXXXX"; /** Correct password */
	       System.out.print("Enter the username: ");
	       Scanner keyboard = new Scanner(System.in);
	       String username = keyboard.nextLine(); /** asking for the username */
	       System.out.print("Enter the password: ");
	       String password = keyboard.nextLine(); /** asking for the password */
	       if(username.equals(correctusername) && password.equals(correctpassword)){
	       System.out.print("Welcome");
	       }
	       else{
	       System.out.print("Wrong username and/or password");
	        }
	}
}



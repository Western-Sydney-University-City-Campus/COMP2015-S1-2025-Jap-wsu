import java.util.Scanner;
public class CalorieWatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
       int cookies =0;
       
        System.out.print("Enter the number of cookies eaten: ");
        cookies = kb.nextInt();
        
        while(cookies<0 || cookies >40) {
        	System.out.print("Error: The value of the cookies must be between 0 to 40 so, please enter the valid nuber of cookies. ");
        	 System.out.print("Enter the number of cookies eaten: ");
             cookies = kb.nextInt();
        	
        }
        double servesConsumed = (cookies / 40.0) * 10;

       
        double totalCalories = servesConsumed * 300;

        
        System.out.println("You consumed " + totalCalories + " calories when you ate " + cookies + " cookies.");


       kb.close();
      

	}

}

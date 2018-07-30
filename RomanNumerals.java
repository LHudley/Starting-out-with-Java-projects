import java.util.Scanner;
public class RomanNumerals {

	public static void main(String[] args) {
		
		/* Write a program that prompts the user to enter a number within the range 
		 of 1 through 10. If the number entered is outside the range then give an error message.
		*/
		
		Scanner scanner = new Scanner(System.in);

		int userInput;
				
		System.out.println( "Please enter a number between 1 and 10: ");
		userInput = scanner.nextInt();
		
		//checking if number is out of range
		if ( userInput < 1 || userInput > 10) {
			System.out.println("Error");
		}
		else {
			if(userInput == 1) {
				System.out.println(" I ");
			}
			else if(userInput == 2) {
				System.out.println(" II ");
			}
			else if (userInput == 3) {
				System.out.println(" III ");
			}
			else if (userInput == 4) {
				System.out.println(" IV ");
			}
			else if (userInput == 5) {
				System.out.println(" V ");
			}
			else if (userInput == 6) {
				System.out.println(" VI ");
			}
			else if (userInput == 7) {
				System.out.println(" VII ");
			}
			else if (userInput == 8) {
				System.out.println(" VIII ");
			}
			else if (userInput == 9) {
				System.out.println(" IX ");
			}
			else if (userInput == 10) {
				System.out.println(" X ");
			}
		}
		
	}

}

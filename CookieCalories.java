import java.util.Scanner;

public class CookieCalories {

	public static void main(String[] args) {

		double cookiesAte;
		double bagTotal = 40;
		double bagServings = 10;
		double numOfServings;
		double servingCalories = 300;
		double totalCalories;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Please enter the amount of cookies eaten: ");
		cookiesAte = scanner.nextDouble();
		
		numOfServings = ((cookiesAte/40) * bagServings);
		totalCalories = ((numOfServings/1) * servingCalories);
		
		System.out.println("Number of cookies eaten: " + cookiesAte);
		System.out.println("Number of servings are: " + numOfServings);
		System.out.println("The calorie total is: " + totalCalories);
		
	}

}

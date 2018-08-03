import java.util.Scanner;

public class MagicDates {

	public static void main(String[] args) {
		
		double month;
		double day;
		double year;
		
		Scanner scanner = new Scanner (System.in);

		System.out.println("Please enter the month: ");
		month = scanner.nextDouble();
		
		System.out.println("Please enter the day: ");
		day = scanner.nextDouble();
		
		System.out.println("Please enter the year: ");
		year = scanner.nextDouble();
		
		if (year < 1 || year > 99) {
			System.out.println("Please ONLY enter a 2 digit year ");
		}
			
		if (month * day == year) {
			System.out.println("Congratulations! You have a Magic Date");
		}
			else {
				System.out.println("Sory, you do not have a Magic Date");
		}
		
	}

}

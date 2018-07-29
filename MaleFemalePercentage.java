import java.util.Scanner;
public class MaleFemalePercentage {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		
		double NumOfMales;
		double NumOfFemales;
		double totalStudents;
		double percentOfMales;
		double percentOfFemales;
		
		
		System.out.println("Please enter number of Male students: ");
		NumOfMales = scanner.nextDouble();
		
		System.out.println("Please enter number of Female students: ");
		NumOfFemales = scanner.nextDouble();
		
		totalStudents = NumOfMales + NumOfFemales;
		percentOfMales = (NumOfMales/totalStudents) * 100;
		percentOfFemales = (NumOfFemales/totalStudents) * 100;
		
		System.out.println("The number of males: " + NumOfMales);
		System.out.println("The number of females: " + NumOfFemales);
		System.out.println("The total amount of students: "+ totalStudents);
		System.out.println("The percentage of males: " + percentOfMales);
		System.out.println("The percentage of females: " + percentOfFemales);
	}

}

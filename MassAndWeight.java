import java.util.Scanner;

public class MassAndWeight {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		
		double objectMass;
		double objectWeight;
		double newtons;
		
		System.out.println("Enter the mass of the object: ");
	    objectMass = scanner.nextDouble();
		
		objectWeight = objectMass * 9.8;
		
		if (objectWeight > 1000) {
			System.out.printf("Object weight %.2f is too heavy ", objectWeight);
		}
		else if (objectWeight < 10) {
			System.out.printf("Object weight %.2f is too light ",  objectWeight);
		}
		else {
			System.out.printf("The object weight %.2f Newtons is neither light or heavy: ", objectWeight);
			
		}
	}

}

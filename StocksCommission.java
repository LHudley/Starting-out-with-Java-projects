
public class StocksCommission {

	public static void main(String[] args) {

		//declare variables
		double sharesBought;
		double pricePerShare;
		double percentagePerCommission;
		double amountPaid;
		double amountCommission;
		double totalAmountPaid;
		
		//values for variables
		sharesBought = 600;
		pricePerShare = 21.77;
		percentagePerCommission = 0.02;
		
		amountPaid = sharesBought * pricePerShare;
		amountCommission = amountPaid * percentagePerCommission;
		totalAmountPaid = amountPaid + amountCommission;
		
		System.out.println("Kathryn's paid $" + amountPaid + " for stocks");
		System.out.println("Kathryn's paid $" + amountCommission + " for commision");
		System.out.println("Kathryn's total amount paid is $" + totalAmountPaid);
	}
	

}

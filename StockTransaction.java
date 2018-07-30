
public class StockTransaction {

	public static void main(String[] args) {
		
		
		//values to variables
		int numberSharesPurchased = 1000;
		double paidPerStock = 32.87;
		double commissionPercentage = 0.02;
		int sharesSold = 1000;
		double soldPerShare = 33.92;
		
		
		//calculations first month
		double totalPaidStocks = numberSharesPurchased * paidPerStock;
		double commissionBuy = totalPaidStocks * commissionPercentage;
		
		//calculations two week later
		double totalStocksAmount = sharesSold * soldPerShare;
		double commissionSell = totalStocksAmount * commissionPercentage;
		
		//calculations for profit or loss
		double amountProfitStocks = totalPaidStocks - totalStocksAmount;
		double totalPayCommission = commissionBuy - commissionSell;
	
		double totalAmountProfit = amountProfitStocks - totalPayCommission;
		
		System.out.println("Joe paid $" + totalPaidStocks + " for the stocks");
		System.out.println("Joe paid $" + commissionBuy + " in stocks");
		System.out.println("Joe recieved $" + totalStocksAmount + " in stocks");
		System.out.println("Joe paid $" + commissionSell + " commission for stocks");
		System.out.println("Joes total profit is $" + totalAmountProfit);
		
		
	}

}

public class ProfitCalc {
	public static void main(String[] args){
		double cost = 129;
        double selling = 191;

        double profit = selling - cost;
        double percent = (profit / cost) * 100;
		
		System.out.println("The Cost Price is INR " + cost + " and Selling Price is INR " + selling);
		System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + percent);
	}
}
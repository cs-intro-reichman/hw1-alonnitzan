// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		
		// All of the varriables that given as an input
		int currentValue = Integer.parseInt(args[0]);
		double rate = (Double.parseDouble(args[1])); 
		int numOfYears = Integer.parseInt(args[2]);
		
		// calculate the future value
		double futureValue = currentValue*(Math.pow((1 + (rate / 100)) , numOfYears));

		// print the summary of the interest
		System.out.println("After " + numOfYears + " years, a $" + currentValue + " saved at " + rate +
							"% will yield $" + (int) futureValue);

	}
}
// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		
		// All of the varriables that given as an input
	    String name1 = args[0];
		String name2 = args[1];
	    String name3 = args[2];
	    // Convert the string to integer 
		int totalPrice = Integer.parseInt(args[3]);

		// Convert the total_price to double, divide it to 3 and ceil the price
		double priceToPay = totalPrice;
		priceToPay = Math.ceil(priceToPay / 3);
		
		// print the ouput
		System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 + ": pay " +
						   priceToPay + " Shekels each.");
	    
	}
}

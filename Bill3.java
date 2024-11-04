// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		
		// All of the varriables that given as an input
	    String name1 = args[0];
		String name2 = args[1];
	    String name3 = args[2];
	    // Convert the string to integer 
		int total_price = Integer.parseInt(args[3]);

		// Convert the total_price to double, divide it to 3 and ceil the price
		double price_to_pay = total_price;
		price_to_pay = Math.ceil(price_to_pay / 3);
		
		// print the ouput
		System.out.println("Dear " + name1 + ", " + name2 + ", and " + name3 + ": pay " +
								price_to_pay + " Shekels each.");
	    
	}
}

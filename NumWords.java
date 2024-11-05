// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    
		// the input number
		int num = Integer.parseInt(args[0]);

		// calculate the hundreds, tens and ones
		int hundreds = num / 100 ;
		int tens = (num % 100) / 10;
		int ones = num % 10; 

		// print the ouput
		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + 
							ones + " ones.");
	}
}

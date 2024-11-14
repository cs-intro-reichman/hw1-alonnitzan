// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		
		// the input limit
		int limit = Integer.parseInt(args[0]);

		// random 3 number between 0 to limit and convert them to integer
		int a = (int) (Math.random() * limit);
		int b = (int) (Math.random() * limit);
		int c = (int) (Math.random() * limit);

		// find the minimum and maximum number
		int min = Math.min(Math.min(a, b), c);
		int max = Math.max(Math.max(a, b), c);
		
		// calculate the middle number
		int total = a + b + c;
		int middle = total - max - min;
		
		// print the original numbers and the number in ascending order
		System.out.println(a + " " + b + " " + c);
		System.out.println(min + " " + middle + " " + max);
	}
}

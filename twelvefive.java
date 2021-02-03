/**
 *Class
 */
public class twelvefive {
	/**
	 * Main method that calls the recursive method with param inputs
	 */
	public static void main (String[] args) {
		writeBinary(999999999);
		System.out.printf("\n");
		writeBinary(44);
		System.out.printf("\n");
		writeBinary(-1);
		System.out.printf("\n");
		writeBinary(0);
		System.out.printf("\n");
		writeBinary(9);
		System.out.printf("\n");
		writeBinary(2);
		System.out.printf("\n");
		writeBinary(1);
	}
	/**
	 * @param nums is an integer
	 * if the param input is less than 2 then we print the input
	 * else we call the method recursivly and print the remainder of our input
	 */
	public static void writeBinary (int nums){
		if (nums < 2) {
			System.out.print(nums);
		} else {
		writeBinary(nums / 2);
		System.out.print(nums % 2);
	}
		
		
	}
}

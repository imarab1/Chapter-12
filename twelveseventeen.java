/**
 * Class
 */
public class twelveseventeen {
	/**
	 *Main method calls recursive method with parameter inputs
	 */
	public static void main(String[] args) {
		System.out.println(permut(7, 4));
		System.out.println(permut(0, 0));
		System.out.println(permut(-1, -1));
		System.out.println(permut(7, -5));
		System.out.println(permut(-8, 4));
		System.out.println(permut(2, 4));
		
	}
	/**
	 *@param n integer
	 *@param r integer
	 * 
	 * the if statement, if the value of n is greater than n -  r
	 * when n is less than n - r we get 0
	 * @return recursive function and compute permutation 
	 * else 
	 * @return 1
	 */
	public static int permut(int n, int r) {
		if(n - r < n) {
			return n*permut(n-1, r-1);
		} else {
			return 1; 
			}
	}
}

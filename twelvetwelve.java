/**
 * Class
 */
public class twelvetwelve {
	/**
	 * Main method
	 * Calls recursive method with parameter inputs
	 */
	public static void main(String[] args) {
	System.out.println(isReverse("hello", "olleh"));
	System.out.println(isReverse("hello", "0LLEH"));
	System.out.println(isReverse("hello", "Hleh"));
	System.out.println(isReverse("hello", "o"));
	System.out.println(isReverse("hello", "FIVEH"));
	}
	/**
	 * method called isReverse
	 * @param first String
	 * @param second String
	 * The first if statement checks to see if the lengths of the two strings are equal
	 * The else if statement checks to see if the lengths of the two strings equal zero
	 * The else statement converts string to uppercase 
	 * @return checks to see if the letter of the first string and the 
	 * second letter of the second string match up, then it is recursivly
	 * called on the next letter in the strings
	 */
	public static boolean isReverse (String first, String second) {
	  if(first.length()!= second.length()) {
        return false;
        
    } else if(first.length()== 0 && second.length() == 0) {
        return true;
    
    } else {
        first = first.toUpperCase(); 
        second = second.toUpperCase();
        
        return first.charAt(0) == second.charAt(second.length() - 1) && isReverse(first.substring(1, first.length()), second.substring(0, second.length() - 1));
		}
	}
	
}

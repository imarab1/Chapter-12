/**
* import package
*/
import java.util.*;	
/**
 * Class
 */
public class twelvetwentytwo {
	/**
	 * Main method where we call our helper method called subset with 
	 * list parameter inputs
	 */
	public static void main(String[] args) {
        ArrayList<String> index = new ArrayList<>(List.of("Janet", "Robert", "Morgan", "Char"));
        subsets(index);
	}
	public static void subsets(List<String> index) {
    subsets(index, 0, index.size());
}
	/**
	 * Recursive method
	 * @param index
	 * @param beg start of index 
	 * @param fin end of index 
	 * if the end of the list equals zero 
	 * then we print the empty list
	 * else we recursivly call our method and go through the each of the choices
	 * then we remove the first string
	 * and we have a new start
	 */
	public static void subsets(List<String> index, int beg, int fin) {
		if(fin == 0) {
			System.out.println(index);
		} else {
			subsets(index, beg + 1, fin - 1);
			String str = index.remove(beg);
			subsets(index, beg, fin - 1);
			index.add(beg, str);
		}
}


	
}


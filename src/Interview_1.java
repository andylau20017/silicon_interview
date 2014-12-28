import java.util.Arrays;

/**
 * 
 */

/**
 * Sum of two number
 * @author erfeiliu
 *
 */
public class Interview_1 {
    static boolean hasSum(int[] array, int target) {
        boolean res = false;
        if (array == null || array.length < 2) {
            return res;
        } 
        
        Arrays.sort(array);
        int i = 0, j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] > target) {
                j --;
            } else if (array[i] + array[j] < target) {
                i ++;
            } else {
                res = true;
                break;
            }
        }
        
        return res;
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    int[] a = new int[] {1,5,7,3};
	    System.out.println(hasSum(a, 10)); // true
	    System.out.println(hasSum(a, 18)); // false
	}

}

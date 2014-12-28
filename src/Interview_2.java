import java.util.HashMap;
import java.util.Map;

/**
 * 
 */

/**
 * 1. Find two number in the array which the sum of the them equal the given number,
 * 2. Return the index of the two number
 * 3. If every element is different, the time complexity should be O(n).
 * @author erfeiliu
 *
 */
public class Interview_2 {

    static int[] twoSum(int[] a, int target) {
        int[] res = new int[] {-1, -1};
        Map<Integer, Integer> valueToIndex = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.length; i ++) {
            valueToIndex.put(a[i], i);
        }
        
        for (int i = 0; i < a.length; i ++) {
            int diff = target - a[i];
            if (valueToIndex.containsKey(diff) && target != 2 * a[i]) {
                res[0] = i;
                res[1] = valueToIndex.get(Integer.valueOf(diff));
            }
        }
        
        return res;
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] a = new int[] {1,5,7,3};
        int[] res = twoSum(a, 10);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }

}

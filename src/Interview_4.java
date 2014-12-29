/**
 * 
 */

/**
 * @author erfeiliu
 *
 */
public class Interview_4 {

    public static int[] rotateArray(int[] a, int k) {
        if (null == a || k >= a.length) return a;
        revertArray(a, 0, a.length - 1);
        revertArray(a, 0, k - 1);
        revertArray(a, k, a.length - 1);
        return a;
    }
    
    public static int[] revertArray(int[] a, int start, int end) {
        while (start < end) {
            int tmp = a[start];
            a[start] = a [end];
            a[end] = tmp;
            start ++;
            end --;
        }
        return a;
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}

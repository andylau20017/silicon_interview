/**
 * 
 */
package interview_3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author erfeiliu
 *
 */
public class TwoSum {

    private Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    
    public void save(int input) {
        if (this.map.containsKey(input)) {
            Integer oldTimes = this.map.get(input);
            this.map.put(input, oldTimes + 1);
        } else {
            this.map.put(input, 1);
        }
    }
    
    public boolean test(int target) {
        boolean exist = false;
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (target == 2 * key) {
                if (value >= 2) return true;
            } else {
                if (map.containsKey(target - key)) return true;
            }
        }
        
        return exist;
    }
}

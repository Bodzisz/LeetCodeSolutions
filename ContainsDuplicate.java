import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>(nums.length);
        for(int num : nums) {
            boolean appeared = map.getOrDefault(num, false);
            if(appeared) {
                return true;
            }
            else {
                map.put(num, true);
            }
        }
        return false;
    }
}

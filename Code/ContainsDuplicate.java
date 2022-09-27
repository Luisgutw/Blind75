package Code;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet check = new HashSet();
        for (int num : nums) {
            if (check.contains(num)) {
                return true;
            }
            check.add(num);
        }
        return false;
    }

}

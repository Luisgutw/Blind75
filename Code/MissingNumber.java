package Code;

import java.util.HashSet;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        HashSet hs = new HashSet();
        for (int num : nums) {
            hs.add(num);
        }
        for (int i = 0; i <= nums.length; i++) {
            if (!hs.contains(i))
                return i;
        }
        return 0;
    }
}

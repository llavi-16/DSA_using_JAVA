import java.util.*;

class Solution2089 {
    public List<Integer> targetIndices(int[] nums, int target) {
        int less = 0, equal = 0;

        // Counting how many numbers are less than target and equal to target
        for (int num : nums) {
            if (num < target)
                less++;
            else if (num == target)
                equal++;
        }

        // result list
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < equal; i++) {
            result.add(less + i);
        }

        return result;
    }
}

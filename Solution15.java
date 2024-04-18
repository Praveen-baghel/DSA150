import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        if (n < 3)
            return result;
        Arrays.sort(nums);
        int i = 0;
        while (i < n - 2) {
            if (nums[i] > 0)
                break;
            int j = i + 1, k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                }
                if (sum >= 0) {
                    while (nums[k] == nums[--k] && j < k)
                        ;
                }
                if (sum <= 0) {
                    while (nums[j] == nums[++j] && j < k)
                        ;
                }
            }
            while (nums[i] == nums[++i] && i < n - 2)
                ;
        }
        return result;
    }
}

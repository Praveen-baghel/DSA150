public class Solution169 {
    public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int curr = nums[0], count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == curr)
                count++;
            else {
                count--;
            }
            if (count == 0) {
                curr = nums[i];
                count++;
            }
        }
        return curr;
    }
}

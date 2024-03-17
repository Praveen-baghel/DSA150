public class Solution26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int k = 1;
        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != prev) {
                prev = nums[i];
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}

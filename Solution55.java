public class Solution55 {
    public boolean canJump(int[] nums) {
        int res = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= res)
                res = i;
        }
        if (res == 0) {
            return true;
        }
        return false;
    }
}

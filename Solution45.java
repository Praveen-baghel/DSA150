public class Solution45 {
    public int jump(int[] nums) {
        int jump = 0, destination = 0, currentMaxJump = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            currentMaxJump = Math.max(currentMaxJump, i + nums[i]);
            if (i == destination) {
                jump++;
                destination = currentMaxJump;
            }
        }
        return jump;
    }
}
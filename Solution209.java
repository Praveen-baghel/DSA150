public class Solution209 {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int s = 0, e = 0;
        int sum = 0;
        while (e < nums.length) {
            sum += nums[e];
            while (sum >= target && s <= e) {
                result = Math.min(result, e - s + 1);
                sum -= nums[s++];
            }
            e++;
        }
        if (result == Integer.MAX_VALUE)
            return 0;
        return result;
    }
}

public class Solution189 {
    public static void reverse(int nums[], int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        // arr = [1,2,3,4,5,6,7], k = 3
        k %= nums.length;
        reverse(nums, 0, nums.length - 1); // arr = [7,6,5,4,3,2,1]
        reverse(nums, 0, k - 1); // arr = [5,6,7,4,3,2,1]
        reverse(nums, k, nums.length - 1); // arr = [5,6,7,1,2,3,4]
    }
}

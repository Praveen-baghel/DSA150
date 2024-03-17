public class Solution80 {
    public int removeDuplicates(int[] nums) {
        int counter = 1, index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                counter += 1;
            } else {
                counter = 1;
            }
            if (counter < 3) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
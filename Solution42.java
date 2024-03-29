public class Solution42 {
    public int trap(int[] height) {
        int n = height.length, result = 0;
        if (n == 0 || n == 1) {
            return 0;
        }
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = 0;
        right[n - 1] = 0;
        int leftMax = 0, rightMax = 0;
        for (int i = 1; i < n; i++) {
            leftMax = Math.max(leftMax, height[i - 1]);
            left[i] = leftMax;
            rightMax = Math.max(rightMax, height[n - i]);
            right[n - i - 1] = rightMax;
        }
        for (int i = 0; i < n; i++) {
            int h = Math.min(left[i], right[i]);
            if (h > height[i])
                result += (h - height[i]);
        }
        return result;
    }
}

public class Solution11 {
    public int maxArea(int[] height) {
        int s = 0, e = height.length - 1, max = Integer.MIN_VALUE;
        while (s < e) {
            if (height[s] > height[e]) {
                max = Math.max(max, height[e] * (e - s));
                e--;
            } else {
                max = Math.max(max, height[s] * (e - s));
                s++;
            }
        }
        return max;
    }
}

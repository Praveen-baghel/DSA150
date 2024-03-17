public class Solution121 {
    public int maxProfit(int[] prices) {
        int min_val = Integer.MAX_VALUE, result = 0;
        for (int price : prices) {
            min_val = Integer.min(price, min_val);
            result = Integer.max(result, price - min_val);
        }
        return result;
    }
}

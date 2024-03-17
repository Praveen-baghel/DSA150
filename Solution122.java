public class Solution122 {
    public int maxProfit(int[] prices) {
        int min_val = 0, profit = 0;
        boolean has_stock = false;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[i - 1] && has_stock) {
                has_stock = false;
                profit = profit + prices[i - 1] - min_val;
            } else if (prices[i] > prices[i - 1]) {
                if (has_stock)
                    continue;
                else {
                    has_stock = true;
                    min_val = prices[i - 1];
                }
            }
        }
        if (has_stock) {
            profit = profit + prices[prices.length - 1] - min_val;
        }
        return profit;
    }
}


// Alternate solution
// public class Solution122 { 
//     public int maxProfit(int[] arr) {
//      int n=arr.length;
// 		int profit=0;
// 		for(int i=1;i<n;i++){
// 			if(arr[i]>arr[i-1]){
// 				profit+=arr[i]-arr[i-1];
// 			}
// 		}
// 		return profit;
//     }
// }  
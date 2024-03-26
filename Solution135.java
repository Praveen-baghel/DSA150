public class Solution135 {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[ratings.length];
        for (int i = 0; i < candies.length; i++)
            candies[i] = 1;
        for (int i = 1; i < n; i++)
            if (ratings[i] > ratings[i - 1])
                candies[i]++;
        for (int i = n - 2; i >= 0; i--)
            if (ratings[i] > ratings[i + 1])
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
        int sum = 0;
        for (int i : candies)
            sum += i;
        return sum;
    }
}
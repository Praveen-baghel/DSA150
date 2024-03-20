public class Solution274 {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int minH = 0, maxH = n;
        int mid, count, i, res = 0;
        while (minH <= maxH) {
            mid = (minH + maxH) / 2;
            count = 0;
            for (i = 0; i < n; i++) {
                if (citations[i] >= mid)
                    count++;
            }
            if (count >= mid) {
                res = mid;
                minH = mid + 1;
            } else
                maxH = mid - 1;
        }
        return res;
    }
}

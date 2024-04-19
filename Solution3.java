import java.util.HashMap;
import java.util.Map;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int result = Integer.MIN_VALUE;
        int st = 0, n = s.length();
        for (int e = 0; e < n; e++) {
            char ch = s.charAt(e);
            if (map.containsKey(ch)) {
                st = Math.max(map.get(ch) + 1, st);
            }
            result = Math.max(result, e - st + 1);
            map.put(ch, e);
        }
        return result;
    }
}

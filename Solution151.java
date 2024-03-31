public class Solution151 {
    public String reverseWords(String s) {
        s = s.trim();
        int n = s.length();
        StringBuilder result = new StringBuilder("");
        int start = n - 1, end = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (start != end) {
                    result.append(s.substring(start + 1, end + 1) + " ");
                    start = end = i - 1;
                } else {
                    start--;
                    end--;
                }

            } else {
                start--;
            }
        }
        if (start != end)
            result.append(s.substring(start + 1, end + 1));
        return result.toString();
    }
}

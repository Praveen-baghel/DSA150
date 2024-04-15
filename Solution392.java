public class Solution392 {
    public boolean isSubsequence(String s, String t) {
        int a = s.length(), b = t.length();
        if (a > b)
            return false;
        int i = 0, j = 0;
        while (i < a && j < b) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else
                j++;
        }
        return i == a;
    }
}

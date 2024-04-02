public class Solution28 {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        for (int i = 0; i + n <= haystack.length(); i++) {
            if (needle.equals(haystack.substring(i, i + n))) {
                return i;
            }
        }
        return -1;
    }
}

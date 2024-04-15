public class Solution125 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char a = s.charAt(i);
            char b = s.charAt(j);
            if (isAlphaNum(a) && isAlphaNum(b)) {
                if (!(a == b)) {
                    return false;
                }
                i++;
                j--;
            }
            if (!isAlphaNum(s.charAt(i)))
                i++;
            if (!isAlphaNum(s.charAt(j)))
                j--;
        }
        return true;
    }

    public boolean isAlphaNum(Character ch) {
        return Character.isLetterOrDigit(ch);
    }
}

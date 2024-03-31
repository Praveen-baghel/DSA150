public class Solution58 {
    public int lengthOfLastWord(String s) {
        int result = 0;
        boolean hasStarted = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                hasStarted = true;
                result++;
            } else {
                if (hasStarted) {
                    break;
                }
            }
        }
        return result;
    }
}

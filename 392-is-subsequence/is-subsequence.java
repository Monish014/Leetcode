class Solution {
    public boolean isSubsequence(String s, String t) {
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            int pos = t.indexOf(s.charAt(i), index);
            if (pos == -1) {
                return false;
            }
            index = pos + 1;
        }
        return true;
    }
}
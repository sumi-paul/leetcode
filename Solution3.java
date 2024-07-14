class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int r, l;
        for (r = 0, l = 0; r < s.length(); r++) {
            int idx = s.indexOf(s.charAt(r), l);
            if (idx != r)
                l = idx + 1;
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}

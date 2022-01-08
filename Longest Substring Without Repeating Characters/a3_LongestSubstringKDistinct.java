class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[128];
        for(int i = 0; i < 128; i++) {
            last[i] = -1;
        }
        int start = 0, res = 0, x = 0, n = s.length();
        for(int i = 0; i < n; i++) {
            x = s.charAt(i);
            start = Math.max(start, last[x] + 1);
            
            res = Math.max(res, i - start + 1);
            
            last[x] = i;
            
        }
        return res;
    }
}

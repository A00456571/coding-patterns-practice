//https://leetcode.com/problems/longest-substring-without-repeating-characters/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0||s.length()==1)
            return s.length();
        int max =0 ;
        int start = 0;
        HashSet<Character> hs = new HashSet<Character>();
        for(int end = 0;end<s.length();end++)
        {
            char c = s.charAt(end);
            while(hs.contains(c)&&start<s.length())
            {
                hs.remove(s.charAt(start++));
            }
                hs.add(c);
                max = Math.max(max,hs.size());
        }
        return max;
    }
}

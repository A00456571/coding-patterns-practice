class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0||s.length()==1)
            return s.length();
        int max =0 ;
        int start = 0;
        //HashSet<Character> hs = new HashSet<Character>();
        boolean ex[] = new boolean[96];
        char ch[] = s.toCharArray();
        for(int end = 0;end<s.length();end++)
        {
            while(ex[ch[end]-32]&&start<s.length())
            {
                ex[ch[start]-32] = false;
                start++;
            }
                ex[ch[end]-32] = true;
                max = Math.max(max,end-start+1);
        }
        return max;
    }
}

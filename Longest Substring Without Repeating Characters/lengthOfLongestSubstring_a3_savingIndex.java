class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0||s.length()==1)
            return s.length();
        int max =0 ;
        //HashSet<Character> hs = new HashSet<Character>();
        int ex[] = new int[128];
        //char ch[] = s.toCharArray();
        for(int end = 0,start = 0;end<s.length();end++)
        {
            if(ex[s.charAt(end)]>0)
            {
               start = Math.max(start,ex[s.charAt(end)]);//jadd repeat kru tadd nva index au us nal j nu compare kro to update window start
            }
                ex[s.charAt(end)] = end+1;
                max = Math.max(max,end-start+1);
        }
        return max;
    }
}

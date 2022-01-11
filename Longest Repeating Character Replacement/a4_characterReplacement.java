class Solution {
    public int characterReplacement(String s, int k) {
        if(s.length()==1)
            return 1;
        int start = 0;
        int[] fq = new int[26];
        int max = 0;
        int repeat = 0;
        char[] ch = s.toCharArray();
        for(int end =0;end<s.length();end++)
        {
            fq[ch[end]-'A']++;
            repeat = Math.max(repeat,fq[ch[end]-'A']);
            if(end-start+1-repeat>k)
            {
                fq[ch[start]-'A']--;
                start++;
            }
            else
                max = Math.max(max,end-start+1);
        }
        return max;
    }
}

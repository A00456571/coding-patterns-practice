class Solution {
    public int characterReplacement(String s, int k) {
        if(s.length()==1)
            return 1;
        int start = 0;
        Map<Character,Integer> hm = new HashMap<Character,Integer>();
        int max = 0;
        int repeat = 0;
        for(int end =0;end<s.length();end++)
        {
            char c = s.charAt(end);
            hm.put(c,hm.getOrDefault(c,0)+1);
            repeat = Math.max(repeat,hm.get(c));
            if(end-start+1-repeat>k)
            {
                char l = s.charAt(start++);
                hm.put(l,hm.get(l)-1);
            }
            max = Math.max(max,end-start+1);
        }
        return max;
    }
}

class Solution {
    public int characterReplacement(String s, int k) {
        if(s.length()==1)
            return 1;
        int start = 0;
        Map<Character,Integer> hm = new HashMap<Character,Integer>();
        int max = 0;
        int repeat = 0;
        char[] ch = s.toCharArray();
        for(int end =0;end<s.length();end++)
        {
            hm.put(ch[end],hm.getOrDefault(ch[end],0)+1);
            repeat = Math.max(repeat,hm.get(ch[end]));
            if(end-start+1-repeat>k)
            {
                hm.put(ch[start],hm.get(ch[start])-1);
                start++;
            }
            max = Math.max(max,end-start+1);
        }
        return max;
    }
}

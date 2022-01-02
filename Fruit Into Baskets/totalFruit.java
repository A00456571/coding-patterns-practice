class Solution {
    public int totalFruit(int[] fruits) {
        int max = 0;
        int start =0 ;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i = 0;i<fruits.length;i++)
        {
            hm.put(fruits[i],hm.getOrDefault(fruits[i],0)+1);
            while(hm.size()>2&&start<fruits.length)
            {
                hm.put(fruits[start],hm.get(fruits[start])-1);
                
                if(hm.get(fruits[start])==0)
                   hm.remove(fruits[start]);
                   
                start++;
            }
            max = Math.max(max,i-start+1);
        }
        return max;
        
    }
}

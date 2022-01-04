class Solution {
    public int totalFruit2(int[] fruits) {
        int n = fruits.length;
        if(n == 1 || n ==2)
            return n;
        //int max = 0;
        int maxl = Integer.MIN_VALUE;
        int len1 = 1;
        int len2 = 1;
        int b1 = fruits[0];
        int b2 = fruits[1];
       // HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i = 2;i<n;i++)
        {
            if(fruits[i]==b2)
            {
               len2++;
            }
            else
            {
                if(fruits[i]==b1)
                {
                    len1 = len1+len2;
                    len2 = 1;
                    
                }
                else
                {
                    if(b1==b2)
                    {
                        len1 = len1+len2;
                        len2 = 1;                       
                    }
                    else
                    {
                        len1 = len2;
                        len2 = 1;                        
                    }
                }
                b1 = b2;
                b2 = fruits[i];               
            }
            maxl = Math.max(maxl,len1 + len2);
            
//             hm.put(fruits[i],hm.getOrDefault(fruits[i],0)+1);
//             while(hm.size()>2&&start<fruits.length)
//             {
//                 hm.put(fruits[start],hm.get(fruits[start])-1);
                
//                 if(hm.get(fruits[start])==0)
//                    hm.remove(fruits[start]);
                   
//                 start++;
//             }
//             max = Math.max(max,i-start+1);
//         }
            //max = Math.max(max,i-start+1);
        }
        return maxl;
        
    }
}

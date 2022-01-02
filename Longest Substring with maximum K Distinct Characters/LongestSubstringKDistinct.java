import java.util.*;

class LongestSubstringKDistinct {
  public static int findLength(String str, int k) {
    // TODO: Write your code here
    if(str == null)
    return 0;
    if(str.length()<k)
    return 0;
    int maxSubLength = 0;
    int unique = 0;
    HashMap<Character, Integer> travelled = new HashMap<Character, Integer>();
    int windowStart = 0;
    for(int windowEnd = 0; windowEnd < str.length(); windowEnd++)
    {
      char c = str.charAt(windowEnd);
      travelled.put(c,travelled.getOrDefault(c,0)+1);

      while(travelled.size()>k)
      {
        char rem = str.charAt(windowStart);
        travelled.put(rem,travelled.get(rem)-1);
        if(travelled.get(rem)==0)
          travelled.remove(rem);
        windowStart++;
      }
      maxSubLength = Math.max(maxSubLength,windowEnd-windowStart+1);
    }
    return maxSubLength
   }
}

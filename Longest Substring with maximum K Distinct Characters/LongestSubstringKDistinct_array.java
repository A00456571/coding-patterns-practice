import java.util.*;

class LongestSubstringKDistinct {
  public static int findLength(String str, int k) {
    // TODO: Write your code here
    if (str == null || str.length() == 0 || str.length() < k)
      throw new IllegalArgumentException();
    int max = 0;
    int s = 0;
    int d = 0;
    int ch[] = new int[26];
    
    for(int i = 0;i<str.length();i++)
    {
      ch c = str.charAt(i);
      if(ch[c - 'a'] == 0)
        d++;
      
      ch[c - 'a']++;
      while(d>k&&s<str.length())
      {
        char x = str.charAt(s++);
        ch[x-'a']--;
        if(ch[x-'a'] == 0)
        d--;
      }
      max=Math.max(max,end-start+1);
    }
    return max;
  }
}

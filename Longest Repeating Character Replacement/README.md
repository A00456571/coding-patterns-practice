**Attempt 1 - 40ms**<br />
Approach <br />
This problem follows the Sliding Window pattern, and we can use a similar dynamic sliding window strategy as discussed in Longest Substring with Distinct Characters. We can use a HashMap to count the frequency of each letter.<br />

1.We will iterate through the string to add one letter at a time in the window.<br />
2.We will also keep track of the count of the maximum repeating letter in any window (let’s call it maxRepeatLetterCount).<br />
3.So, at any time, we know that we do have a window with one letter repeating maxRepeatLetterCount times; this means we should try to replace the remaining letters.<br />
      *``If the remaining letters are less than or equal to k, we can replace them all.``<br />
      *``If we have more than k remaining letters, we should shrink the window as we cannot replace more than k letters.``<br />

While shrinking the window, we don’t need to update maxRepeatLetterCount (hence, it represents the maximum repeating count of ANY letter for ANY window). Why don’t we need to update this count when we shrink the window? Since we have to replace all the remaining letters to get the longest substring having the same letter in any window, we can’t get a better answer from any other window even though all occurrences of the letter with frequency maxRepeatLetterCount is not in the current window.<br />

**Attempt 2 - 18ms**<br />
Accessed the string values using toCharArray conversion in place of charAt. The solution is faster than before.<br />
<br />

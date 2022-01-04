# #Attempt 1 - general solution for any number of baskets
* Longest contiguous substring with K distinct values
* Sliding Window
1. First calculate size of first window till k distinct reaches
2. When new element comes i.e. distinct > k then remove from start elements till distinct is k.
3. max = Math.max(max,i-start+1)

Time Complexity#
The above algorithm’s time complexity will be O(N), where ‘N’ is the number of characters in the input array. The outer for loop runs for all characters, and the inner while loop processes each character only once; therefore, the time complexity of the algorithm will be O(N+N), which is asymptotically equivalent to O(N).

Space Complexity#
The algorithm runs in constant space O(1) as there can be a maximum of three types of fruits stored in the frequency map.

# #Attempt 3 - specific to 2 baskets
Better soln(On ,O1)
Loop all fruit c in tree,
Note that a and b are the last two different types of fruit that we met,
c is the current fruit type,
so it's something like "....aaabbbc..."

Case 1 c == b:
fruit c already in the basket,
and it's same as the last type of fruit
cur += 1
count_b += 1

Case 2 c == a:
fruit c already in the basket,
but it's not same as the last type of fruit
cur += 1
count_b = 1
a = b, b = c

Case 3 c != b && c!= a:
fruit c not in the basket,
cur = count_b + 1
count_b = 1
a = b, b = c

Of course, in each turn we need to update res = max(res, cur)

package Pattern2_SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringwithKUniques {


	public static int longestSubstringwithKUniques(String s, int k) {

		int low=0;
		int result=-1;
		int n = s.length();
		
		Map<Character,Integer> mp = new HashMap<>();
		
		for(int high=0 ; high < n ; high++)
		{
			char c=s.charAt(high);
			
			mp.put(c , mp.getOrDefault(c, 0)+1);
			
			while(mp.size() > k)
			{
				char leftMost = s.charAt(low);
				mp.put(leftMost, mp.get(leftMost)-1);
				
				if(mp.get(leftMost)==0)
				{
					mp.remove(leftMost);
				}
				
				low++;
			}
			
			if(mp.size()==k)
			{
				int len = high-low+1;
				result = Math.max(result, len);
			}
		}
		return result;
	}






	public static void main(String[] args)
	{

		String s = "aabacbebebe";

		int k=3;

		int ans = longestSubstringwithKUniques(s,k);
		
		System.out.println("Answer : "+ ans);

	}


}



/*
 You are given a string s consisting only lowercase alphabets and an integer k. Your task is to find the length of the longest substring that contains exactly k distinct characters.

Note : If no such substring exists, return -1. 

Examples:

Input: s = "aabacbebebe", k = 3
Output: 7
Explanation: The longest substring with exactly 3 distinct characters is "cbebebe", which includes 'c', 'b', and 'e'.
Input: s = "aaaa", k = 2
Output: -1
Explanation: There's no substring with 2 distinct characters.
 */


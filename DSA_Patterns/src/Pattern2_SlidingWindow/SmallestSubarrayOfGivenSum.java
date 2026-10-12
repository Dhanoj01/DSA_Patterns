package Pattern2_SlidingWindow;

public class SmallestSubarrayOfGivenSum {


	public static int smallSubarray(int target , int nums[])
	{

		int ans = 0 ;

		int high =0;
		int low=0;
		int minWindow=Integer.MAX_VALUE;


		for(high=0 ; high<nums.length ; high++)
		{

			ans = ans + nums[high];

			while(ans >= target)
			{
				
				int len = high - low + 1;
				minWindow = Math.min(minWindow, len);

				ans = ans-nums[low];
				low++;
			}

		}

		return minWindow == Integer.MAX_VALUE ? 0:minWindow;

	}




	public static void main(String args[])
	{
		int target = 7;

		int nums[] = {2,3,1,2,4,5};

		int ans = smallSubarray(target , nums);

		System.out.println(ans);
	}

}



/*
 Example 1:
Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.

Example 2:
Input: target = 4, nums = [1,4,4]
Output: 1

Example 3:
Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0
 */


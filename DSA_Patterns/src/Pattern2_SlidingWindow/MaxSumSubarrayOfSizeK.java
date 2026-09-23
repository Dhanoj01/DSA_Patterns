package Pattern2_SlidingWindow;

public class MaxSumSubarrayOfSizeK {
	
	//int arr[]={100,200,300,400}
	//fixed window k=2;
	
	public static void main(String args[])
	{
		int arr[] = {100,200,300,400};
		int k=2;
		int low = 0;
		int high = k-1;
		int n = arr.length;
		
		int sum = 0;
		
		for(int i=0 ; i<=high ; i++)
		{
			sum = sum + arr[i];
		}
		
		int res = sum;
		
		while(high < n-1)
		{
	
			
			sum = sum-arr[low];
			low++;
			high++;
			
			sum = sum+arr[high];
			
			res = Math.max(res,sum);
		}
		
		System.out.println("Max sum of subarray of size K : "+ res);
		
	}

};

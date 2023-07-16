//{ Driver Code Starts
import java.util.*;
class Triplets{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Solution g=new Solution();
			if(g.findTriplets(a,n))
				System.out.println("1");
			else
				System.out.println("0");
			
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/


class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        Arrays.sort(arr);
        int flag=0;
      for(int i=0;i<n;i++){
          int j=i+1;
          int k=n-1;
          while(j<k){
              if(arr[i]+arr[j]+arr[k]==0){
                  j++;
                  k--;
                  flag=1;
              }else if(arr[i] + arr[j] +  arr[k] <0){
                  j++;
              }else{
                  k--;
              }
          }
      }
      if(flag==1)
        return true;
      
      return false;
    }
}
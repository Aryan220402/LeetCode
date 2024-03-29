//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int arr[], int size)
    {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<size;i++){
           if(!map.containsKey(arr[i])){
               map.put(arr[i],1);
           }else{
               map.put(arr[i],map.get(arr[i])+1);
           }
       }
       int max=(Collections.max(map.values()));
       if(max>size/2){
           for(Map.Entry<Integer,Integer> entry:map.entrySet()){
               if(entry.getValue()==max){
                   return entry.getKey();
               }
           }
       }
       return -1;
    }
}
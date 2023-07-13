//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] arr = IntArray.input(br, n);
            
            Solution obj = new Solution();
            boolean res = obj.isFrequencyUnique(n, arr);
            
            int _result_val = (res) ? 1 : 0;
            System.out.println(_result_val);
        }
    }
}

// } Driver Code Ends



class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
         HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<n;i++){
           if(!map.containsKey(arr[i])){
               map.put(arr[i],1);
           }else{
               map.put(arr[i],map.get(arr[i])+1);
           }
       }
    //   HashMap<Integer,Integer> map1=new HashMap<>();
        HashSet<Integer> uniqueFreq = new HashSet<Integer>();
 
    // Check whether frequency of any
    // two or more elements are same
    // or not. If yes, return false
    for(Map.Entry<Integer,
                  Integer> i : map.entrySet())
    {
        if (uniqueFreq.contains(i.getValue()))
            return false;
        else
            uniqueFreq.add(i.getValue());
    }
 
    // Return true if each
    // frequency is unique
    return true;
    //     for(Map.Entry<Integer,Integer> entry:map.entrySet()){
    //           if(entry.getValue()>1){
                    
    //          if(!map1.containsKey(entry.getValue())){
    //           map1.put(entry.getValue(),1);
    //       }
    //       else{
    //           map1.put(entry.getValue(),map1.get(entry.getValue())+1);
    //       }
           
    //           }
    //       }
           
    //   for(Map.Entry<Integer,Integer> entry:map1.entrySet()){
    //       if(entry.getValue()>1){
    //           return false;
    //       }
    //   }
    //   return true;
    }
}
        

//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     Solution obj = new Solution();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 }
	 }
}
// } Driver Code Ends


class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        // Your code here
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<line.length();i++){
            if(!map.containsKey(line.charAt(i))){
                map.put(line.charAt(i),1);
            }else{
                map.put(line.charAt(i),map.get(line.charAt(i))+1);
            }
        }
        int max=Collections.max(map.values());
        char ans = '\0';
        ArrayList<Character> list = new ArrayList<>();
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() == max){
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        ans = list.get(0);
        return ans;
    }

}
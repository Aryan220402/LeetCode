class Solution {
    public boolean isHappy(int n) {
        List<Integer>list= new ArrayList<Integer>();
        while(n!=1){
            int tmp = n;
            n=0;
            while(tmp>0){
                n=n+(int) Math.pow((tmp%10),2);
                
                tmp = tmp/10;
            }
            if(list.contains(n)){
                return false;
            }
            else{
                list.add(n);    
            }
        }
         return true; 
    }
}

class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1=(ax2-ax1)*(ay2-ay1);
        int area2=(bx2-bx1)*(by2-by1);
        int area =area1+area2;
        int b=Math.min(ax2, bx2)-Math.max(ax1, bx1);
        if(b<=0){
            return area;
        }
        int l=Math.min(ay2, by2)-Math.max(ay1, by1);
        if(l<=0){
            return area;
        }
        int area3=l*b;
        
        return area-area3;
        }
    
}
class Solution {
    // O(N^2) Approach
    // public int maxArea(int[] height) {
    //      int max=0;
    //     for (int i=0;i<height.length;i++){
    //         for (int j=i+1;j<height.length;j++){
    //             max=Math.max(max,Math.min(height[i],height[j])*(j-i));
    //         }
    //     }
    //     return max;
    // }
    
    public int maxArea(int[] height) {
         int l=0,r=height.length-1,max=0;
        max=Math.max(max,Math.min(height[l],height[r])*(r-l));
       while(l<r){
           if(height[l]<=height[r]){
               l++;
           }else{
               r--;
           }
           max=Math.max(max,Math.min(height[l],height[r])*(r-l));
       }
        return max;
    }
}
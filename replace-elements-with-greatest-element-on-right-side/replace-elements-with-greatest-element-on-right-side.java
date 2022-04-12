class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int[] max=new int[n];
        max[n-1]=-1;
        for(int i=n-1;i>0;i--){
            max[i-1]=Math.max(max[i],arr[i]);
        }
        return max;
    }
}
// arr = [17,18,5,4,6,1]
// Output: [18,6,6,6,1,-1]
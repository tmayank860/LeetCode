class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0;
        while(i<m&&j<n){
            if(nums1[i]<=nums2[j]){
                i++;
            }else if(nums1[i]>nums2[j]){
               swap(nums1,nums2,i,j);
                int c=j;
                while(c<n-1&&nums2[c]>nums2[c+1]){
                    swap(nums2,nums2,c,c+1);
                    c++;
                }
                i++;
            }
        }
        for(j=0;j<n;j++){
            nums1[j+m]=nums2[j];
        }
    }
    void swap(int[] nums1,int[] nums2,int i,int j){
         int temp=nums1[i];
                nums1[i]=nums2[j];
                nums2[j]=temp;
    }
}
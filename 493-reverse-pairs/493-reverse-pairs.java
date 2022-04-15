class Solution {
  public static int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
    static int merge(int[] arr, int low, int mid, int high) {
        int count=0;
        int j=mid+1;
        for (int i=low;i<=mid;i++){
            while (j<=high&&arr[i]>2*(long)arr[j]){
                j++;
            }
            count=count+(j-mid-1);
        }
        ArrayList<Integer> ls=new ArrayList<>();
        int left=low,right=mid+1;
        while (left<=mid&&right<=high){
            if (arr[left]<=arr[right]){
                ls.add(arr[left++]);
            }else {
                ls.add(arr[right++]);
            }
        }
        while (left<=mid){
            ls.add(arr[left++]);
        }
        while (right<=high){
            ls.add(arr[right++]);
        }
        for (int i=low;i<=high;i++){
            arr[i]=ls.get(i-low);
        }
        return count;
    }

    static int mergeSort(int[] arr, int low, int high) {
        if (low>=high)return 0;
        int mid=(low+high)/2;
        int interval=mergeSort(arr,low,mid);
        interval+=mergeSort(arr,mid+1,high);
        interval+=merge(arr,low,mid,high);
        return interval;
    }
}
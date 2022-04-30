class Solution {
    public int minimumAverageDifference(int[] nums) {
          int sum=0,n =nums.length;
       long[] left=new long[n];
        long[] right=new long[n];
        left[0]=nums[0];
        right[n-1]=0;
        for(int i=1;i<nums.length;i++){
            left[i]=left[i-1]+nums[i];
        }
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]+nums[i+1];
        }
        System.out.println(Arrays.toString(left)+" "+Arrays.toString(right));
        for(int i=0;i<n;i++){
            if(i!=n-1){
                nums[i]= (int) Math.abs(left[i]/(i+1)-right[i]/(n-i-1));
            }else {
                nums[i]= (int) Math.abs(left[i]/(i+1)-right[i]);
            }
        }
        int min=nums[0],res=0;
        for (int i=0;i<n;i++){
            if (nums[i]<min){
                min=nums[i];
                res=i;
            }
        }
     
        return res;
    }
}
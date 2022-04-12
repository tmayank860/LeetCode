class Solution {
    public void duplicateZeros(int[] arr) {
         int[] res=new int[arr.length];
        int c=0,i=0,j=0;
        while(j<arr.length&&i<arr.length){
            if(arr[i]==0){
                res[j]=0;
                ++j;
                if(j<arr.length) {
                    res[j] = 0;
                }
                i++;
                j++;
            }else{
                res[j]=arr[i];
                j++;
                i++;
            }
        }
        for(i=0;i<arr.length;i++){
            arr[i]=res[i];
        }
    }
}
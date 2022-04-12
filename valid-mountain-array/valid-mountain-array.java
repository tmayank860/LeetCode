class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3){
            return false;
        }
        int dec=0,inc=0;
        while(inc<arr.length-1){
            if(arr[inc]<arr[inc+1]){
                inc++;
            }else if(arr[inc]==arr[inc+1]){
                return false;
            }else{
                dec=inc;
                break;
            }
        }
        if(dec==0){
            return false;
        }
        while(dec<arr.length-1){
            if(arr[dec]>arr[dec+1]){
                dec++;
            }else{
                return false;
            }
        }
       return true;
    }
   
}
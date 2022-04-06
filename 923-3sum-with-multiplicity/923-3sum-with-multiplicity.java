class Solution {
    
     public int threeSumMulti(int[] arr, int target) {

        long count=0;
        long[] counts = new long[101];
        for(int i=0;i<arr.length;i++){
                counts[arr[i]]++;
            }
        for (int i=0;i<101;i++){
            for (int j=i;j<101;j++){
                int k=target-i-j;
                if(k<0||k>100){
                    continue;
                }
                if (i==j&&j==k){
                    count+=counts[i]*(counts[i]-1)*(counts[i]-2)/6;
                }else if (i==j&&j!=k){
                    count+=counts[i]*(counts[i]-1)/2*counts[k];
                }else if (i<j&&j<k){
                    count+=counts[i]*counts[j]*counts[k];
                }
            }
        }
       
        return (int)(count%(1e9 + 7));
    }
    
    
//     public int threeSumMulti(int[] arr, int target) {
//         if(arr.length<=2){
//             return 0;
//         }
        
//         int count=0;
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr.length;j++){
//                 for(int k=0;k<arr.length;k++){
//                     if(i<j&&j<k){
//                         if(arr[i]+arr[j]+arr[k]==target){
//                             count++;
//                         }
//                     }
//                 }
//             }
//         }
//         return count;
//     }
}
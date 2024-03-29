// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        // code here
        int[]positive=new int[n];
        int[]negative=new int[n];
        int pos=0,neg=0,j=0,k=0;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                negative[neg++]=arr[i];
            }else{
                positive[pos++]=arr[i];
            }
        }
        int i=0;
        while(j<pos&&k<neg){
            arr[i]=positive[j++];
            arr[++i]=negative[k++];
            i++;
        }
         while (k<neg){
            arr[i++]=negative[k++];
        }
        while (j<pos){
            arr[i++]=positive[j++];
        }
    }
}
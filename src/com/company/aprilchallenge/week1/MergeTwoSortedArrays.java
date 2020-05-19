package com.company.aprilchallenge.week1;

public class MergeTwoSortedArrays {
    public static void main(String[] args) throws Exception {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 5,6};
        inPlaceMerge(arr1, 3, arr2, 3);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[n + m];
        int i = 0, n1 = 0, n2 = 0;
        if (n > m) {
            for (i = 0; i < m; i++) {
                if (nums1[n1] > nums2[n2]) {
                    result[i] = nums2[n2];
                    n2++;
                } else {
                    result[i] = nums1[n1];
                    n1++;
                }
            }

        } else {
            for (i = 0; i < n; i++) {
                if (nums1[n1] > nums2[n2]) {
                    result[i] = nums2[n2];
                    n2++;
                } else {
                    result[i] = nums1[n1];
                    n1++;
                }
            }
        }
        while (i < (n + m)) {
            if (n1 == m) {
                result[i++] = nums2[n2++];

            } else {
                result[i++] = nums1[n1++];
            }
        }
        for (int j = 0; j < n + m; j++) {
            System.out.print(result[j] + " ");
        }
    }

    public static void inPlaceMerge(int[] nums1, int m, int[] nums2, int n) throws Exception {
//        int i=m-1,j=n-1,current=n+m-1;
//        while (i>=0&&j>=0){
//            if (nums1[i]>=nums2[j]){
//                nums1[current--]=nums1[i--];
//            }else {
//                nums1[current--]=nums2[j--];
//            }
//        }
//        while (j>=0){
//            nums1[current--]=nums2[j--];
//        }
        int i1 = m - 1, i2 = n - 1, pos = m + n - 1;
        while(i1 >= 0 && i2 >= 0) {
            if(nums1[i1] >= nums2[i2]) {
                nums1[pos--] = nums1[i1--];
            } else {
                nums1[pos--] = nums2[i2--];
            }
        }
        while(i2 >= 0) {
            nums1[pos--] = nums2[i2--];
        }
        for (int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]+" ");
        }
    }
}

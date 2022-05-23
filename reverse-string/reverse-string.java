class Solution {
    public void reverseString(char[] s) {
        int l=0,r=s.length-1;
        reverse(s,l,r);
    }
    void reverse(char[] s,int l,int r){
        if(l>=r){
            return;
        }
        swap(s,l,r);
        reverse(s,l+1,r-1);
    }
    static void swap(char[] s,int l,int r){
        char temp=s[l];
        s[l]=s[r];
        s[r]=temp;
    }
}
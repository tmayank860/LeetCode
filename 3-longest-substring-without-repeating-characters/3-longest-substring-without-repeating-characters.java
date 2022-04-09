class Solution {
    public int lengthOfLongestSubstring(String s) {
         if(s.length() <=1){
            return s.length();
        }
        int left=0,right=s.length(),current=1;
        int max=Integer.MIN_VALUE;
        while(current<right){
            if((s.substring(left,current)+"").contains(Character.toString(s.charAt(current)))){
               max=Math.max(max,(current-left));
                left++;
            }else{
                current++;
            }
        }
        if(max<0){
            max=current;
        }else{
            max=Math.max(max,(current-left));
        }
        
        return max;
    }
}
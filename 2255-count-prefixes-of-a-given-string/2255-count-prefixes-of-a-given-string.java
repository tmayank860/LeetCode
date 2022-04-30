class Solution {
    public int countPrefixes(String[] words, String s) {
        int count=0;
        for(int i=0;i<words.length;i++){
            String current=words[i];
            if(current.charAt(0)==s.charAt(0)&&current.length()<=s.length()){
                int idx=0,flag=1;
                while(idx<current.length()){
                    if(current.charAt(idx)!=s.charAt(idx)){
                        flag=0;
                    }
                    idx++;
                }
                if(flag==1){
                    count++;
                }
            }
        }
        return count;
    }
}
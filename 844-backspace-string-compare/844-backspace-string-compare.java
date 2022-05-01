class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1="",t1="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                s1+=s.charAt(i)+"";
            }else if(s1.length()>0){
                s1=s1.substring(0,s1.length()-1);
            }
        }
           for(int i=0;i<t.length();i++){
            if(t.charAt(i)!='#'){
                t1+=t.charAt(i)+"";
            }else if(t1.length()>0){
                t1=t1.substring(0,t1.length()-1);
            }
        }
        if(s1.equals(t1)){
            return true;
        }
        return false;
    }
}
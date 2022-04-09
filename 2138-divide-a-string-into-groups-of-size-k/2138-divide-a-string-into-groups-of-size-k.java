class Solution {
    public String[] divideString(String s, int k, char fill) {
        ArrayList<String> ls=new ArrayList<>();
        int idx=0;
        String res="";
        while(idx+k<s.length()+1){
            res=s.substring(idx,idx+k);
            ls.add(res);
            idx=idx+k;
        }
        res="";
        while(idx<s.length()){
            res+=s.charAt(idx);
            idx++;
        }
        while(res.length()>=1&&res.length()<k){
            res+=fill;
        }
        if(res!=""){
            ls.add(res);
        }
        String[] r=new String[ls.size()];
        for(int i=0;i<ls.size();i++){
            r[i]=ls.get(i);
        }
        return r;
    }
}
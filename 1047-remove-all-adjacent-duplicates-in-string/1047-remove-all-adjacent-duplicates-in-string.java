class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> ch=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!ch.isEmpty()&&ch.peek()==s.charAt(i)){
                while(!ch.isEmpty()&&ch.peek()==s.charAt(i)){
                ch.pop();
                }
            }
        else{
            ch.push(s.charAt(i));
        }
        }
        String res="";
        while(!ch.isEmpty()){
            res=ch.pop()+res;
        }
        return res;
    }
}
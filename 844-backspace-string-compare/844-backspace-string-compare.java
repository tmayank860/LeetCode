// class Solution {
//     public boolean backspaceCompare(String s, String t) {
//         String s1="",t1="";
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)!='#'){
//                 s1+=s.charAt(i)+"";
//             }else if(s1.length()>0){
//                 s1=s1.substring(0,s1.length()-1);
//             }
//         }
//            for(int i=0;i<t.length();i++){
//             if(t.charAt(i)!='#'){
//                 t1+=t.charAt(i)+"";
//             }else if(t1.length()>0){
//                 t1=t1.substring(0,t1.length()-1);
//             }
//         }
//         if(s1.equals(t1)){
//             return true;
//         }
//         return false;
//     }
// }

class Solution {
    public boolean backspaceCompare(String S, String T) {
        int i = S.length() - 1, j = T.length() - 1;
        int skipS = 0, skipT = 0;

        while (i >= 0 || j >= 0) { // While there may be chars in build(S) or build (T)
            while (i >= 0) { // Find position of next possible char in build(S)
                if (S.charAt(i) == '#') {skipS++; i--;}
                else if (skipS > 0) {skipS--; i--;}
                else break;
            }
            while (j >= 0) { // Find position of next possible char in build(T)
                if (T.charAt(j) == '#') {skipT++; j--;}
                else if (skipT > 0) {skipT--; j--;}
                else break;
            }
            // If two actual characters are different
            if (i >= 0 && j >= 0 && S.charAt(i) != T.charAt(j))
                return false;
            // If expecting to compare char vs nothing
            if ((i >= 0) != (j >= 0))
                return false;
            i--; j--;
        }
        return true;
    }
}
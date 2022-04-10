class Solution {
    public int calPoints(String[] ops) {
        ArrayList<String> ls=new ArrayList<>();
        int idx=0;
        for(int i=0;i<ops.length;i++){
            if(ops[i].equals("C")){
                ls.remove(idx-1);
                idx--;
            }else if(ops[i].equals("D")){
                String s=ls.get(idx-1);
                ls.add((Integer.parseInt(s)*2)+"");
                idx++;
            }else if(ops[i].equals("+")){
                ls.add((Integer.parseInt(ls.get(idx-1))+Integer.parseInt(ls.get(idx-2)))+"");
                idx++;
            }else if(!ops[i].equals("C") && !ops[i].equals("D") && !ops[i].equals("D")){
                ls.add(ops[i]);
                idx++;
            }
        }
        System.out.println(ls);
        int res=0;
         for(int i=0;i<ls.size();i++){
           
             res+=Integer.parseInt(ls.get(i));
        
         }
        return res;
    }
}
class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> ls=new ArrayList<>();
            int x=0;
            while(x<=i){
                if(x==0||x==i){
                    ls.add(1);
                }else{
                    ls.add(res.get(i-1).get(x-1)+res.get(i-1).get(x));
                }
                x++;
            }
            res.add(ls);
        }
        return res;
    }
}
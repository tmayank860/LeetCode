class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer> even =new  PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> odd = new PriorityQueue<>(Collections.reverseOrder());
        boolean flag=false;
        int n=num,idx=0;
        while(n!=0){
            int temp=n%10;
            if(temp%2==0){
                even.add(temp);
            }else{
                odd.add(temp);
            }
            n=n/10;
        }
        String s=num+"";
        String res="";
        while(idx<s.length()){
            if(Integer.parseInt(s.charAt(idx)+"")%2==0){
                res+=even.poll()+"";
            }else{
                res+=odd.poll()+"";
            }
            idx++;
        }
        
        return Integer.parseInt(res);
    }
}
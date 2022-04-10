class Solution {
    public int largestInteger(int num) {
	//Priority Queue to split even odd values from the given number
        PriorityQueue<Integer> even =new  PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> odd = new PriorityQueue<>(Collections.reverseOrder());
        boolean flag=false;
        int n=num,idx=0;
		//this while loop will add the numbers in priority queue
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
		// here adding max(even or odd) number from priority queue to the result based on the number previously present at the same index
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
class Solution {
    public int minMoves(int target, int maxDoubles) {
        int count=0;
        while(target!=1){
            if(target%2==0&&maxDoubles>0){
                target/=2;
                maxDoubles--;
                count++;
            }else if(target%2!=0&&maxDoubles>0){
                target-=1;
                count++;
            }
            else if(maxDoubles==0){
                target-=1;
                count+=target;
                break;
            }
        }
        return count;
    }
}
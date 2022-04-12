class Solution {
    public void gameOfLife(int[][] board) {
        int[][]res= new int[board.length][board[0].length];
        
    for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                int count=countNeighbors(board,i,j);
                if(board[i][j]==1&&count<2){
                    res[i][j]=0;
                }else if(board[i][j]==1&&count==2||count==3){
                    res[i][j]=1;
                }else if(board[i][j]==1&&count>3){
                    res[i][j]=0;
                }else if(board[i][j]==0&&count==3){
                    res[i][j]=1;
                }
            }
        }
         for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j]=res[i][j];
            }
         }

    }
    public static int count(int[][] arr, int i, int j){
        if(i <0 || i>=arr.length || j<0 || j>=arr[0].length){
            return 0;
        }
        return arr[i][j];
    }
    public static int countNeighbors(int[][]arr, int i, int j){
        int res = 0;
        res += count(arr,i-1,j-1);
        res += count(arr,i-1,j);
        res += count(arr,i-1,j+1);
        res += count(arr,i,j-1);
        res += count(arr,i,j+1);
        res += count(arr,i+1,j-1);
        res += count(arr,i+1,j);
        res += count(arr,i+1,j+1);
        return res;
    }
}
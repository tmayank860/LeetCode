class Solution {
    List<List<String>> result;
    public List<List<String>> solveNQueens(int n) {
        result=new ArrayList<>();
        char[][] board=new char[n][n];
        for(char[] row:board){
            Arrays.fill(row,'.');
        }
        List<int[]> queens=new ArrayList<>();
        dfs(board,0,queens);
        return result;
    }
    
     void dfs(char[][] board, int r, List<int[]> queens){
        if(queens.size()==board.length){
            List<String> ls=new ArrayList<>();
            for(char[] row:board){
                ls.add(new String(row));
            }
            result.add(ls);
        }
        for(int c=0;c<board.length;c++){
           if(validPos(r,c,queens)){
                board[r][c]='Q';
            queens.add(new int[] {r,c});
            dfs(board,r+1,queens);
            board[r][c]='.';
            queens.remove(queens.size()-1);
           }
        }
    }
    boolean validPos(int r,int c, List<int[]> queens){
        for(int[] q:queens){
            int dx=Math.abs(r-q[0]);
            int dy=Math.abs(c-q[1]);
            if(dx==0||dy==0||dx==dy){
                return false;
            }
        }
        return true;
    }
}
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int r=matrix.length,c=matrix[0].length;
        int currentX=0,currentY=matrix[0].length-1;
        while (currentX<r&&currentY>=0){
            if (matrix[currentX][currentY]==target){
                return true;
            }else if(matrix[currentX][currentY]>target){
                currentY--;
            }else {
                currentX++;
            }
        }
        return false;
    }
}
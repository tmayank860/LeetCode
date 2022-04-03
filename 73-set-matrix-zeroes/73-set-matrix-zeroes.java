class Solution {
    
    
    public void setZeroes(int[][] matrix) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            res.add(new ArrayList<>());
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    res.get(i).add(j);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            if (!res.get(i).isEmpty()) {

                for (int j = 0; j < res.get(i).size(); j++) {
                    int row = i, col = res.get(i).get(j), r = 0, c = 0;
                    while (c < matrix[row].length) {
                        matrix[row][c] = 0;
                        c++;
                    }
                    while (r < matrix.length) {
                        matrix[r][col] = 0;
                        r++;
                    }
                }

            }
        }

        System.out.println(res);
        
    }
    
}
class Solution {
    public int[][] transpose(int[][] matrix) {
        
        int[][] ans=new int[matrix[0].length][matrix.length];
        for(int r =0; r<matrix.length;r++){
            for(int c=0 ;c<matrix[0].length;c++){
               ans[c][r] = matrix[r][c];
        
            //    int temp = matrix[i][j];
            //     matrix[i][j] = matrix[j][i];
            //     matrix[j][i] = temp;
            }
        }
        return ans;
    }
}
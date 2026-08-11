class Solution {
    public void rotate(int[][] matrix) {
           
           int m = matrix.length-1;
           int [][] newmat = new int [matrix.length][matrix[0].length];
           for(int i = 0 ; i<matrix.length ; i++){
               for(int j = 0 ; j<matrix[i].length ; j++){
                   newmat[j][i] = matrix[m][j];
               }
               m--;
           }

           for(int i = 0 ; i<matrix.length ; i++){
            for(int j = 0 ; j<matrix[i].length ; j++){
                matrix[i][j]=newmat[i][j];
            }
           }
     
    }
}
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int i = 0;
        int j = 0;
        int x = mat[0].length-1;
        if(mat.length == 1)
        {
            return mat[0][0];
        }
        while(i<mat.length && j<mat[0].length){
            sum += mat[i][j]+mat[i][x];
            i++;
            j++;
            x--;
            if(j == x){
                sum-=mat[i][j];
            }
        }
        return sum;
    }
}
class Solution {
    public void rotate(int[][] matrix) {
       for(int i=0;i<matrix.length;i++){
           for(int j=i;j<matrix[0].length;j++){

               int temp = matrix[i][j];
               matrix[i][j] = matrix[j][i];
               matrix[j][i] = temp;

           }
       }
        for(int i=0;i<matrix.length;i++){
            reverse(matrix,i);
        }




    }

    public void reverse(int[][] matrix,int row){
        int st = 0,en = matrix[0].length-1;
        while(st<en){
            int temp = matrix[row][st];
               matrix[row][st] = matrix[row][en];
               matrix[row][en] = temp;
               st++;
               en--;
        }
    }
}
class Solution {

    public void setZeroes(int[][] a) {
       
       int row = a.length;
       int col = a[0].length;
        int val = -20;
        for(int i = 0;i<row;i++){
            for(int j=0;j<col;j++){
                
                if(a[i][j]==0){
                    
                    for(int r=0;r<row;r++)
                        a[r][j] = a[r][j] != 0? val : a[r][j] ;
                    for(int c=0;c<col;c++)
                        a[i][c] = a[i][c] != 0? val : a[i][c] ;
                }
            }
        }

        for(int i = 0;i<row;i++){
            for(int j=0;j<col;j++){
               if(a[i][j] == val)
                  a[i][j] = 0;
            }
        }


    }
}
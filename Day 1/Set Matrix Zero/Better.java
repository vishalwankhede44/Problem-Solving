class Solution {

    

    public void setZeroes(int[][] a) {
       
       int r = a.length;
       int c = a[0].length;
       int row[] = new int[r];
       int col[] = new int[c];

       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               if(a[i][j]==0)
                    row[i] = col[j] = 1;
           }
       }

       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               if(row[i]==1 || col[j]==1)
                    a[i][j] = 0;

           }
       }
       

       


    }
}
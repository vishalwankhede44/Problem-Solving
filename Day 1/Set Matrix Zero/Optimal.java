class Solution {

    

    public void setZeroes(int[][] a) {
       
       int r = a.length;
       int c = a[0].length;
       int col0 = 1;
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               if(a[i][j]==0){
                   a[i][0] = 0;
                   
                  if(j!=0)
                     a[0][j] = 0;
                  else
                     col0 = 0;
               }    
           }
       }

       for(int i=1;i<r;i++){
           for(int j=1;j<c;j++){
               if(a[i][j]!=0){
                 if(a[i][0] == 0 || a[0][j]==0)
                    a[i][j] = 0;
               }
           }
       }

       if(a[0][0] == 0){
           for(int j=0;j<c;j++)
            a[0][j] = 0;
       }

       if(col0 == 0){
           for(int i=0;i<r;i++){
               a[i][0] = 0;
           }
       }
       

       


    }
}
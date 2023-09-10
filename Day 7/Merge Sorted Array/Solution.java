class Solution {
   
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       
       int len = n+m;
       
       for(int i=m,j=0;i<len;i++,j++){
           nums1[i] = nums2[j];
       } 

       int gap = len/2 + len%2;

       while(gap>0){

           int left = 0;
           int right = left+gap;

           while(right<len){
               if(nums1[left] > nums1[right]){
                   swap(nums1,left,right);
               }
                left++;
                right++;
           }
           
           if(gap==1) break;
           
           gap = gap/2 + gap%2;
       }


    }

    public void swap(int[] nums1,int n1, int n2){
        int temp = nums1[n1];
        nums1[n1] = nums1[n2];
        nums1[n2] = temp;
    }
}
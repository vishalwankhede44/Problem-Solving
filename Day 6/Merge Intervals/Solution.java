class Solution {
    public int[][] merge(int[][] intervals) {
       
       Arrays.sort(intervals, new Comparator<int[]>(){
           public int compare(int[] a,int[] b){
               return a[0]-b[0];
           }
       });
    
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<intervals.length;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];

            if(!ans.isEmpty() && end <= ans.get(ans.size()-1).get(1)){
                continue;
            }

            for(int j=i+1;j<intervals.length;j++){
                if(end >= intervals[j][0]){
                    end = Math.max(intervals[j][1],end);
                }else{
                    break;
                }
            }

            ans.add(Arrays.asList(start,end));
        }
       

        return ans;

        
    }
}
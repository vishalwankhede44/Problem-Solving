class Solution {

    public List<Integer> generateRow(int n){
        List<Integer> list = new ArrayList<>();
        int res=1;
        list.add(res);
        for(int i=1;i<n;i++){
            res = res * (n-i);
            res = res/(i);
            list.add(res);
        }
        return list;
    }


    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
       
        for(int i=1;i<=numRows;i++){
            ans.add(generateRow(i));
        }
        return ans;
    }
}
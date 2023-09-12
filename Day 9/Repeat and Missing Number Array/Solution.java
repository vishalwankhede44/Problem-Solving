public class Solution {
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {

        int n = A.size(); 
        int Sn = (n * (n+1))/2;
        int S2n = (n*(n+1)*(2*n+1))/6;
        
        int S=0,S2 = 0;
        for(int i=0;i<n;i++){
            S += A.get(i);
            S2 += A.get(i) * A.get(i);
        }
        
        int val1 = S - Sn;
        int val2 = S2 - S2n;
        val2 = val2/val1;
        int x = (val1+val2)/2;
        int y = x - val1;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(x);
        ans.add(y);
        
        return ans;        
    }
}

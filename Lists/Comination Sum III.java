// Find all valid combinations of k numbers that sum up to n such that the following conditions are true:

// Only numbers 1 through 9 are used.
// Each number is used at most once.
// Return a list of all possible valid combinations. The list must not contain the same combination twice, and the combinations may be returned in any order.

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        LinkedList<Integer> comb= new LinkedList<Integer>();
        this.backtrack(n, k, comb, 0, res);
        return res;
    }
protected void backtrack(int remain,int k,LinkedList<Integer> comb,int next_start,List<List<Integer>> res){
    if((remain == 0) && (comb.size() == k))
    {
        res.add(new ArrayList<Integer>(comb));
        return;
    }
    else if (remain < 0 || comb.size() == k)
    {
        return;
    }
    for(int i = next_start ; i < 9 ; ++i)
    {
        comb.add(i+1);
        this.backtrack(remain - i - 1,k,comb,i+1,res);
        comb.removeLast();
    }
}
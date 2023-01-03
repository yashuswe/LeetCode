// Given an integer array nums of unique elements, return all possible 
// subsets
//  (the power set).

// The solution set must not contain duplicate subsets. Return the solution in any order.
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans_final = new ArrayList<>();
        backtrace(nums, 0, new ArrayList<Integer>(), ans_final);
        return ans_final;
    }
    public void backtrace(int[] nums, int start, List<Integer> track, List<List<Integer>> ans_final)
    {
        ans_final.add(new ArrayList<>(track));
        for(int i = start; i < nums.length ; i++)
        {
            track.add(nums[i]);
            backtrace(nums, i+1 , track, ans_final);
            track.remove(track.size()-1);
        }
    }
}
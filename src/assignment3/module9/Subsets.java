package assignment3.module9;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    private void solve(int[] nums, List<Integer> output, int index, List<List<Integer>> ans) {
        if (index >= nums.length){
            ans.add(new ArrayList<>(output));
            return;
        }
        solve(nums, output, index+1,ans);
        output.add(nums[index]);
        solve(nums, output, index+1, ans);
        output.remove(output.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(nums, output, index, ans);
        return ans;
    }
    public static void main(String[] args) {
        Subsets s = new Subsets();
        int[] nums = {7,8,9};
        List<List<Integer>> result = s.subsets(nums);
        for (List<Integer> subset : result) {
            System.out.print(subset + " ");
        }
    }
}

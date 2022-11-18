package LeetCode.Easy;
import java.util.Arrays;

//LINK https://leetcode.com/problems/two-sum/

public class LeetCode_1_two_sum {

    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] result = new int[2];
            for (int i = 0; i < nums.length; i++) {
                for(int j = i+1; j < nums.length; j++){
                    int res = nums[i] + nums[j];
                    if(target == res){
                        result[0] = i;
                        result[1] = j;
                    }
                }
            }
            return result;
        }

        public static void main(String[] args) {
            Solution solution = new Solution();
            int[] nums = {2, 7, 11, 15};
            int target = 9;
            int[] ints = solution.twoSum(nums, target);
            System.out.println(Arrays.toString(ints));
        }
    }
}

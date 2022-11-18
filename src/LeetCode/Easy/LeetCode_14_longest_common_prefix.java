package LeetCode.Easy;

//LINK https://leetcode.com/problems/roman-to-integer/

import java.util.HashMap;

public class LeetCode_14_longest_common_prefix {

    static class Solution {

        public String longestCommonPrefix(String[] strs) {
            if (strs.length == 0) return "";

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < strs[0].length(); i++) {
                char c = strs[0].charAt(i);

                for (String str : strs) {
                    if (str.length() <= i || c != str.charAt(i)) {
                        return sb.toString();
                    }
                }

                sb.append(c);
            }


            return sb.toString();
        }

        public static void main(String[] args) {
            LeetCode_14_longest_common_prefix.Solution solution = new LeetCode_14_longest_common_prefix.Solution();
            String[] strs = {"cir","car"};
            String result = solution.longestCommonPrefix(strs);
            System.out.println(result);
        }


    }





}

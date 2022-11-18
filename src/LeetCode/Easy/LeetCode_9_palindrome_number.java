package LeetCode.Easy;
import java.util.Arrays;

//LINK https://leetcode.com/problems/palindrome-number/

public class LeetCode_9_palindrome_number {

    static class Solution {
        public boolean isPalindrome(int x) {
            boolean result = false;
            StringBuilder sb = new StringBuilder();
            if(x > 0){
                String number = String.valueOf(x);
                char[] digits1 = number.toCharArray();
                for(int i = digits1.length-1; i >= 0; i--) {
                    sb.append(digits1[i]);
                }
                if(Double.parseDouble(String.valueOf(sb)) == x){
                    result = true;
                }
            }
            System.out.println(sb);

            return result;
        }

        public static void main(String[] args) {
            Solution solution = new Solution();
            int x = 1234567899;
            boolean res = solution.isPalindrome(x);
            System.out.println(res);
        }
    }
}

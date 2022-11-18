package LeetCode.Easy;

//LINK https://leetcode.com/problems/roman-to-integer/

public class LeetCode_13_roman_to_integer {

    public static int Solution(String s) {
        int result = 0;
        int len = s.length();

        for(int i = 0; i < len -1; i ++) {
            int now = switchRoman(s.charAt(i));
            int next = switchRoman(s.charAt(i +1));
            result = now < next ? result - now : result + now;
        }

        result += switchRoman(s.charAt(len -1));

        return result;
    }

    public static int switchRoman(char c) {
        int result = 0;

        switch(c) {
            case 'I' : result = 1; break;
            case 'V' : result = 5; break;
            case 'X' : result = 10; break;
            case 'L' : result = 50; break;
            case 'C' : result = 100; break;
            case 'D' : result = 500; break;
            case 'M' : result = 1000; break;
        }

        return result;
    }

    public static void main(String[] args) {
        // LeetCode Easy 13

        String s = "MCMXCIV";
        int result = Solution(s);
        System.out.println(result);

        // Runtime : 3ms, faster than 100.00% of Java online submissions for Roman to Integer.
        // Memory Usage : 39.7mb, less than 79.73% of Java online submissions for Roman to Integer.
    }

}

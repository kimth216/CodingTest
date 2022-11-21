package BaekJoon.DynamicProgramming.DP_1463;
import java.io.IOException;
import java.util.Scanner;

//LINK
// https://www.acmicpc.net/problem/1463
// 자세한 해설 : https://smartpro.tistory.com/24

//DESC
//1로 만들기
// 문제
// 정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
// X가 3으로 나누어 떨어지면, 3으로 나눈다.
// X가 2로 나누어 떨어지면, 2로 나눈다.
// 1을 뺀다.
// 정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.
// 입력
// 첫째 줄에 1보다 크거나 같고, 106보다 작거나 같은 정수 N이 주어진다.
// 출력
// 첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다.
// 힌트
// 10의 경우에 10 -> 9 -> 3 -> 1 로 3번 만에 만들 수 있다.

//EXPLAIN
//D[12] = ?
// 3으로 나누거나 (D[12] = D[4] + 1) = (D[k] = D[k/3] + 1)
// 2로 나누거나 (D[12] = D[6] + 1) = (D[k] = D[k/2] + 1)
// 1을 빼거나 (D[12]=D[11]+1) = (D[k] = D[k-1] + 1)
// -> D[12] = min(D[4] + 1, D[6] + 1, D[11] + 1)
// -> D[k] = min(D[k/3] + 1, D[k/2] + 1, D[k-1] + 1)
// 즉,
// -> D[i] = min(3으로 나눌 때, 2로 나눌 때, 1을 뺄 때)


//FIXME
//TODO



public class Main {



    static int n; //입력된 수
    static int[] dp;


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        dp = new int[n + 1]; // 숫자 헷갈리지 않게 1부터 n까지 대입하기 위해 n+1 함

        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;

        for(int i=4; i<=n; i++) {
            // -1 연산을 수행할 경우
            // +1은 연산을 수행한 카운터를 하나 올려줌
            // ex) dp[4] = dp[3] + 1; ( dp[3]의 연산 수행의 수 + -1 연산 수행한 수)
            dp[i] = dp[i-1] + 1;

            if(i%3 == 0) {
                //ex) dp[9] = dp[9/3] + 1; ( dp[3]의 연산 수행의 수 + 9/3 연산 수행한 수(1))
                dp[i] = Math.min(dp[i], dp[i / 3] + 1); // 나누기 3 연산 수행할 경우와 -1 연산 수행한 경우 비교
            }
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1); // 나누기 3 연산 수행할 경우와 -1 연산 수행한 경우 비교
            }
        }


        System.out.println(dp[n]);
    }

    public static void temp(int X) {

        int result = 0;
        int x = X;



        System.out.println("result : "+ result);




    }
}

package BaekJoon;
import java.io.IOException;
import java.util.Scanner;



// 백준 코딩 테스트 템플릿
public class Main {

    //함수에서 사용할 변수들
    static int[][] check; //간선 연결상태
    static boolean[] checked; //확인 여부
    static int n; //정점개수
    static int m; //간선개수
    static int start; //시작정점

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        start = sc.nextInt();

        temp(start);
    }

    public static void temp(int i) {

        System.out.println("result");

    }
}

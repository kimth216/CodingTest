package BaekJoon.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



//4 5 1
//1 2
//1 3
//1 4
//2 4
//3 4

// 인접행렬 : 꼭짓점(vertex)가 적은 경우에만 사용하는 것
public class BFS_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // 정점의 갯수
        int m = sc.nextInt();   // 간선의 갯수
        int v = sc.nextInt();   // 탐색을 시작할 정점의 번호

        boolean visited[] = new boolean[n + 1]; // 방문 여부를 검사할 배열

        int[][] adjArray = new int[n+1][n+1];

        // 두 정점 사이에 여러 개의 간선이 있을 수 있다.
        // 입력으로 주어지는 간선은 양방향이다.
        for(int i = 0; i < m; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();

            adjArray[v1][v2] = 1;
            adjArray[v2][v1] = 1;
        }

        System.out.println("BFS - 인접행렬");

        bfs_array(v, adjArray, visited);

    }

    public static void bfs_array(int v, int[][] adjArray, boolean[] visited) {

        Queue<Integer> queue = new LinkedList<>();
        int n = adjArray.length-1;

        queue.add(v);
        visited[v] = true;

        while (!queue.isEmpty()){
            v = queue.poll();
            System.out.print( v + " ");

            for (int i = 0; i <= n; i++) {
                if (adjArray[v][i] == 1 && !visited[i]){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}

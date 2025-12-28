package baekjoon.DfsBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B2606Virus {
    static int N, M;
    static boolean[] visited;
    static List<Integer>[] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        graph = new ArrayList[N+1]; //노드가 1부터 시작하므로 인덱스1부터 사용하기위해 N+1

//        각 컴퓨터(노드)마다 연결리스트 생성
        for(int i=1; i<=N; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);    //양방향
            }

        visited = new boolean[N+1];
        dfs(1);

        int count = 0;
        for(int i=2; i<=N; i++){
            if(visited[i]){
                count++;
            }
        }
        System.out.println(count);
    }

    static void dfs(int node){
        visited[node]= true;
        for(int next : graph[node]){
            if(!visited[next]){
                dfs(next);
            }
        }
    }
}

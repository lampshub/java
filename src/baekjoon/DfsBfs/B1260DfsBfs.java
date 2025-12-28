package baekjoon.DfsBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B1260DfsBfs {
    static int N,M,V;
    static boolean[] visited;
    static List<Integer>[] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());    //정점(노드) 개수
        M = Integer.parseInt(st.nextToken());    //간선 개수
        V = Integer.parseInt(st.nextToken());    //시작 노드

        graph = new ArrayList[N+1]; //노드가 1부터 시작하므로 N+1

//        각 노드마다 리스트 생성
        for(int i = 1; i<=N; i++){
            graph[i] = new ArrayList<>();
        }

        for (int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
//            양방향 그래프이므로 양쪽에 추가
            graph[a].add(b);
            graph[b].add(a);
        }

//        번호가 작은 노드부터 방문->정렬
        for(int i=1; i<=N; i++){
            Collections.sort(graph[i]);
        }

//        DFS
        visited = new boolean[N+1]; //방문 배열 초기화
        dfs(V);
        System.out.println();

//        BFS
        visited = new boolean[N+1]; //방문 배열 재초기화
        bfs(V);


    }

    static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);

        while(!queue.isEmpty()){
            int node = queue.poll();
            System.out.print(node+" ");
            for(int next : graph[node]){
                if(!visited[next]){
                    visited[next]=true;
                    queue.add(next);
                }
            }
        }
    }


    static void dfs(int node){
//        현재 노드 방문처리
        visited[node] = true;
        System.out.print(node+" ");
//        현재 노드와 연결된 노드들 순회
        for(int next : graph[node]){
//            아직 방문하지 않았으면 재귀호출
            if(!visited[next]){
                dfs(next);
            }
        }
    }
}

package baekjoon.DfsBfs;

import com.sun.jdi.event.EventIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B1260Practice {
    static int N,M,V;
    static boolean[] visited;
    static List<Integer>[] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        V=Integer.parseInt(st.nextToken());

        graph = new ArrayList[N+1];

        for(int i=1; i<=N; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        for(int i =1; i<=N; i++){
            Collections.sort(graph[i]);
        }
//DFS
        visited = new boolean[N+1];
        dfs(V);
        System.out.println();

//BFS
        visited = new boolean[N+1];
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
        visited[node] = true;
        System.out.print(node+" ");
        for(int next : graph[node]){
            if(!visited[next]){
                dfs(next);
            }
        }

    }
}

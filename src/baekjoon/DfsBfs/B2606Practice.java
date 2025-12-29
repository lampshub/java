package baekjoon.DfsBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class B2606Practice {
    static int N,M;
    static List<List<Integer>> adjList = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        visited = new boolean[N+1];

        for(int i=0; i<=N; i++){
            adjList.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adjList.get(a).add(b);
            adjList.get(b).add(a);
        }

        for(List<Integer> l : adjList){
            l.sort(Comparator.naturalOrder());
        }

        dfs(1);
        int virusCount = 0;
        for(boolean virus : visited){
            if(virus) virusCount++;
        }
        System.out.println(virusCount-1);

    }
    static void dfs(int startNode){
        visited[startNode] = true;
        for(int next : adjList.get(startNode)){
            if(visited[next]) continue;
            visited[next]=true;
            dfs(next);
        }
    }
}

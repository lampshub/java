package baekjoon.DfsBfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B2178Mase {
    static int N, M;
    static int[][] map;
    static boolean[][] visited;

    static int[] dx = {-1,1,0,0};   //상 하
    static int[] dy = {0,0,-1,1};   //좌 우

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M];

        for(int i=0; i<N; i++){
            String line = br.readLine();
            for(int j=0; j<M; j++){
                map[i][j]=Integer.parseInt(String.valueOf(line.charAt(j)));
//          map[i][j]=line.charAt(j) - '0'; //문자1=49,문자0-48-> 문자1-문자0=1, 문자0-문자0=0
            }
        }

        bfs(0,0);
        System.out.println(map[N-1][M-1]);
    }

    static void bfs(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y});  //int[] a = new int[]{x, y}와 같이 배열을 하나 만듬
        visited[x][y]=true;

        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int cx = cur[0];
            int cy = cur[1];
            for(int i=0; i<4; i++){     //4방향 탐색
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if(nx<0 || ny<0 || nx>=N || ny>=M) continue;    //맵 밖이면 continue
                if(visited[nx][ny]) continue;                   //이미 방문 했으면
                if(map[nx][ny]==0) continue;                    //벽이면
                visited[nx][ny]=true;
                map[nx][ny] = map[cx][cy]+1;
                queue.add(new int[]{nx,ny});
            }
        }
    }
}

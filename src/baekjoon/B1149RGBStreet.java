package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B1149RGBStreet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int colors = 3;
        int[][] cost = new int[N][colors];
        for(int i=0; i<N; i++){
            String[] st = br.readLine().split(" ");
            for(int j=0; j<colors;j++){
                cost[i][j] = Integer.parseInt(st[j]);
            }
        }
        int[][] dp = new int[N][colors];
        dp[0][0] = cost[0][0];
        dp[0][1] = cost[0][1];
        dp[0][2] = cost[0][2];
        for(int i=1; i<N; i++){
            for(int j=0; j<colors; j++){
                dp[i][j] = Math.min(dp[i-1][(j+1)%3],dp[i-1][(j+2)%3])+cost[i][j];
            }
        }
        int minCost = Math.min(Math.min(dp[N-1][colors-1],dp[N-1][colors-2]),dp[N-1][colors-3]);
        System.out.println(minCost);
        }
}

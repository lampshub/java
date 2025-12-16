package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2  {
    public static void main(String[] args) throws IOException {
//        2839번 - 설탕 배달







////        9095번 - 1,2,3 더하기
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int T = Integer.parseInt(br.readLine());
//
//        for( int i = 0; i<T; i++) {
//            int n = Integer.parseInt(br.readLine());
//            int[] dp = new int[n+1];
//            if(n>=1) dp[1]=1;
//            if(n>=2) dp[2]=2;
//            if(n>=3) dp[3]=4;
//            for(int j = 4; j<=n; j++){
//                dp[j] = dp[j-1] + dp[j-2] + dp[j-3] ;
//            }
//            System.out.println(dp[n]);
//        }



////        1463 - 1로 만들기
//       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//       int N = Integer.parseInt(br.readLine());
//       int count = 0;
//
//       int dp[] = new int[N+1];
//       dp[1] = 0;
//       for(int i = 2; i<= N; i++) {
//           dp[i] = dp[i-1] + 1 ;
//           if (i%2 ==0){
//               dp[i] = Math.min(dp[i], dp[i/2]+1);
//           }
//           if (i%3 ==0){
//               dp[i] = Math.min(dp[i], dp[i/3]+1);
//           }
//       }
//        System.out.println(dp[N]);
    }
}

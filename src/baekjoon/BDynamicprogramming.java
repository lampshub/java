package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BDynamicprogramming {
    public static void main(String[] args) throws IOException {
//        2839번 - 설탕 배달
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N+1];
//        문제에서 N값이 5000까지 주어질수 있다고 하니 그것을 넘어선 큰값으로 세팅
        Arrays.fill(dp,5001);
        if (N>=3) dp[3]=1;
        if (N>=5) dp[5]=1;

        for(int i=6; i<dp.length; i++){
          dp[i]=Math.min(dp[i-3],dp[i-5])+1;
        }
//        for문 후에도 5001보다 큰값을 가지고 있으면 -1, 아니면 dp[N]값 출력
        if(dp[N]>=5001) {
            System.out.println(-1);
        } else System.out.println(dp[N]);








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

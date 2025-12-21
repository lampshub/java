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
        List<int[]> myList = new ArrayList<>();
        for(int i = 0; i<N; i++){
            String[] st = br.readLine().split(" ");
            int[] arr = new int[st.length];
            for(int j = 0; j<st.length; j++){
                arr[j] = Integer.parseInt(st[j]);
            }
            myList.add(arr);
        }
        int[] dp1 = new int[N+1];
        int sum1 = 0;
//        dp1[1]= Math.min(myList.get(0)[0],myList.get(0)[1],myList.get(0)[2])
//        for(int i=)
    }
}

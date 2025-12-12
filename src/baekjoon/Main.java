package baekjoon;

import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] st = br.readLine().split(" ");
        int[] tsh = new int[st.length];
        for(int i = 0; i<st.length; i++) {
            tsh[i] = Integer.parseInt(st[i]);
        }

        String[] tp = br.readLine().split(" ");
        int t = Integer.parseInt(tp[0]);
        int p = Integer.parseInt(tp[1]);

        int tcount = 0;
        int pcount = 0;
        for ( int i = 0; i<st.length; i++) {

            if(tsh[i] % t > 0) {
                tcount += tsh[i] / t +1;
            } else {
                tcount += tsh[i] / t;
            }
            int sum = 0;
            sum += tsh[i];
            pcount = sum / st.length;
        }
        System.out.println(tcount+" "+  pcount);
















//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] st1 = br.readLine().split(" ");
//        int N = Integer.parseInt(st1[0]);
//        int M = Integer.parseInt(st1[1]);
//
//        String[] st2 = br.readLine().split(" ");
//        int[] find = new int[M];
//        for (int i = 0; i < M; i++) {
//            find[i] = Integer.parseInt(st2[i]);
//        }
//
//        Deque<Integer> deq = new LinkedList<>();
//        for (int i = 1; i <= N; i++) {
//            deq.offer(i);
//        }
//
//        int count = 0;
//
//        for (int j = 0; j<M; j++){
//            int target = find[j];
//
//            int idx = 0;
//            for (int x : deq){
//                if( x == target) break;
//                idx++;
//            }
//        }
//        System.out.println(count);



    }
}





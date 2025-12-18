package baekjoon;

import java.io.*;
import java.time.Instant;
import java.time.LocalDate;
import java.util.*;

import static java.lang.Integer.parseInt;


public class Main {
    public static void main(String[] args) throws IOException {


    }
        public String[] solution(int[] numbers, int[] our_score, int[] score_list) {
            int num_student = numbers.length;
            String[] answer = new String[num_student];

            for (int i = 0; i < num_student; i++) {
                if (our_score[i] == score_list[i]) {
                    answer[i] = "Same";
                }
                else {
                    answer[i] = "Different";
                }
            }

            return answer;














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





package baekjoon;

import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;


public class PrinterQ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            Queue<int[]> q = new LinkedList<>();
            String[] temp = br.readLine().split(" ");

            for (int j = 0; j < N; j++) {
                q.add(new int[]{Integer.parseInt(temp[j]), j});
            }   //[0] 중요도, [1] 인덱스

            while (!q.isEmpty()) {
                int[] here = q.poll(); //큐 맨 앞의 문서를 확인 - 현재문서
                int q_size = q.size(); //큐의 남은 문서 수
                boolean canPrint = true;
                for (int k = 0; k < q.size(); k++) { //남은 큐 전체를 돌면서 중요도값 확인
                    int[] check = q.poll();
                    if (check[0] > here[0]) { //현재 문서 중요도보다 높은 중요도가 있다면
                        canPrint = false;
                        break;
                    }
                    q.add(check); //확인 후 다시 q에 넣어줌
                }
                if (canPrint) {
                    count++;
                    if (here[1] == M) {    //출력된 문서가 찾고자하는 문서라면,
                        break;
                    }
                }
            }            System.out.println(count);
        }
    }
}
package baekjoon;

import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class B11279MaxHeap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> que = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0; i<N; i++){
            int a = Integer.parseInt(br.readLine());
            if(a==0){
                if(que.isEmpty()) {
                    bw.append(0+"\n");
                } else {
                bw.append(que.poll()+"\n");
            }
            }else {
                que.add(a);
            }
        }
        bw.flush();
        bw.close();
    }
}

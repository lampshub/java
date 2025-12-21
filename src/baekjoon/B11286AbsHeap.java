package baekjoon;

import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class B11286AbsHeap {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> que = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o1) == Math.abs(o2)){
                    return o1-o2;
                } return Math.abs(o1) - Math.abs(o2);
            }
        });

        for(int i=0; i<N; i++){
            int a = Integer.parseInt(br.readLine());
            if(a != 0){
                que.add(a);
            } else{
                if(que.isEmpty()){
                    bw.append(0+ "\n");
                } else{
                    bw.append(que.poll()+"\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}

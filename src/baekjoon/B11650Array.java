package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class B11650Array {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        for(int i = 0; i<N; i++) {
            String[] st = br.readLine().split(" ");
            for (int j = 0; j < 2; j++) {
                arr[i][j] = Integer.parseInt(st[j]);
            }
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]){
                    return o1[1]-o2[1];
                }
                return o1[0]-o2[0];
            }
        });
        for(int[] a : arr){
            bw.append(a[0]+ " " + a[1]+"\n");
        }
        bw.flush();
        bw.close();
    }
}

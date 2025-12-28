package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double[] scores = new double[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            scores[i] = Double.parseDouble(st.nextToken());
        }

        double max = 1;
        for (double i : scores) {
            if (i > max) {
                max = i;
            }
        }

        double sum = 0;
        for (int i = 0; i < N; i++) {
                sum += scores[i] / max * 100;
        }

        System.out.println(sum/N);
        }
    }


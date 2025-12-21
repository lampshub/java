package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B1399ATM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        String[] st = br.readLine().split(" ");
        for(int i = 0; i<N; i++){
            arr[i]=Integer.parseInt(st[i]);
        }
        Arrays.sort(arr);
        int sum = 0;
        int total = 0;
        for ( int i=0; i<arr.length; i++){
            sum = sum+arr[i];
            total += sum;
        }
        System.out.println(total);
    }
}

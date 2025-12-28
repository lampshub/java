package baekjoon.NandM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class B15649 {
    public static void main(String[] args) throws IOException {
        Scanner br = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.next());
        int M = Integer.parseInt(br.next());
        List<List<Integer>> doubleList = new ArrayList<>();
        permu(new boolean[N+1], N, M, doubleList, new ArrayList<>());
        for(List<Integer> inner : doubleList) {
            for(int a : inner){
                sb.append(a+" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }
    public static void permu(boolean[] visited, int n, int m, List<List<Integer>> doubleList, List<Integer> temp){
        if(temp.size()==m){
            doubleList.add(new ArrayList<>(temp));
            return;
        }
        for(int i=1; i<=n; i++){
            if(visited[i]==true) continue;
            temp.add(i);
            visited[i]=true;
            permu(visited, n, m, doubleList, temp);
            temp.remove(temp.size()-1);
            visited[i]=false;
        }
    }
}

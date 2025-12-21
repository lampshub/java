package baekjoon;

import java.io.*;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class B1181Sortingwords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Set<String> myset = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()==o2.length()){
                    return o1.compareTo(o2);
                }
                return o1.length()-o2.length();
            }
        });
        for(int i=0; i<N; i++)  {
            myset.add(br.readLine());
        }
        for(String a : myset) {
            bw.append(a+"\n");
        }
        bw.flush();
        bw.close();
    }
}

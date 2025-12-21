package baekjoon;

import java.io.*;
import java.util.*;

//시간초과 걸림
public class B2170MakeLine {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        List<int[]> myList = new ArrayList<>();
        for(int i=0; i<N; i++){
            String[] st = br.readLine().split(" ");
            int[] arr = new int[]{Integer.parseInt(st[0]),Integer.parseInt(st[1])};
            myList.add(arr);
        }
//        List안 배열의 정렬
        myList.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0]){
                    return o1[1]-o2[1];
                }
                return o1[0]-o2[0];
            }
        });

//        for(int i=0; i<N; i++){
//            System.out.println(Arrays.toString(myList.get(i)));
//        }

//        최종적으로 그려진 선 추리기
        for(int i=0; i<N; i++) {
            int index = 0;
            if (myList.get(index)[0] == myList.get(index + 1)[0]) {
                myList.remove(index);
            } else {
                if (myList.get(index)[1] < myList.get(index + 1)[0]) {
                    index++;
                } else {
                    int temp0 = myList.get(index)[0];
                    int temp1 = myList.get(index + 1)[1];
                    myList.remove(index);
                    myList.remove(index);
                    myList.add(index, new int[]{temp0, temp1});
                }
            }
        }
//        for(int i=0; i<myList.size(); i++){
//            System.out.println(Arrays.toString(myList.get(i)));
//        }

//        선들의 길이 구하기
        int lengthsum = 0;
        for(int i=0; i<myList.size(); i++) {
            lengthsum += myList.get(i)[1] - myList.get(i)[0];
        }
        System.out.println(lengthsum);

        }
    }


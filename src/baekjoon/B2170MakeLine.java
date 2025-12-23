package baekjoon;

import java.io.*;
import java.util.*;


public class B2170MakeLine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[][] line = new int[N][2];
        for (int i = 0; i < N; i++) {
            String[] st = br.readLine().split(" ");
            line[i][0] = Integer.parseInt(st[0]);
            line[i][1] = Integer.parseInt(st[1]);
        }
        Arrays.sort(line, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int prevStart = line[0][0];
        int prevEnd = line[0][1];
        int sumLength = 0;
        for(int i = 1; i<N; i++){
            int start = line[i][0];
            int end = line[i][1];
            if(prevEnd < start) {
                sumLength += prevEnd - prevStart;
                prevStart = start;
                prevEnd = end;
            } else{
                prevEnd = Math.max(prevEnd,end);
                }
        }
        sumLength += prevEnd - prevStart;
        System.out.println(sumLength);
    }
}









//        for(int i=0; i<myList.size(); i++){
//            System.out.println(Arrays.toString(myList.get(i)));
//        }

////        선들의 길이 구하기
//        int lengthsum = 0;
//        for(int i=0; i<myList.size(); i++) {
//            lengthsum += myList.get(i)[1] - myList.get(i)[0];
//        }
//        System.out.println(lengthsum);
//
//        }
//    }


// 시간초과걸림
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int N = Integer.parseInt(br.readLine());
//        List<int[]> myList = new ArrayList<>();
//        for(int i=0; i<N; i++){
//            String[] st = br.readLine().split(" ");
//            int[] arr = new int[]{Integer.parseInt(st[0]),Integer.parseInt(st[1])};
//            myList.add(arr);
//        }
////        List안 배열의 정렬
//        myList.sort((o1, o2) -> {
//            if(o1[0]==o2[0]){
//                return o1[1]-o2[1];
//            }
//            return o1[0]-o2[0];
//        });
//
////        for(int i=0; i<N; i++){
////            System.out.println(Arrays.toString(myList.get(i)));
////        }
//
////        최종적으로 그려진 선 추리기
//        for(int i=0; i<N; i++) {
//            int index = 0;
//            if (myList.get(index)[0] == myList.get(index + 1)[0]) {
//                myList.remove(index);
//            } else {
//                if (myList.get(index)[1] < myList.get(index + 1)[0]) {
//                    index++;
//                } else {
//                    int temp0 = myList.get(index)[0];
//                    int temp1 = myList.get(index + 1)[1];
//                    myList.remove(index);
//                    myList.remove(index);
//                    myList.add(index, new int[]{temp0, temp1});
//                }
//            }
//        }
////        for(int i=0; i<myList.size(); i++){
////            System.out.println(Arrays.toString(myList.get(i)));
////        }
//
////        선들의 길이 구하기
//        int lengthsum = 0;
//        for(int i=0; i<myList.size(); i++) {
//            lengthsum += myList.get(i)[1] - myList.get(i)[0];
//        }
//        System.out.println(lengthsum);
//
//    }
//}

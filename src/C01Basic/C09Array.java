package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class C09Array {
    public static void main(String[] args) throws IOException {
//        배열표현식1. 배열 선언 후 값 할당 방식
//        java의 배열은 반드시 사전에 길이가 결정되어야함
//        int[] arr1 = new int[]; 이렇게는 안됌
//        int[] arr1 = new int[5];
//        arr1[0]=10;
//        arr1[1]=20;
////        int배열의 경우 선언지 기본적으로 0으로 값 초기화. boolean은 false, 참조자료형은 null.
//        arr1[3]=40;
//        arr1[4]=50;
////      arr1[5]=60; //index out of bounds 예외 발생
//
////        배열표현식2. 리터럴방식
//        int[] arr2 = {10,20,30,40,50};
//
////        배열표현식3. 명시적 배열 생성 방식
//        int[] arr3 = new int[]{10,20,30,40,50};
//
////        배열표현식3의 활용예시 : 배열을 다른 메서드의 매개변수로 사용할 경우
//        List<int[]> myList = new ArrayList<>();
//        myList.add(new int[5]);
//        myList.get(0)[0]=10;
//        myList.get(0)[1]=20;
//        myList.get(0)[2]=30;
//        myList.get(0)[3]=40;
//        myList.get(0)[4]=50;
//        myList.add(new int[]{10,20,30,40,50});
//        myList.add({10,20,30,40,50}); //사용불가 - {}안의 값이 배열인지 아닌지 확인불가

////         85,65,90으로 구성된 int배열을 선언하고 총합과 평균을 구하시오
//        int[] a = new int[]{85,65,90};
//        int sum = 0;
//        double avg = 0;
//        for (int i : a) {
//            sum += i;
//        }
//        avg = (double) sum / a.length;
//        System.out.println("총합 : "+sum);
//        System.out.println("평균 : "+avg);

////        배열의 최대값, 최소값
//        int[] arr = {10, 20, 30, 12, 8, 17};
////        최대값을 구할때는 가장 작은 값을 설정
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        for (int i : arr) {
//            if(i > max) {
//                max = i;
//            }
//            if(i<min) {
//                min = i;
//            }
//        }
//        System.out.println(max +", "+ min);

//        int max = Integer.MIN_VALUE;    // -20억
//        //          최솟값을 구할때는 가장 큰 값을 설정
//        int min = Integer.MAX_VALUE;    // +20억
//
//        for (int i : arr) {
//            if (i > max) {
//                max = i;
//            }
//            if (i < min) {
//                min = i;
//            }
//            System.out.println(max);
//        }

////        배열의 자리 바꾸기
//        int[] arr = {20, 10, 30};
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;

//        배열 뒤집기
//        int[] arr = {10,20,30,40,50};
//        int[] newArr = new int[arr.length];
//
//        for (int i = arr.length-1; i>=0; i--){
//            newArr[(arr.length-1)-i] = arr[i];
//        }
//        System.out.println(Arrays.toString(newArr));
//
//        for (int i=0; i<arr.length; i++){
//            newArr[arr.length-i-1] = arr[i];
//        }
//        System.out.println(Arrays.toString(newArr));
//
//        int index = 0;
//        for (int i = arr.length-1; i>=0; i--){
//            newArr[index] = arr[i];
//            index++;
//        }
//
////            배열의 정렬
//            String[] stArr  = {"abc","aaa","acb","abb"};
//            Arrays.sort(stArr); // default 오름차순 정렬
//            System.out.println(Arrays.toString(stArr));
//            Arrays.sort(stArr, Comparator.reverseOrder()); //내림차순 정렬
//            System.out.println(Arrays.toString(stArr));
//            int[] arr = {17,12,20,10,15};
//            Arrays.sort(arr); //오름차순 정렬
////            Arrays.sort(arr,Comparator.reverseOrder()); //원시자료형은 Comparator 사용불가능
//            Integer[] arr2 = {17,12,20,10,15};
//            Arrays.sort(arr2); //오름차순 정렬
//            Arrays.sort(arr2,Comparator.reverseOrder());
//            System.out.println(Arrays.toString(arr2));

////            정렬 알고리즘 구현 (선택정렬 알고리즘)
////        구현로직 1) 2중for문을 사용하여 index마다 최소값찾기 2) 현재위치와 자리 change
//        1. 제일 작은 수 찾아 0번째랑 자리 바꾸기 min, replace?
//        2. 1번째부터 제익 작은 수 찾아서 자리바꾸기
//        int[] arr = {17, 12, 20, 10, 15};
//        for (int i = 0; i < arr.length; i++) {
//            int min = arr[i];
//            int minIndex = i;
//            for (int j = i; j <= arr.length; j++) {
//                if (arr[j] < min) {
//                    min = arr[j];
//                    minIndex = j;
//                    arr[j] = arr[i];
//                    arr[i] = min;
//                }
//            }
//            System.out.println(Arrays.toString(arr));


//        for(int i = 0 ; i < arr.length; i++){
//            for(int j = i; j < arr.length; j++) {
//                if(arr[i] >= arr[j]) {
//                    int small = arr[j];
//                    int big = arr[i];
//                    arr[i] = small;
//                    arr[j] = big;
//                }
//            }
//        }System.out.println(Arrays.toString(arr));

////        방법1. 강사님이 의도하신 방법!
//            for (int i = 0; i < arr.length; i++) {
//                int min = arr[i];  // max값으로 안두고 arr[i] 자기자신값으로 두고 비교해도 됨
//                int minIndex = i;
//                for (int j = i + 1; j < arr.length; j++) {
//                    if (arr[j] < min) {
//                        min = arr[j];
//                        minIndex = j;
//                        }
//                }
////            // 자리바꾸기 : i 와 index 자리 change
//                int temp = arr[i];
//                arr[i] = arr[minIndex];
//                arr[minIndex] = temp;
//            }
//            System.out.println(Arrays.toString(arr));

//        방법2.
//        for(int i = 0; i<arr.length; i++){
//            for(int j = i; j<arr.length; j++){
//                if(arr[i] > arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
////      선택정렬의 복잡도 : O(n^2).  java 기본 내장 정렬함수의 복잡도 : O(n*log(n))

////        조합문제 : 모두 각기 다른 숫자의 배열이 있을때, 만들어질 수 있는 두 숫자의 조합
//        ex) (10,20), (10,30), (10,40), (10,50), (20,30),(20,40), ...
//        int[] arr = {10,20,30,40,50};
//        for ( int i = 0; i < arr.length; i++) {     //i=4 일때, 안에 for문은 j 가 해당 안됌
//            for ( int j = i+1; j<arr.length; j++) {
//                System.out.print("("+arr[i]+", "+arr[j]+")");
//            }
//        }
////        순열 : (10,20), (10,30), (10,40), (10,50), (20,10), (20,30), ... (중복 허용)
////      (10,10), (20,20), .. 과 같은 중복은 빼야함
//        for ( int i = 0; i < arr.length; i++) {
//            for ( int j = 0; j<arr.length; j++) {
//                if( i != j ) {
//                    System.out.print("("+arr[i]+", "+arr[j]+")");
//                }
//                }
//            }


////         배열의 중복제거 : set자료구조(중복X, 순서X) 활용
////        ex) 10,20,30,40만 있도록
//        int[] arr = {10,30,20,30,10,40};
//        Set<Integer> mySet = new HashSet<>();
//        for (int a : arr) {
//            mySet.add(a);
//        }
//        int[] answer = new int[mySet.size()];
//        int index = 0;
//        for(int a : mySet) {
//            answer[index] = a;
//            index++;
//        }
//        Arrays.sort(answer);
//        System.out.println(Arrays.toString(answer));

//        프로그래머스 - 두 개 뽑아서 더하기 (조합+중복제거) **풀어보기**


//        배열의 검색 : 복잡도 O(n)
//        int[] arr = {1,3,6,8,8,9,11,15};
//        int target = 11;
//        target이 몇번째 index에 있는지 출력
//        int index = -1;
//        for (int i=0; i < arr.length; i++)  {
//            if (arr[i]==target) {
//                index = i;
//                break;
//            }
//        }
//        System.out.println(index);

//        이분탐색(이진검색) - binary search, 복잡도 log(n)
////        사전에 데이터가 오름차순정렬 돼있는 경우만, 이분탐색 가능
//        int[] arr = {1,3,6,8,8,9,11,15};
//        int target = 11;
////        찾고자 하는 값이 있으면 해당 index리턴
////        찾고자 하는 값이 없으면 음수값 리턴
//        int index = Arrays.binarySearch(arr, target); //6
//        int index2 = Arrays.binarySearch(arr, 13);    //-8
//        System.out.println(index);
//        System.out.println(index2);

////      백준문제 - 수 찾기 (1920)


////        배열값 비교
//        int[] arr1 = {10,20,30};
//        int[] arr2 = {10,20,30};
//        System.out.println(arr1 == arr2); //false
//        System.out.println(Arrays.equals(arr1, arr2)); //true

////        배열복사
//        Arrays.copyOf(배열명, length)
//        Arrays.copyOfRange(배열명, start, end)
//        int[] arr = {1,4,6,7,8,1,2,4,6};
//        int[] arr1 = Arrays.copyOf(arr, 4);
//        System.out.println(Arrays.toString(arr1));
//        int[] arr2 = Arrays.copyOfRange(arr, 3, 6);
//        System.out.println(Arrays.toString(arr2));

////        Arrays.fill : 배열에 모든값을 변경(채우기)
//        String[] arr = new String[5];
//        for (int i = 0; i<arr.length; i++) {
//            arr[i] = "";
//        }
//        System.out.println(Arrays.toString(arr));
//        Arrays.fill(arr, "1");
//        System.out.println(Arrays.toString(arr));

////      2차원배열의 선언과 값할당
//        {{1,2},{1,2},{1,2}}
////      방법1 : 선언후 할당 방식
//        int[][] arr1= new int[3][2];
//        arr[0][0]=1;
//        arr[0][1]=2;
//        arr[1][0]=1;
//        arr[1][1]=2;
//        arr[2][0]=1;
//        arr[2][1]=2;
//
////      방법2 : 리터럴방식
//        int[][] arr2 =  {{1,2},{1,2},{1,2}};

////        [3][4]사이즈의 2차원배열을 선언하고, 1~12까지 숫자값을 각 배열에 순차적으로 할당
//          {{1,2,3,4},{5,6,7,8},{9,10,11,12}}

//        int[][] arr = new int[3][4];
//        int num = 1;
//            for(int i =0; i<arr.length; i++) {
//            for (int j =0; j<arr[i].length; j++){
//                arr[i][j] = num;
//            num++;
//            }
//        }
////            2차원 배열의 출력
//        System.out.println(arr);    //2차원배열의 heap의 주소값
//        System.out.println(Arrays.toString(arr));  //각1차원배열의 heap주소값
//        System.out.println(Arrays.deepToString(arr));  //각1차원배열의 값을 출력

            //프로그래머스 - 행렬의 덧셈
            //프로그래머스 - K번째수 >다시풀어보기**

////        가변배열 : 2차원 배열에서 각 1차원의 배열의 길이가 서로 다를 수 있는 배열의 구조
//            int[][] arr1 = {{1, 2}, {1, 2, 3}, {1, 2, 3, 4}};
//
////        배열 전체길이는 반드시 사전할당되어야하지만, 1차원배열의 길이는 추후 할당가능
//            int[][] arr2 = new int[3][];
//            arr2[0] = new int[2];
//            arr2[1] = new int[3];
//            arr2[2] = new int[4];
//

        }
    }



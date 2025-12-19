package baekjoon;

import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

import static java.lang.Integer.parseInt;

public class studyQ1 {
    public static void main(String[] args) throws IOException {


////        프로그래머스 : 같은 숫자는 싫어
//        int[] arr = new int[]{1,1,3,3,0,1,1};
////        int[] answer = {};
//        Stack<Integer> st = new Stack<>();
//        for(int i : arr) {
//            if(st.isEmpty()) {
//                st.push(i);
//            } else {
//                if(st.peek() != i) {
//                    st.push(i);
//                }
//            }
//        }
//
//        int[] answer = new int[st.size()];
//        for (int i=st.size()-1; i>=0; i--) {
//        answer[i] = st.pop();
//        }
//        System.out.println(Arrays.toString(answer));


////        프로그래머스 : 올바른 괄호
//        String s = "(()(";
//        boolean answer = true;
//        Stack<String> st = new Stack<>();
//        for ( char a : s.toCharArray()) {
//            if (a == '(') {
//                st.add(String.valueOf(a));
//            } else {
//                if (!st.isEmpty() && st.peek().equals("(")) {
//                    st.push(String.valueOf(a));
//                    st.pop();
//                    st.pop();
//                } else {
//                    answer = false;
//                    break;
//                }
//            }
//        } if(!st.isEmpty()) answer=false;
//        System.out.println(answer);

////        백준 : 카드 정렬하기 (우선순위큐 - pq)


////        백준 : 카드2, 요세푸스 문제 0
////        카드 2
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//

//        Queue<Integer> st = new LinkedList<>();
//        for(int i=1; i<=N; i++){
//            st.add(i);
//        }
//
//        while (st.size() > 1) {
//            st.remove();
//            int temp = st.remove();
//            st.add(temp);
//        }
//        System.out.println(st.peek());

////        요세푸스 문제
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuffer sb = new StringBuffer();
//        String[] st = br.readLine().split(" ");
//        int N = Integer.parseInt(st[0]);
//        int K = Integer.parseInt(st[1]);
//        Queue<Integer> que = new LinkedList<>();
//
//        for(int i=1; i<=N; i++){
//            que.add(i);
//        }
//        sb.append("<");
//        while (que.size() > 1) {
//            for(int j = 1; j<K; j++){
//                que.add(que.poll());
//            }
//            sb.append(que.poll() + ", ");
//        }
//        sb.append(que.poll()).append(">");
//        System.out.print(sb);




////        백준 : 최소 힙
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        Queue<Integer> pq = new PriorityQueue<>();
//
//        for ( int i =0; i<N; i++) {
//            int x = Integer.parseInt(br.readLine());
//            if(x>0) {
//                pq.add(x);
//            } else {
//                if(!pq.isEmpty()) System.out.println(pq.poll());
//                else System.out.println(0);
//            }
//        }
//         StringBuffer / StringBuilder에 담아서 출력하기!!

////        프로그래머스 : 더 맵게 **더 풀어보기
////
//        int[] scoville = new int[]{1,2,3,9,10,12};
//        int K = 7;
//        int answer = 0;
//
//        Queue<Integer> pq = new PriorityQueue<>();
//        for (int a : scoville) {
//            pq.add(a);
//        }
//
//        while (pq.size() >= 2 && pq.peek()<K) {
//                int min = pq.poll();
//                int secondMin = pq.poll();
//                int mix = min + secondMin * 2;
//                pq.add(mix);
//                answer++;
//                }
//        if(pq.size()<2 && pq.peek()< K){
//            answer = -1;
//            }
//
//                System.out.println(answer);


////        treeMap 활용해서
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//
//        Map<String, Integer> book = new TreeMap<>();
//        for (int i = 0; i < N; i++) {
//            String a = br.readLine();
//            if (book.containsKey(a)) {
//                book.put(a, book.get(a) + 1);
//            } else {
//                book.put(a, 1);
//            }
//        }
//        int max = Integer.MIN_VALUE;
//        List<String> book_name = new ArrayList<>();
//        for (String b : book.keySet()) {
//            if (book.get(b) >= max) {
//                max = book.get(b);
//            }
//        }


//////        백준 : 베스트셀러 - 아직 못품!
//        //사전순 정렬 : 리스트에 가장 많이 팔린책을 담는다 => 정렬한다
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        Map<String, Integer> book = new HashMap<>();
//        for (int i = 0; i < N; i++) {
//            String a = br.readLine();
//            if (book.containsKey(a)) {
//                book.put(a, book.get(a) + 1);
//            } else {
//                book.put(a, 1);
//            }
//        }
//        int max = Integer.MIN_VALUE;
//        List<String> book_name = new ArrayList<>();
//        for (String b : book.keySet()) {
//            if (book.get(b) >= max) {
//                max = book.get(b);
//                }
//            }
//        for(String c : book.keySet()) {
//            if (book.get(c) == max) {
//                book_name.add(c);
//            }
//        }
//            book_name.sort(Comparator.naturalOrder());
//            System.out.println(book_name.get(0));


////      프로그래머스 : 완주하지 못한 선수
//        String[] participant = {"leo", "kiki", "eden"};
//        String[] completion = {"eden", "kiki"};
//        Map<String, Integer> running = new HashMap<>();
//        for (String a : participant) {
//            if(running.containsKey(a)) {
//                running.put(a, running.get(a) + 1);
//            } else {
//                running.put(a,1);
//            }
//        }
//        for(String b : completion) {
//            if(running.containsKey(b)){
//                if(running.get(b) <= 1){
//                    running.remove(b);
//                } else {
//                    running.put(b, running.get(b) - 1);
//                }
//            }
//        }
//        String answer = new String();
//        for(String c : running.keySet()) {
//            answer = c;
//        }
//        System.out.println(answer);


////      프로그래머스 :  의상 --  아직 못품
//        얼굴2개+1(안입었다), 상의2개+1,하의2개+1 => 3*3*3 -1(다 안입는것);
//        String[][] clothes = new String[][] {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
//        Map<String, String> type = new HashMap<>();
//            int answer = 0;


////        n의 배수 고르기
//        int n = 3;
//        int[] numlist = {4,5,6,7,8,9,10,11,12};
//        List<Integer> answer = new ArrayList<>();
//        for ( int i=0; i < numlist.length; i++) {
//            if( numlist[i] % n == 0) {
//                answer.add(i);
//            }
//        }
//        System.out.println(answer);
//
//        int[] answer = new int[numlist.size()];
//
//


////        k번째수
//        int[] array = {1,5,2,6,3,7,4};
//        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
//        int[] answer = new int[commands.length];
//        //잘라서 새로운 배열
//        //만들어진 배열 정렬
//        //원하는 값을 구해서 answer에 담는다
//        for ( int i = 0; i< commands.length; i++) {
//            int[] newarr = new int[commands[i].length];
//                int start = commands[i][0]-1;
//                int end = commands[i][1];
//                int k = commands[i][2]-1;
//
//            int[] intCopy = Arrays.copyOfRange(array,start,end);
//            Arrays.sort(intCopy);
//            answer[i] = intCopy[k];
//        }
//        System.out.println(Arrays.toString(answer));


//
//


////        프로그래머스 : 행렬의 덧셈
//        int[][] arr1 = {{1,2},{2,3}};
//        int[][] arr2 = {{3,4},{5,6}};
//        int[][] answer = new int[arr1.length][arr1[0].length];
//
//            for(int i=0; i<arr1.length; i++){
//                for(int j=0; j<arr1[i].length; j++){
//                    answer[i][j] = arr1[i][j] + arr2[i][j];
//                    }
//                }
//
//        System.out.println(Arrays.deepToString(answer));

////        백준 : 파일정리  (treeMap사용)




////        백준 : 숫자카드 (10815)
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int N = Integer.parseInt(br.readLine());
//        Set<Integer> nset = new HashSet<>();
//        String[] st = br.readLine().split(" ");
//
//        for(int i=0; i<N; i++)  {
//            nset.add(Integer.parseInt(st[i]));
//        }
//
//        int M = Integer.parseInt(br.readLine());
//        int[] intarr = new int[M];
//        String[] st2 = br.readLine().split(" ");
//
//        for( int i=0; i<M; i++) {
//            intarr[i] = Integer.parseInt(st2[i]);
//        }
//
//        for(int a : intarr) {
//            int has = 0;
//            if(nset.contains(a)) {
//                has = 1;
//            }
//            sb.append(has + " ");
//        }
//        System.out.println(sb);


////        프로그래머스 : 폰켓몬 (종류구하기 -> 중복제거 -> set) -- 아직 못함







////        백준 1920 수찾기 (set 이용)
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int N = Integer.parseInt(br.readLine());
//        Set<Integer> nset = new HashSet<>();
//        String[] st = br.readLine().split(" ");
//        for(int i=0; i<N; i++) {
//            nset.add(Integer.parseInt(st[i]));
//        }
//        int M = Integer.parseInt(br.readLine());
//        int[] marr = new int[M];
//        String[] st2 = br.readLine().split(" ");
//        for(int i=0; i<M; i++) {
//            marr[i] = Integer.parseInt(st2[i]);
//        }
//
//        for(int a : marr) {
//            int has = 0;
//            if(nset.contains(a)) {
//                has = 1;
//            }
//
//            sb.append(has + "\n");
//        }
//            System.out.println(sb);

////      수 찾기 - 이진탐색으로 풀어보기
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int N = Integer.parseInt(br.readLine());
//        String[] st1 = br.readLine().split(" ");
//        int[] narr = new int[st1.length];
//        for(int i = 0; i<st1.length; i++){
//            narr[i] = Integer.parseInt(st1[i]);
//        }
//        Arrays.sort(narr);
//        int M = Integer.parseInt(br.readLine());
//        String[] st2 = br.readLine().split(" ");
//        int[] marr = new int[st2.length];
//        for(int i = 0; i<st2.length; i++){
//            marr[i] = Integer.parseInt(st2[i]);
//        }
//         for(int i=0; i<M; i++) {
//             int start = 0;
//             int end = N - 1;
//             int exist = 0;
//             while (start <= end) {
//                 int idx = (start + end) / 2;
//                 if (narr[idx] == marr[i]) {
//                     exist = 1;
//                     break;
//                 } else if (narr[idx] > marr[i]) {
//                     end = idx - 1;
//                 } else {
//                     start = idx + 1;
//                 }
//             };
//             bw.append (exist + "\n");
//         }
//         bw.flush();
//         bw.close();


//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        int[] intArr = new int[N];
//        String[] temp1 = br.readLine().split(" ");
//        for( int i = 0; i<N; i++) {
//            intArr[i] = Integer.parseInt(temp1[i]) ;
//        }
//        int M = Integer.parseInt(br.readLine());
//        int[] intArr2 = new int[N];
//        String[] temp2 = br.readLine().split(" ");
//        for( int i = 0; i<N; i++) {
//            intArr2[i] = Integer.parseInt(temp2[i]) ;
//        }
//
//        for (int i = 0; i<M; i++) {
//            int count = 0;
//            for (int j = 0; j<N; j++) {
//                if (intArr2[i] == intArr[j]) {
//                    count++;
//                }
//            }
//            System.out.println(count);
//        }


//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        int[] range = new int[N];
//        for (int i = 0; i<N; i++) {
//            String[] s = br.readLine().split(" ");
//            range[i] = Integer.parseInt(s[i]);
//        }
//        Arrays.sort(range);
//        int M = Integer.parseInt(br.readLine());
//        int[] find = new int[M];
//        for (int i = 0; i<M; i++) {
//            String[] s = br.readLine().split(" ");
//            find[i] = Integer.parseInt(s[i]);
//        }
//        for(int i=0; i<find.length; i++) {
//
//                int index = Arrays.binarySearch(range, find[i]);
//                int count = 0;
//                if(index >= 0) count++;
//                System.out.println(count);
//
//            }


////      프로그래머스 - 두 수 뽑아서 더하기
//        int[] numbers = {2, 1, 3, 4, 1};
//        Set<Integer> sum = new HashSet<>();
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//                sum.add(numbers[i] + numbers[j]);
//            }
//        }
//        int[] answer = new int[sum.size()];
//        int index = 0;
//        for(int a : sum) {
//            answer[index] = a;
//            index++;
//        }
//        Arrays.sort(answer);
//        System.out.println(Arrays.toString(answer));

////        가운데 글자 가져오기



////        특정 문자 제거하기
//        String my_string="BCBdbe";
//        String letter="B";
//        "abcde" : 결과

//        String answer ="";
//        for ( int i = 0; i< my_string.length(); i++){
//            if( my_string.charAt(i) != letter.charAt(0) ) {
//                 answer += my_string.charAt(i);
//            }
//        }
//        System.out.println(answer);

//        for(char ch : my_string.toCharArray())  {
//            if(ch!=letter.charAt(0)){
//                answer += ch;
//            }
//        }
//        System.out.println(answer);

////        프로그래머스 문자열밀기
//        String A="hello";
//        String B="lohel";
//        StringBuffer sb = new StringBuffer(A);
//        int answer = 0;
//        for(int i = 0; i<A.length(); i++);
//            sb.insert(0,끝자릿값);
//            sb.deleteCharAt(sb.length()-1);
//            answer++;
//            if(B.equals(sb)) {
//                break;
//            }

//        String db = A+A;    //hellohello
//        if (db.contains(B)) {
//            answer = A.length()-  db.indexOf(B);
//        } else answer = -1;
//        System.out.println(answer);

//        String A = "hello";
//        String B = "lohel";  //hellohello
//        int answer = 0;
//        while (A!=B){
//            StringBuffer sb = new StringBuffer();
//            sb.append(A.substring(A.length()-1,A.length()));
//            A = sb + A.substring(0,A.length()-1);
//            answer++;
//
//        }
//        System.out.println(answer);


//        A를 StringBuilder로 변환
//        A를 마지막값을 앞으로 insert, 마지막값 제거
//        A와 B를 비교
//        StringBuilder sb = new StringBuilder(A);
//        int count =0;
//        for (int i =0; i<A.length(); i++){
//            sb.insert(0, 끝자리값);
//            sb.deleteCharAt(sb.length()-1);
//            count++;
//            if(A와 B가 같으면)
//        }
//

        }
    }





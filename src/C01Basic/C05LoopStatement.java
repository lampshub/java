package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class C05LoopStatement {
    public static void main(String[] args) throws IOException {

//        while문의 조건식에 변화를 주지 않으면 while문은 기본적으로 무한루프.
//        int a = 0;        //초기식
////        아래 while문은 10번 반복되는 반복문
//        while (a < 10) {      //조건식
//            System.out.println("hello world");
//            a++;          //증감식
//        }

//        while문을 활용하여 2~10까지 출력
//        int b = 2;
//        while (b < 11) {
//            System.out.println(b);
//            b++;
//        }
//        int c = 2;
//        while (true) {
//            System.out.println(c);
//            c++;
//            if (c > 10) {
////                break 키워드를 통해 가장 가까이에 있는 반복을 즉시 종료
//                break;
//            }
//        }

//        반복되는 도어락키 예제
//        만약 비밀번호를 맞추면 즉시 종료 -> 문이 열렸습니다 출력
//        5회입력을 초과할때까지 맞추지 못하면 종료 -> 비밀번호 5회초과 출력
//        int count = 0;
//        while (true) {
//            String answer = "1234";
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            String input = br.readLine();
//            if (input.equals(answer)) {
//                System.out.println("문이 열렸습니다");
//                break;
//            } else {
//                System.out.println("비밀번호가 틀렸습니다");
//                count++;
//            }
//            if (count == 5) {
//                System.out.println("비밀번호 5회초과");
//                break;
//            }
//        }

//        int count = 0;
//        while(true) {
//            String answer = "1234";
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            String input = br.readLine();
//            if(input.equals(answer)){
//                System.out.println("문이 열렸습니다.");
//                break;
//            } else {
//                System.out.println("비밀번호가 틀렸습니다.");
//            }
//             count++;
//            if(count == 5) {
//                System.out.println("비밀번호 5회초과");
//                break;
//            }
//        }

//        입력한 숫자의 구구단 단수 출력 ex)2를 입력 -> 2X1=2 2X2=4 ... 2X9=18
//        while (true) {
//            Scanner sc = new Scanner(System.in);
//            int n = Integer.parseInt(sc.nextLine());
//            int count = 1;
//            while (count < 10) {
//                System.out.println(n + "X" + count + "=" + n * count);
//                count++;
//            }
//        }
//        do while문 : 무조건 1번은 실행되는 while문
//        int a = 100;
//        do{
//            System.out.println("hello world");
//        }
//        while (a<10);
//
//        int b = 100;
//        while (b<10) {
//        System.out.println("hello world");
//        }

//        for문 : 초기식, 조건식, 증감식이 모두 포함돼 있는 반복문
//            for (int i = 0; i < 10; i++) {
//                System.out.println("hello world");
//            }

//        1~10중에 홀수만 출력하기
//        for (int n=1; n<11; n++) {
//            if(n%2 == 1) {  // 홀수 : n%2 != 0
//                System.out.println(n);
//            }
//        }

//        continue : 반복문의 증감, 조건식으로 이동하는 명령어. 즉 , continue하위의 코드를 더이상 실행하지 않음
//            for (int n = 1; n < 11; n++) {
//                if (n % 2 == 0) {
////                continue는 코드의 직관성과 가독성을 위해 사용.
//                    continue;
//                }
//                System.out.println(n);
//            }


        }
    }

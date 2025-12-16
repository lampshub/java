package C02MethodClass;

import java.util.Scanner;

public class C02MethodPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        if (isPrime(input)) {
            System.out.println("입력하신 숫자는 소수입니다.");
        } else {
            System.out.println("입력하는 숫자는 소수가 아닙니다.");
        }
    }

//    소수판별기 메서드(isPrime) 생성
//    접근제어자(public), 클래스메서드, 반환타입 boolean, 입력값(매개변수) int (단일숫자값입력)
    public static boolean isPrime(int num) {
        if (num <= 1)  return false;
//            메서드에서 return을 만나면 메서드가 강제 종료

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
            return false;
            }
        }
        return true;    //위에 해당되면 이미 종료됨. 나머지만 true.
    }


    public static void voidMethod(){
        if(true) {
//          void메서드에서 return은 메서드 강제종료 목적으로 사용(호춭 X)
            return;
        }
        System.out.println("hello world");  //이건 return값은 아님. 그냥 출력임
    }
}

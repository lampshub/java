package C01Basic;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07ReferenceType {
    public static void main(String[] args) {
//       String, 배열, List, Map, Set, Stack... -> 클래스를 근간으로 함 / 클래스-> 소스코드의 집합
//        -> 클래스 기반의 참조자료형(객체) / 클래스 == 객체
//        int, boolean같은 기본자료형은 아님

////        기본(원시)자료형 : int, char, boolean 등
////        특징 : 리터럴형식(값그대로)으로 값 세팅
//            int a = 10;
////        참조자료형 : 기본자료형을 제외한 클래스 기반의 객체
////        특징 :  new 키워드를 통해 값 세팅
//        String st1 = new String("hello world");
////        String은 예외적으로 리터럴값 세팅 허용
//        String st2 = "hello world";
////        참조자료형을 출력하면 힙메모리의 주소값이 출력되어야 하나,  String 내부에  toString메소드가 구현 및 자동호출 되도록 설계
//        System.out.println(st1);
////        1. 원래는 힙메모리의 주소값이 출력
////        2. String 내부에 toString 메소드가 자동으로 호출됨
//
//        int[] arr1 = new int[4];
////        배열도 객체이므로 new 키워드를 써야 하나, 예외적으로 리터럴값 세팅 허용
//        int[] arr2 = {1, 3, 5, 7};
//        System.out.println(arr2);
////        배열은 toString메서드가 별도로 구현되어있기 때문에 별도로 호출해줘야함
//        System.out.println(Arrays.toString(arr2));

//        원시자료형은 스택메모리에 값이 저장되므로, ==로 비교시 값자제를 비교
//        int a = 10;
//        int b = 10;
//        System.out.println(a==b);
//
////        참조자료형은 스택메모리에 힙메모리의 주소값이 저장되므로, ==로 비교시 메모리주소값을 비교
//        String st1 = new String("hello");
//        String st2 = new String("hello");
//        System.out.println(st1==st2);     //false
////        별도의 메서드(equals)를 통해 힙메모리의 값을 비교
//        System.out.println(st1.equals(st2));      //true

//        WrapperClass : 기본형타입을 Wrapping한 클래스(참조자료형)
////        int - Integer, long - Long, char - Character
//        int i1 = 10;
////        i1 안에는 기능이 없음
//        Integer i2= 10;
////        i2.equals() i2.compareTo() i2.toString() 등등 기능이 있는 클래스
//
////        Wrapper클래스의 주요 메서드 사용 예시
//        String st1 = Integer.toString(i1);
//        int i3 = Integer.parseInt(st1);
//
//        추후 배우게 될 list, map, set 등 참조자료형에는 원시자료형을 쓸수 없음
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);  // 오토 박싱 됨. 아니라면 list1.add(Integer.~~)
        list1.add(20);
        list1.add(30);

////        다만, 예외적으로 배열(참조자료형)에는 원시자료형 세팅 가능
//        int[] arr1 = {10,20,30};

        int i1=10;
//        Integer ig1 = new Integer(10);
//        오토박싱 : 원시자료형 -> Wrapper클래스 자동 형변환
        Integer ig1 = i1;
//        오토언박싱 : Wrapper클래스 -> 원시자료형 자동 형변환
        int i2 = ig1;


    }
}

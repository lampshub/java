package C06EtcClass;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Stream;

public class C04GenericMain {
    public static void main(String[] args) {
//        String[] stArr = {"java","python","C++"};
//        stChange(stArr,0,1);
//        System.out.println(Arrays.toString(stArr));
//
//        Integer[] intArr = {10,20,30};
//        intChange(intArr,0,1);
//        System.out.println(Arrays.toString(intArr));
//
//        allChange(stArr,1,2);
//        allChange(intArr,1,2);
//        System.out.println(Arrays.toString(stArr));
//        System.out.println(Arrays.toString(intArr));

//        제네릭을 사용한 객체 생성
        GenericPerson<String> p1 = new GenericPerson<>("honggildong");
        GenericPerson<Integer> p2 = new GenericPerson<>(10);
        System.out.println(p1.getValue());
        System.out.println(p2.getValue());

//    제네릭의 사용 예시
        List<String> myList = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        Stream<String> myStream;
        Optional<Student> myStudent;

    }

    static void stChange(String[] stArr, int a, int b){
        String temp = stArr[a];
        stArr[a] = stArr[b];
        stArr[b]= temp;
    }
    static void intChange(Integer[] arr, int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b] = temp;
    }
//    메서드차원에서 제네릭사용
//    제네릭메서드는 반환타입 왼쪽에 <T>라고 선언
//    이때 T는 참조형변수인 객체타입만을 허용
    static <T> void allChange(T[] arr, int a, int b){
        T temp = arr[a];
        arr[a]=arr[b];
        arr[b] = temp;
    }
}

//클래스차원에서 제네릭 사용
class GenericPerson<T>{
    private T value;

    public GenericPerson(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
}
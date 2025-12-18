package C02MethodClass;

import java.util.ArrayList;
import java.util.List;

//재귀함수 기본 호출 원리와 과정
public class C11RecursiveBasicFlow {
    public static void main(String[] args) {
//        recur0(0, 3);
//        recur1(0, 3);
        recur2(new ArrayList<>(), 0, 3);
    }

//    기본자료형 변수의 재귀함수 내 변화과정 (매개변수로 넘기는 시점에 값 변경)
    public static void recur0(int count, int target) {
        if (count == target) {
            return;
        }
        System.out.println("재귀 호출전 count : " + count);  // f1 0(첫번째) -> f2 1(두번째) -> f3 2(세번째)
        recur0(count + 1, target);   // 메서드 내부에서 해당 메서드를 다시 호출
        System.out.println("재귀 호출후 count : " + count);  // f3 2(네번째) -> f2 1(다섯번째) -> f3 0(여섯번째)
    }

//    기본자료형 변수의 재귀함수 내 변화과정 (함수내에서 값 변경)
    public static void recur1(int count, int target) {
        if (count == target) {
            return;
        }
        System.out.println("재귀 호출전 count : " + count);  // 0(첫번째) -> 1(두번째) -> 2(세번째)
        count += 1;
        recur1(count, target);
        System.out.println("재귀 호출후 count : " + count);  // 3(네번째) -> 2(다섯번째) -> 1(여섯번째)
    }

//    객체를 매개변수로 활용한 재귀함수 내 변화과정 : 객체는 힙메모리를 통해 원본객체가 변경되므로, 재귀함수간에도 값의 변화를 공유
    public static void recur2(List<Integer> myList, int count, int target) {
        if (myList.size() == target) {
            return;
        }
        myList.add(count);
        recur2(myList, count + 1, target);
        System.out.println(myList);     // [0,1,2] 네번째, [0,1,2] 다섯번째, [0,1,2] 여섯번째
        myList.remove(myList.size()-1);     // [0,1,2] 네번째, [0,1] 다섯번째, [0] 여섯번째
    }



}


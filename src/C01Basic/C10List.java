package C01Basic;

import java.util.*;

public class C10List {
    public static void main(String[] args) {
//        List 선언방법 1
//        ArrayList<String> myList1 = new ArrayList<String>();
//        ArrayList<String> myList2 = new ArrayList<>();
//
////        List 선언방법 2 : 가장 일반적인 방법
//        List<String> myList3 = new ArrayList<>();
//
////        초기값 세팅방법 1. 개별data를 add
//        myList3.add("java");
//        myList3.add("python");
//        myList3.add("C++");
//
////        초기값 세팅방법 2. 배열을 리스트로 변환
//        String[] arr = {"java", "python","C++"};
//        List<String> myList4 = new ArrayList<>(Arrays.asList(arr));
//
////        List의 출력
////        List 등의 컬랙션프레임워크 안에는 toString메서드가 구현되어있고, 자동호출
//        System.out.println(myList3);
//        System.out.println(myList4);
//
////        List 안의 자료타입으로는 기본형타입은 쓸 수 없음
//        int[] intArr = {10,20,30};
//        List<Integer> myList5 = new ArrayList<>();
//        for (int i : intArr) {
//            myList5.add(i);
//        }

//        add : 리스트에 값을 하나씩 추가하는 메서드
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(0,30); //List는 중간위치에 데이터를 삽입/삭제한느 작업은 비효율적
//        System.out.println(myList);
//
////        get(index) : 특정 index의 요소 반환
//        System.out.println(myList.get(2));
//
////        size : 리스트의 개수(길이)를 반환
//        System.out.println(myList.size());
//
////        리스트의 값 출력 방법1. 일반for문(index활용)
//        for(int i = 0; i < myList.size(); i ++) {
//            System.out.println(myList.get(i));
//        }
//
////        리스트의 값 출력 방법2. 향상된 for문
//        for ( int j : myList) {
//            System.out.println(j);
//        }

//        remove : 값 삭제
//        List<Integer> num = new ArrayList<>();
//        num.add(10);
//        num.add(20);
//        num.add(30);
////        num.remove(0);  //이렇게 앞에것을 삭제하면 뒤에것들이 한칸씩 땡겨온다
//        num.remove(num.size()-1);   //그래서 맨 뒤에걸 삭제하는 방식으로 사용

//        indexOf : 특정값을 찾아 index return (가장 먼저 나오는 값)
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//        myList.add(30);
//        System.out.println(myList.indexOf(30));
//
////        contains : 값이 있는지 없는지 여부를 리턴 (boolean값 리턴)
//        System.out.println(myList.contains(20));


//        프로그래머스 : n의 배수 고르기    ** 다시 풀어보기

//        정렬 : 방법2가지 (Collections클래스의 sort메서드 사용, 객체의 sort메서드 사용)
//        List<Integer> myList = new ArrayList<>();
//        myList.add(5);
//        myList.add(3);
//        myList.add(2);
//        myList.add(1);
//        myList.add(4);
//
////        방법1
//        Collections.sort(myList);   //오름차순 정렬
//        System.out.println(myList);
//        Collections.sort(myList, Comparator.reverseOrder());    //내림차순
//        System.out.println(myList);
//
////        방법2
//        myList.sort(Comparator.naturalOrder()); //오름차순
//        System.out.println(myList);
//        myList.sort(Comparator.reverseOrder()); //내림차순
//        System.out.println(myList);

//        이중리스트 : 리스트안의 리스트 [[1,2,3],[4,5,6],...]
//        [[1,2,3],[4,5,6]]
//        List<List<Integer>> myList = new ArrayList<>();
//        List<Integer> m1 = new ArrayList<>();
//        myList.add(m1); // [[]]
//        myList.add(new ArrayList<>()); // [[],[]]
//        m1.add(1);
//        m1.add(2);
//        m1.add(3);  //[[1,2,3],[]]
//        myList.get(1).add(4);
//        myList.get(1).add(5);
//        myList.get(1).add(6);   //[[1,2,3],[4,5,6]]
//        System.out.println(myList);

//        [[1,2,3],[4,5,6],[7,8,9],...,[58,59,60]] 형태의 이중리스트 생성
//        List<List<Integer>> num = new ArrayList<>();
//        int number = 1;
//        for (int i = 0; i<60/3; i++){
//            num.add(new ArrayList<>());
//            for(int j = 1; j<=3; j++){
//                num.get(i).add(number);
//                number++;
//            }
//        }
//        System.out.println(num);

//        리스트안의 배열   [{10,20},{1,2,3},{4,3,2,1}]
        List<int[]> myList = new ArrayList<>();
        int[] arr = new int[2];
        arr[0] = 10;
        arr[1] = 20;
        myList.add(arr);

        myList.add(new int[3]);
        myList.get(1)[0]=1;
        myList.get(1)[1]=2;
        myList.get(1)[2]=3;

        myList.add(new int[]{4,3,2,1});
//        System.out.println(myList); //배열주소값이 출력 [x1배열주소, x2배열주소, x3배열주소]
        for (int i = 0; i< myList.size(); i++) {
            System.out.print(Arrays.toString(myList.get(i)));
        }

    }
}

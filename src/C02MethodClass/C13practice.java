package C02MethodClass;

import java.util.ArrayList;
import java.util.List;

public class C13practice {
    public static void main(String[] args) {
//        for(int i = 0; i<3; i++){
//            for(int j=0; j<3; j++){
//               System.out.println("hello");
//            }
//        }                 => 3*3 9번
//        recurFor(0,3);    => 3*3*3 27번

        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
//        List<List<Integer>> doubleList = new ArrayList<>();
//        for(int i = 0; i<myList.size(); i++){
//            for(int j = i+1; j<myList.size(); j++){
//                List<Integer> temp = new ArrayList<>();
//                temp.add(myList.get(i));
//                temp.add(myList.get(j));
//                doubleList.add(temp);
//            }
//        }
//        System.out.println(doubleList);

//  재귀함수로 만들기 위해 반복되는 for문 구조를 같게 만들어야함
        List<List<Integer>> doubleList = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for(int i = 0; i<myList.size(); i++){
            temp.add(myList.get(i));
            for(int j = i+1; j<myList.size(); j++){
                temp.add(myList.get(j));
                doubleList.add(new ArrayList<>(temp));
                temp.remove(temp.size()-1);
            }
            temp.remove(temp.size()-1);
        }
        System.out.println(doubleList);
    }

//    이중리스트에 조합(Combination) 담기 메서드
//    public static void comb(List<Integer> myList, int start, int end, int n,  )


//    다중 for문 메서드
    public static void recurFor(int start, int end){
        if(start == end) {
            System.out.println("hello");
            return;
        }
        for(int i=0; i<3; i++){
            recurFor(start+1, end);
        }
    }




}

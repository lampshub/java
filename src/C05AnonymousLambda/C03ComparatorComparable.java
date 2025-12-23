package C05AnonymousLambda;

import java.util.*;

public class C03ComparatorComparable {
    public static void main(String[] args) {
////        java에서는 비교를 위한 인터페이스 대표적으로 2개 제공
////        1. Comparator인터페이스 : 인터페이스내 compareTo메서드만 존재
////        2. Comparable인터페이스 : 인터페이스내 compare메서드만 존재
////        => 메서드가 1개이므로 익명객체를 (람다식으로) 넣기 좋음
//
//        List<Integer> myList  = new ArrayList<>();
//        myList.add(20);
//        myList.add(10);
//        myList.add(30);
////        java의 대부분의 정렬함수는 매개변수로 Comparator객체 요구
//        myList.sort(Comparator.naturalOrder());
////        o1과 o2의 숫자값을 마이너스 형식으로 코딩을 하되,
////        o1이 먼저 있으면 오름차순, o2가 먼저 있으면 내림차순
////        myList.sort(new Comparator<Integer>() {
////            @Override
////            public int compare(Integer o1, Integer o2) {
////                return o1-o2;   //오름차순
//////              return o2-o1;   //내림차순
////            }
////        });
//        myList.sort((o1, o2) -> o1-o2);  //위에 정렬을 람다식으로 표현
//
//        List<String> myList2 = new ArrayList<>();
//        myList2.add("java");
//        myList2.add("python");
//        myList2.add("C++");
////        기본적인 문자열정렬일때에는 Comparator커스텀을 하지 않고,
////        복잡한 자기만의 정렬기준을 가지고 정렬해야 할때 Comparator 익명객체 생성
////        Collections.sort(myList2, Comparator.reverseOrder());
////        Collections.sort(myList2, new Comparator<String>() {
////            @Override
////            public int compare(String o1, String o2) {
////                return o1.compareTo(o2); //오름차순
//////                return o2.compareTo(o1); //내림차순
////            }
////        });
//        Collections.sort(myList2, (o1, o2) -> o2.compareTo(o1));
//        System.out.println(myList2);
////        길이를 기준으로 오름차순
////        return o1.length()-o2.length();
//
//
////        ex) 문자열의 길이로 정렬하되, 문자열의 길이가 같은 경우에는 알파벳순으로 정렬
//        Collections.sort(myList2, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if(o1.length() == o2.length()){
//                    return o1.compareTo(o2);
//                } else {
//                return o1.length() - o2.length();
//            }
//        }});
//        System.out.println(myList2);
//
////        백준 : 단어정렬
//
////        배열, 리스트 정렬외에 java의 그외 정렬자료구조
////        Queue<String> pq = new PriorityQueue<>(Comparator.reverseOrder());
//        Queue<String> pq = new PriorityQueue<>((o1, o2) -> o1.length()-o2.length());  //Comparator 익명객체구현해서 할수있음
//        Set<String> treeSet = new TreeSet<>((o1, o2) -> o1.length()-o2.length());

////        백준 : 최대값힙(11286)
//
////        백준 : 선긋기
//
////        리스트 안의 배열 정렬
////        [{4,5},{1,2},{5,0},{3,1}]
////        리트스안의 배열에 1번째 index를 기준으로 오름차순 정렬
//          List<int[]> myList = new ArrayList<>();
//          myList.add(new int[]{4,5});
//          myList.add(new int[]{1,2});
//          myList.add(new int[]{5,0});
//          myList.add(new int[]{3,1});
//          myList.sort(new Comparator<int[]>() {
//              @Override
//              public int compare(int[] o1, int[] o2) {
//                  return o1[1]-o2[1];
//              }
//          });
//
//          for(int[] a : myList){
//              System.out.println(Arrays.toString(a));
//          }

//          직접 만든 객체 정렬
//        방법1. Comparator를 구현한 익명객체 방식
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("h1",20));
        studentList.add(new Student("g1",31));
        studentList.add(new Student("e1",25));
        studentList.add(new Student("f1",41));

//        studentList.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
        studentList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

//        방법2. Comparable을 구현한 방식 -> 짜여진 코드를 읽을줄 아는 정도로만 알아두면 됨/Comparator로 대체 가능함
//        Student객체 안에 Comparable을 implements하는 방식
//        studentList.sort(); => Comparator만 구현하게 되어있음
//        sort 실행시 자동으로 Student안의 compareTo메서드 호출
        Collections.sort(studentList); //Comparable 객체 안에 compareTo를 구현
//        List<String> myStrings = new ArrayList<>();
//        myStrings.add("hello");
//        Collections.sort(myStrings);
//        Collections.sort(myStrings.sort(););

    }
}

class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    Comparable의 compareTo에서는 this와 매개변수로 주어지는 객체와 비교
//    this가 앞에 있으면 오름차순, 매개변수객체가 앞에 있으면 내림차순
    @Override
    public int compareTo(Student o) {    //매개변수 1개 this와 매개변수를 비교  (Comparator는 o1,o2비교)
        return this.getName().compareTo(o.getName());
    }

//class Student{
//    private String name;
//    private int age;
//
//    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}

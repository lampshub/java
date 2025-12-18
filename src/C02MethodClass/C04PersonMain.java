package C02MethodClass;

public class C04PersonMain {
    public static void main(String[] args) {
////        회원가입 예시
//        String name1 = "hong1";
//        String email1 = "hong1@naver.com";
//        int age1 = 30;
//        printMember(name1,email1,age1);

//        String name2 = "hong2";
//        String email2 = "hong2@naver.com";
//        int age2 = 40;
//        printMember(name2,email2,age2);
////        문제점 -> 위 코드는 요소(속성)들이 그룹화되어있지 않다보니, 중복과 코드의 가독성이 저하

////        클래스에 속성을 정의하여, 사람 객체로 생성
//        C04Person p1 = new C04Person();
////        객체명.변수명
//        p1.name = "hong1";
//        p1.email = "hong1@naver.com";
//        p1.age = 30;
////        p1이라는 객체안의 힙메모리에 name,email,age 가 저장되어있음 -> 그룹화 돼있음.
//
//        C04Person p2 = new C04Person();
//        p2.name = "hong2";
//        p2.email = "hong2@naver.com";
//        p2.age = 40;
//
//        printMember2(p1);
//        printMember2(p2);
//    }

//        위 코드의 문제점
//        1. person 객체의 변수에 외부 클래스에서 접근가능
//        2. person에 대한 출력코드가 외부클래스마다 중복되어 들어갈 여지가 있음
        C04Person p3 = new C04Person();
        p3.setName("hong3");
        p3.setEmail("hong3@naver.com");
        p3.setAge(30);
        printMember2(p3);
        System.out.println(p3.returnPersonInfo());
//        System.out.println(p3); //p3가 객체이므로 출력하면 힙메모리주소값이 나옴


////    사용자정보 출력메서드 (printMember)
////    예시) 이름은 XX, 이메일은 yy, 나이는 zz입니다.
//    public static void printMember(String name, String email, int age){
//        System.out.println("이름은 "+ name + ", 이메일은 " + email + ", 나이는 " + age + " 입니다.");
//    }
    }

    public static void printMember2 (C04Person person){   //객체의 주소값이 매개변수(person)로 전달
//        System.out.println("이름은 "+ person.name + ", 이메일은 " + person.email + ", 나이는 " + person.age + " 입니다."); //객체변수에 접근X
        System.out.println("이름은 "+ person.getName() + ", 이메일은 " + person.getEmail() + ", 나이는 " + person.getAge() + " 입니다.");
    }
}
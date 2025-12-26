package C06EtcClass;

public class C03EnumMain {
    public static void main(String[] args) {
//        12/23 오전10시수업
////       classGrade를 일반문자열로 설계했을 경우 -> 데이터 종류에 대한 통제 불가
//        Student s1 = new Student("h1","FIRST_GRADE");
//        Student s2 = new Student("h2","first_grade");
//        Student s3 = new Student("h3","1학년");     //학년에 대한 값을 임의로 작성하게 될수있음

////      static final 변수로 설계했을 경우
//        Student s1 = new Student("h1", ClassGrade.c1);
//        Student s2 = new Student("h2", ClassGrade.c2);
//        Student s3 = new Student("h3","1학년");     //type자체가 String이므로 임의로 작성하는것이 방어가 안됨

////        classGrade를 Enum클래스로 설계했을 경우
        Student s1 = new Student("h1", ClassGrade.FIRST_GRADE);
        Student s2 = new Student("h2", ClassGrade.FIRST_GRADE);
        Student s3 = new Student("h3", ClassGrade.SECOND_GRADE);
        System.out.println(s1);

    }
}

//enum 클래스는 데이터 종류를 하나의 enum명 아래 묶는것
enum ClassGrade {
    //    enum의 변수값은 static final 변수처럼 사용
    FIRST_GRADE, SECOND_GRADE, THIRD_GRADE
}

//class ClassGrade {
//    static final String c1 = "FIRST_GRADE";
//    static final String c2 = "SECOND_GRADE";
//    static final String c3 = "THIRD_GRADE";
//}

class Student {
    private String name;
//    private String classGrade; //static final 변수를 String 타입으로 씀
    private ClassGrade classGrade;  //enum을 타입으로 사용(String아님)

    public Student(String name, ClassGrade classGrade) {    //매개변수 타입이 ClassGrade
//    public Student(String name, String classGrade) {      //매개변수 타입이 String
        this.name = name;
        this.classGrade = classGrade;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", classGrade='" + classGrade + '\'' +
                '}';
    }
}
//package C07ExceptionFileParsing;
//
//import java.util.Scanner;
//
//public class C02ExceptionAdvance {
//    public static void main(String[] args) {
////      의도된 예외 강제 발생 : 특정 시점에 프로그램을 강제 중지시키기 위한 목적
//        Scanner sc = new Scanner(System.in);
//        System.out.println("email을 입력해주세요");
//        String email = sc.nextLine();
//        System.out.println("password를 입력해주세요");
//        String password = sc.nextLine();
//        try {
//            register(email, password);
//        } catch (IllegalArgumentException e){
//            System.out.println("회원가입 중에 에러가 발생했습니다.");
//            System.out.println(e.getMessage());
//            return;
//        }
//
//
//        static boolean register(String email, String password){boolean check = false;
//        if(password.length()>=10){
//            check = true;
//        }else {
////            예외를 강제 발생시킴으로서 이 시점에서 해당 메서드 강제 종료
////            예외는 기본적으로 메서드를 호출한 쪽으로 전파
//            throw new IllegalArgumentException("비밀번호가 너무 짧습니다.");
//        }
//        System.out.println("DB에 저장되는 코드");
//        return check;
//        }
//    }
//}

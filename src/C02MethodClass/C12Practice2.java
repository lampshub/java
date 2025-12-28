package C02MethodClass;

public class C12Practice2 {
    public static void main(String[] args) {
//        System.out.println(sumAcc(0,10));
//        System.out.println(factorial(5));
        System.out.println(fibonacci(10));
    }

    public static int sumAcc(int start, int end) {
        if (start > end) {
            return 0;
        }
        return start + sumAcc(start + 1, end);
    }

    public static int factorial(int end){
        if(end==1){
            return 1;
        }
        return end*factorial(end-1);
    }

    public static long fibonacci(int n){
        if(n<=2){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

//    public static int sumAcc(int start, int end) {
//        if (start > end) {
//            return 0;
//        }
//        return start + sumAcc(start + 1, end);
//    }
//
//    public static int factorial(int num) {
//        if (num == 1) {
//            return 1;
//        }
//        return num * factorial(num - 1);
//    }
//
//    public static int fibonacci(int num) {
//        if (num <= 2) {return 1;}
//        else return  fibonacci(num - 1) + fibonacci(num - 2);
//
//    }

}

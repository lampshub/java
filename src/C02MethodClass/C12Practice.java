package C02MethodClass;

public class C12Practice {
    public static void main(String[] args) {
//        System.out.println(sumAcc(1,10));
//        System.out.println(factorial(5));
//            피보나치수열 f(n) = f(n-1)+f(n-2)
//        8번째 값을 찾아라 -> 1 1 2 3 5 8 13 .21. 34 55 89
        System.out.println(fibonazzi(11));
    }

    public static int sumAcc(int start, int end){
        if(start>end){
            return 0;
        }
        return start+sumAcc(start+1,end);
    }

    public static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static int fibonazzi(int n){
        if(n<=2) {
            return 1;
        }
        return fibonazzi(n-1)+fibonazzi(n-2);
    }

}

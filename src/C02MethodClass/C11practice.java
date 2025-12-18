package C02MethodClass;

import java.util.ArrayList;
import java.util.List;

public class C11practice {
    public static void main(String[] args) {
//        recur0(0, 3);
//        recur1(0, 3);
        recur2(new ArrayList<>(), 0, 3);
    }

    public static void recur0 (int count, int target) {
        if(count==target){
            return;
        }
        System.out.println("재귀 호출전 count : " + count);
        recur0(count+1,target);
        System.out.println("재귀 호출후 count : " + count);
    }

    public static void recur1 (int count, int target) {
        if (count == target) {
            return;
        }
        System.out.println("재귀 호출전 count : " + count);
        count += 1;
        recur1(count, target);
        System.out.println("재귀 호출후 count : " + count);
    }

    public static void recur2(List<Integer> mylist, int count, int target) {
        if(count == target){
            return;
        }
        mylist.add(count);
        System.out.println(mylist);
        recur2(mylist, count + 1, target);
        System.out.println(mylist);
        mylist.remove(mylist.size()-1);
    }


    }




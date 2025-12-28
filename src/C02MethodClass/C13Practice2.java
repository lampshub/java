package C02MethodClass;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C13Practice2 {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
////        조합 combi
//        List<List<Integer>> doubleList = new ArrayList<>();
//        combi(0,myList, 2, doubleList, new ArrayList<>());
//        System.out.println(doubleList);

//        순열 permu
        List<List<Integer>> doubleList = new ArrayList<>();
        permu(new boolean[myList.size()], myList, doubleList, new ArrayList<>(), 2);
        System.out.println(doubleList);
    }

    public static void permu(boolean[] visited, List<Integer> myList, List<List<Integer>> doubleList, List<Integer> temp, int n){
        if(temp.size()==n) {
            doubleList.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0; i<myList.size(); i++){
            if (visited[i]) continue;
            temp.add(myList.get(i));
            visited[i]=true;
            permu(visited, myList, doubleList, temp, n);
            temp.remove(temp.size()-1);
            visited[i]=false;
        }
    }





    public static void combi(int start, List<Integer> myList, int n, List<List<Integer>> doubleList, List<Integer> temp){
    if(temp.size()==n){
        doubleList.add(new ArrayList<>(temp));
        return;
    }
        for(int i = start; i<myList.size(); i++){
            temp.add(myList.get(i));
            combi(i+1, myList, n, doubleList, temp);
            temp.remove(temp.size()-1);
        }
    }
}

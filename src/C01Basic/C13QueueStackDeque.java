package C01Basic;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C13QueueStackDeque {
    public static void main(String[] args) throws IOException {

//        ArrayList(리스트)
//        장점 : 조회성능빠름
//        단점 : 중간값 삭제 remove 성능저하
//
//        LinkedList(큐)
//        장점 : 맨 앞의 값 삭제성능빠름
//        단점 : 조회성능저하

////        Queue인터페이스를 LinkedList를 구현한 아래와 같은 방식으로 가장 많이 사용
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
////        poll은 큐에서 가장 앞의 데이터를 삭제하면서, 동시에 return하는 메서드
//        int value = myQue.poll();
//        System.out.println(value);  //10
//        System.out.println(myQue);  //20,30
////        peek은 큐에서 데이터를 삭제하지 않고, 가장 앞의 데이터를 return하는 메서드
//        int value2 = myQue.peek();
//        System.out.println(value2); //20
//        System.out.println(myQue);  //20,30

////        while문을 통한 queue출력 방식
//        Queue<String> printerQueue = new LinkedList<>();
//        printerQueue.add("문서1");
//        printerQueue.add("문서2");
//        printerQueue.add("문서3");
//        printerQueue.add("문서4");
////        큐는 일반적으로 while문을 통해 요소를 소모
//        while(!printerQueue.isEmpty()){
//            System.out.println(printerQueue.poll());
//        }

////        LinkedList와 ArrayList 성능차이 비교
////        LinkedList 장점 : 중간 삽입/삭제 성능 빠름, 단점 : 조회성능저하 (==Queue)
////        ArrayList 장점 : 조회성능빠름, 단점 : 중간 삽입/삭제 성능 저하 (==List)
//        LinkedList<Integer> myLinkedList = new LinkedList<>(); //O(n)
//        long starttime = System.currentTimeMillis();        // 시작시간 (초로 변환)
//        for(int i = 0; i< 1000000; i++){
//            myLinkedList.add(0,i);
//        }
//        long endTime = System.currentTimeMillis();        // 종료시간 (초로 변환)
//        System.out.println("linkedList에 중간에 값 add시에 소요시간 : " + (endTime - starttime));
//
//        ArrayList<Integer> myArrayList = new ArrayList<>(); //O(n제곱)
//        long starttime2 = System.currentTimeMillis();
//        for(int i = 0; i< 1000000; i++){
//            myArrayList.add(0,i);
//        }
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("arrayList에 중간에 값 add시에 소요시간 : " + (endTime2 - starttime2));

//        백준 : 카드2, 요세푸스 문제 0

////        길이제한큐
//        Queue<String> blockingQueue = new ArrayBlockingQueue<>(3);  //크기를 3으로 제한
////        blockingQueue.add("문서1");
////        blockingQueue.add("문서2");
////        blockingQueue.add("문서3");
////        blockingQueue.add("문서4");   //길이초과시 에러발생
//        blockingQueue.offer("문서1");
//        blockingQueue.offer("문서2");
//        blockingQueue.offer("문서3");
//        blockingQueue.offer("문서4");   //길이제한이 있다면 제한된 길이까지만 add. 에러발생X
//        System.out.println(blockingQueue);

////        우선순위큐PQ : 데이터를 poll할때 정렬된 데이터결과값(최소값/최대값) 보장 (어렵고 중요!!)
////        지속적으로 데이터가 추가/제거되면서 전체데이터가 실시간으로 변경되는 상황에 사용
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        System.out.println(pq);
//        while (!pq.isEmpty()) {
////            poll할때마다 최소값을 추출하게되고, 복잡도 log(n). peek은 최소값을 확인만 하고 추출은 X, 복잡도 log(n).
////            전체 데이터를 모두 poll하면 복잡도 n*log(n)
//        System.out.println(pq.poll()); // 10, 20, 30, 40, 50 -> 기본적으로 오름차순 (최소값)
//        }

////        백준 : 최소 힙

////        프로그래머스 : 더 맵게 ** (힙자료구조) 더 풀어보기



////         최대 힙 : poll할때마다 최대값을 추출
//          Queue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());

////        백준 : 카드 정렬하기


////        stack :후입선출의 자료구조
//        Stack<Integer> myStack = new Stack<>();
//        myStack.push(10);
//        myStack.push(20);
//        myStack.push(30);
//        System.out.println(myStack.pop()); //마지막에 입력한 값을 꺼내는것
//        System.out.println(myStack.peek()); //마지막에 입력한 값을 확인만
//        System.out.println(myStack.size());
//        System.out.println(myStack.isEmpty());


//        프로그래머스 : 올바른 괄호

//        프로그래머스 : 같은 숫자는 싫어


//        deque : addFirst, addLast, pollFirst, pollLast, peekFirst, peekLast
        Deque<Integer> myDeque = new ArrayDeque<>();
        myDeque.addLast(10);
        myDeque.addLast(20);
        myDeque.addFirst(30); //30, 10, 20
        System.out.println(myDeque.pollLast()); //20
        System.out.println(myDeque.pollFirst()); //30
        System.out.println(myDeque.pollFirst()); //10





    }
}

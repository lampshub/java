package C03Inheritance;

import java.util.LinkedList;
import java.util.Queue;

public class C03AnimalMain extends Animal {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound2();
        Cat c1 = new Cat();
        c1.sound();

//        상속관계일떄는 부모클래스의 타입을 자식클래스의 객체타입으로 지정가능
//        Dog d2 = new Dog();
        Animal d2 = new Dog();
        d2.sound();
//        부모클래스의 타입으로 지정시, 부모클래스에서 정의된 메서드만 객체에서 사용가능
//        d2.sound2();
//        Queue<Integer> queue = new LinkedList<>();
//        부모 (50개) = 자식 (100개) ;  -> 50개만 사용가능
    }
}

class Animal{
    public void sound(){
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Dog extends Animal{
@Override
    public void sound(){
        System.out.println("멍멍");
    }       //오버라이딩으로 사용가능
    public void sound2(){
        System.out.println("멍멍멍멍");
    }
}

class Cat extends Animal{
    public void sound2(){
        System.out.println("야옹야옹");
    }


}

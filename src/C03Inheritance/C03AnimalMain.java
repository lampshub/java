package C03Inheritance;

import java.util.LinkedList;
import java.util.Queue;

public class C03AnimalMain extends Animal {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound2();    //"멍멍멍멍"
        Cat c1 = new Cat();
        c1.sound();     //"동물이 소리를 냅니다."

//        상속관계일때는 부모클래스의 타입을 자식클래스의 객체타입으로 지정가능
//        Dog d2 = new Dog();
        Animal d2 = new Dog();
        d2.sound();         //"멍멍" -> 오버라이딩 된 sound() 출력. 여기서 d2.sound2()는 안됨.
//        부모클래스의 타입으로 지정시, 부모클래스에서 정의된 메서드만 객체에서 사용가능
//        d2.sound2();
//        Queue<Integer> queue = new LinkedList<>();
//        부모 (50개) = 자식 (100개) ;  -> 50개만 사용가능
//        부모-타입(사용가능한 버튼) -> 자식-객체(실제 동작)
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

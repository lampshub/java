package C03Inheritance;
//별로 안중요함~,.~
//부모클래스를 상속받을때, 자식객체의 생성자에서는 부모객체를 자동으로 생성
//이때, 부모생성자의 기본생성자가 없으면 자식클래스에서 에러 발생
public class C02SuperKeyword extends SuperParents {
    int a=20;
    public C02SuperKeyword(){
//        super() : 부모클래스의 생성자를 호출하는 메서드
        super(10);
        this.a = 20;
    }

    public static void main(String[] args) {
        C02SuperKeyword c1= new C02SuperKeyword();
        c1.display();
//        int a = this.a;
//        System.out.println(a);
    }

    public void display(){
        System.out.println("자식의 변수 : " + this.a);
    //    부모의 변수나 메서드에 접근할때에는 super 키워드 사용
        System.out.println("부모의 변수 : " + super.a);

    }
}

class SuperParents{
    int a=10;
    public SuperParents(int a){
        this.a=a;
    }
}

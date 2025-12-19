package C04Interface;

//인터페이스 상속(구현)시 implements 키워드 사용
public class C01Dog implements C01AnimalInterface1{

    @Override
    public void makesound() {
        System.out.println("멍멍");
    }
}

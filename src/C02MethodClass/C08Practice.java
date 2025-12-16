package C02MethodClass;

import java.util.ArrayList;
import java.util.List;

public class C08Practice {
    public static void main(String[] args) {
//        계좌개설(객체생성)
//        List를 계좌객체를 담는 자료구조로 사용 -2-3개 담기
        Account2 ac1 = new Account2("kim", "12345", 100000);
        List<Account2> account2List = new ArrayList<>();
        account2List.add(ac1);
        account2List.add(new Account2("choi", "54321", 50000));
        System.out.println(account2List);




//        계좌1("12345")에서 계좌2("54321")로 송금(50000) : 잔고변경메서드 필요
//        내 객체를 찾아서 50000원을 차감하고, 상대방 객체를 찾아서 50000원을 가산한다
//        set을 안쓰면 변경이 안됨 -> set 을 하게끔 setBalance 메서드 만들어야함

    }
}

// Account 클래스 - 계좌주명(name), 계좌번호(AccountNumber - String), 잔고(balance -long)
    class Account2  {
    private String name;
    private String AccountNumber;
    private long Balance;

    public Account2 (String name, String AccountNumber, long Balance) {
        this.name = name;
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
    }
    public Account2() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public long getBalance() {
        return Balance;
    }

    public void setBalance(long balance) {
        Balance = balance;
    }

    @Override
    public String toString() {
        return "Account2{" +
                "name='" + name + '\'' +
                ", AccountNumber='" + AccountNumber + '\'' +
                ", Balance=" + Balance +
                '}';
    }
}

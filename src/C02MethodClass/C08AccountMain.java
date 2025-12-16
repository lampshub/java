package C02MethodClass;

import java.util.ArrayList;
import java.util.List;

public class C08AccountMain {
    public static void main(String[] args) {
//        계좌개설(객체생성)
        Account A1 = new Account("hong", "12345", 100000);
        Account A2 = new Account("Kong", "22334", 50000);
        Account A3 = new Account("Jung", "54321", 30000);
//        List를 계좌객체를 담는 자료구조로 사용 -2-3개 담기
        List<Account> AccountList = new ArrayList<>();
        AccountList.add(A1);
        AccountList.add(A2);
        AccountList.add(A3);
        System.out.println(AccountList);


//        계좌1("12345")에서 계좌2("54321")로 송금(50000) : 잔고변경메서드 필요
//        내 객체를 찾아서 50000원을 차감하고, 상대방 객체를 찾아서 50000원을 가산한다
//        set을 안쓰면 변경이 안됨 -> set 을 하게끔 setBalance 메서드 만들어야함
//        for(Account a : AccountList) {
//            if(a.  0)) {
//                AccountList.set(2, AccountList.get(2)-50000)
//            } else
//        }


//        for (Account a : myList) {
//            if(a.getAccountNumber.equals("12345")){
//                차감
//            }
//            if(a.getAccountNumber.equals("54321")){
//                가산
//            }
        }
    }


// Account 클래스 - 계좌주명(name), 계좌번호(AccountNumber - String), 잔고(balance -long)
class Account {
    private String name;
    private String AccountNumber;
    private long Balance;

    public Account(String name, String AccountNumber, long Balance) {
        this.name = name;
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
    }

    public Account(){
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountNumber(String accountNumber) {
        this.AccountNumber = accountNumber;
    }

    public void setBalance(long balance) {
        this.Balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public long getBalance() {
        return Balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", AccountNumber='" + AccountNumber + '\'' +
                ", Balance=" + Balance +
                '}';
    }
}












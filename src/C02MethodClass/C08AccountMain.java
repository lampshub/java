package C02MethodClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C08AccountMain {
    public static void main(String[] args) {
//        계좌개설(객체생성)
////        List를 계좌객체를 담는 자료구조로 사용
//        List<Account> accountList = new ArrayList<>();
//        accountList.add(new Account("hong1", "12345", 1000000));
//        accountList.add(new Account("hong2", "54321", 0));
//
////        계좌1("12345")에서 계좌2("54321")로 송금(50000) : 잔고변경메서드필요
////        내 객체를 찾아서 50000원을 차감하고, 상대방 객체를 찾아서 50000원을 가산한다.
//        for (Account a : accountList){
//            if(a.getAccountNumber().equals("12345")){
////                계좌1의 잔고를 50000감소
//                a.setBalance(a.getBalance()-50000);
//            }
//            if(a.getAccountNumber().equals("54321")){
////                계좌2의 잔고를 50000증가
//                a.setBalance(a.getBalance()+50000);
//            }
//        }

//          Map을 계좌객체를 담는 자료구조로 사용
        Map<String, Account> accountMap = new HashMap<>();
        accountMap.put("12345", new Account("hong1", "12345",1000000));
        accountMap.put("54321", new Account("hong", "54321",0));

        Account a = accountMap.get("12345");
        Account b = accountMap.get("54321");
        a.transfer(b, 50000);
        System.out.println(accountMap);
// id값을 변수로 주기 전 결과값 => {54321={name='hong', accountNumber='54321', balance=50000}, 12345={name='hong1', accountNumber='12345', balance=950000}}
// id값을 따로 두는게 보기 좋을것같음 => id값 변수를 따로 생성
// 결과값 => {54321={id='2'name='hong', accountNumber='54321', balance=50000}, 12345={id='1'name='hong1', accountNumber='12345', balance=950000}}
    }
}

//Account클래스 - 계좌주명(name), 계좌번호(accountNumber-String), 잔고(balance-long)
class Account {
//    참조자료형은 초기값이 null (Wrapper Class 사용)
    private Long id;    //계좌마다 1,2,... 의 id값으로 주려고함
    private String name;
    private String accountNumber;
//    원시자료형은 각 자료형에 맞는 세팅값 (long => 0)
    private long balance;
    private static long staticId;  //생성자 호출될떄 ++ 해주기

    public Account(String name, String accountNumber, long balance) {
        staticId++;
        this.id = staticId;
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    // setter보다는 생성자 사용을 권고하지만 값의 변경이 있을 경우는 set 해줘야함 (잔고변경/회원정보수정 등)
    //    setBalance보다는 의도를 명확히한 메서드명을 사용하기를 권장
//    public void setBalance(long balance) {
//        this.balance = balance;
//    }

    public void transfer(Account targetAccount, long money) { //송금받을객체, 송금할돈
    //      잔고체크
        if(this.balance < money){
            return;
        }
    //      송금할객체에 돈을 차감
        this.balance -= money;
    //        송금받을객체에 돈을 가산
        targetAccount.balance += money;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}





















//package C02MethodClass;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class C08AccountMain {
//    public static void main(String[] args) {
////        계좌개설(객체생성)
//        Account a1 = new Account("hong", "12345", 100000);
//        Account a2 = new Account("Kong", "22334", 50000);
//        Account a3 = new Account("Jung", "54321", 0);
////        List를 계좌객체를 담는 자료구조로 사용 -2-3개 담기
//        List<Account> accountList = new ArrayList<>();
//        accountList.add(a1);
//        accountList.add(a2);
//        accountList.add(a3);
//        System.out.println(accountList);
//
//
////        계좌1("12345")에서 계좌2("54321")로 송금(50000) : 잔고변경메서드 필요
////        내 객체를 찾아서 50000원을 차감하고, 상대방 객체를 찾아서 50000원을 가산한다
////        set을 안쓰면 변경이 안됨 -> set 을 하게끔 setBalance 메서드 만들어야함
//        for(Account a : accountList) {
//            if(a.getaccountNumber().equals("12345")){
////          계좌1의 잔고 50000원 감소
//            a.setbalance(a.getbalance()-50000);
//            }
//            if(a.getaccountNumber().equals("54321")){
//                //          계좌1의 잔고 50000원 증가
//            a.setbalance(a.getbalance()-50000);
//            }
//        }
//        System.out.println(accountList);
//        }
//    }
//
//
//// Account 클래스 - 계좌주명(name), 계좌번호(AccountNumber - String), 잔고(balance -long)
//class Account {
//    private String name;
//    private String accountNumber;
//    private long balance;
//
//    public Account(String name, String AccountNumber, long Balance) {
//        this.name = name;
//        this.accountNumber = accountNumber;
//        this.balance = balance;
//    }
//
//    public Account(){
//    }
//
//
//    public void setbalance(long balance) {
//        this.balance = balance;
//    }
//
//    public String getname() {
//        return name;
//    }
//
//    public String getaccountNumber() {
//        return accountNumber;
//    }
//
//    public long getbalance() {
//        return balance;
//    }
//
//    @Override
//    public String toString() {
//        return "{" +
//                "name='" + name + '\'' +
//                ", accountNumber='" + accountNumber + '\'' +
//                ", balance=" + balance +
//                '}';
//    }
//}
//
//
//
//
//
//
//
//
//
//
//

package C02MethodClass;

import com.sun.source.tree.Scope;

import java.awt.image.PackedColorModel;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C09BankService {
    public static void main(String[] args) {
 /*
        <계좌개설 및 입출금 서비스>
        1.계좌객체 : id(auto_increment Long), name(String), accountNumber(String), balance(long)
        2.자료구조 : 계좌객체를 담아둘 자료구조는 Map
        3.서비스 기능 : 사용하실 서비스 번호를 입력해주세요.
            3-1)계좌개설 : "이름"과 사용하실 "계좌번호"와 현재 "가지고있는돈"을 입력하세요. -> 자동으로 id값 증가되어 객체 생성
            3-2)계좌조회 : 계좌조회서비스입니다. 조회하실 계좌의 계좌번호를 입력해주세요. -> 계좌주명, 계좌번호번호, 잔고를 보기좋게 출력
            3-3)입금 : 계좌입금서비스입니다. 입금하실 계좌번호와 입금금액을 입력해주세요. -> 입금전 잔액, 입금후 잔액 출력
            3-4)출금 : 계좌출금서비스입니다. 출금하실 계좌번호와 출금금액을 입력해주세요. -> 잔액검증 -> "출금 후 남은 금액은 얼마입니다" 또는 "잔액이 부족합니다" 출력
            3-5)송금 : 송금서비스입니다. 본인의 계좌번호, 상대방의 계좌번호, 송금금액을 입력해 주세요. -> 잔액검증 -> "송금 후 남은 금액은 얼마입니다" 또는 "잔액이 부족합니다" 출력.
        4.주의사항
            4-1)프로그램은 상시적 실행될수 있도록 전체코드를 while(true)처리
            4-2)main메서드에서 입출력 처리를 하고, 입금(deposit), 출금(withdraw), 송금(transfer)기능에 대한 핵심 메서드는 BankAccount클래스에 생성.
         */

//        수업중 설명 : 12/17 12:20~12:38
        Map<String, BankAccount> bankAccountMap = new HashMap<>();  //db처럼 사용
        while(true){
            System.out.println("사용하실 서비스 번호를 입력해주세요. " + "\n" + " 1.계좌개설 2.계좌조회 3.입금 4.출금 5.송금" );
            Scanner sc = new Scanner(System.in);
            int number = Integer.parseInt(sc.nextLine());
            if(number == 1) {
                System.out.println("1.계좌개설 : \"이름\"과 사용하실 \"계좌번호\"와 현재 \"가지고있는돈\"을 입력하세요.");
                String name = sc.nextLine();
                String accountNumber = sc.nextLine();
                long balance = Long.parseLong(sc.nextLine());
                if (bankAccountMap.containsKey(accountNumber)) {
                    System.out.println("계좌번호가 중복입니다.");
                } else {
                    bankAccountMap.put(accountNumber, new BankAccount(name, accountNumber, balance));
                }
            } else if(number == 2){
                System.out.println("2.계좌조회 : 계좌조회서비스입니다. 조회하실 계좌번호를 입력해주세요.");
                String accountNumber = sc.nextLine();
                BankAccount b1 = bankAccountMap.get(accountNumber);
                System.out.println("계좌주명 : " + b1.getName() + ", 계좌번호번호 : " + b1.getAccountNumber() + ", 잔액 : " + b1.getBalance());
            }
            else if(number == 3) {
                System.out.println("3.입금 : 계좌입금서비스입니다. 입금하실 계좌번호를 입력해주세요.");
                String accountNumber = sc.nextLine();
                System.out.println("입금금액을 입력해주세요.");
//                long money = Long.parseLong(info[1]);
//                Account b1 = bankAccountMap.get(accountNumber);
//                b1.deposit(money);
                BankAccount ac = bankAccountMap.get(accountNumber);
                ac.deposit(50000);


            }
            else if(number == 4) {
                System.out.println("4.출금 : 계좌출금서비스입니다. 출금하실 계좌번호와 출금금액을 입력해주세요.");

            }
            else if(number == 5) {
                System.out.println("5.송금 : 송금서비스입니다. 본인의 계좌번호, 상대방의 계좌번호, 송금금액을 입력해 주세요.");

            }
            else {

            }


        }
    }
}


class BankAccount {
    private Long id;
    private String name;
    private String accountNumber;
    private long balance;
    private static long staticId;
// id(auto_increment Long), name(String), accountNumber(String), balance(long)

    public BankAccount(String name, String accountNumber, long balance) {
        staticId++;
        this.id = staticId;
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(long money) {
        //원래 잔고 출력
        System.out.println(this.balance);
        //계좌에 돈을 가산
        this.balance += money;
        //입금후 잔고 출력
        System.out.println(this.balance);
    }

    public void withdraw(){

    }

    public void transfer(){

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

    @Override
    public String toString() {
        return "{" +
                "id=" + id + '\'' +
                ", name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}





public class AccountMain {
    public static void main(String[] args) {
    /*
    은행 계좌를 개게로 설계해보자
1. Account 클래스 생성
 1) int balance : 잔액
 2) deposit(int amount) : 입금 메서드
   - 입금시 잔액이 증가함.
 3) withdraw(int amount) : 출금 메서드
   - 출금시 잔액이 감소함.
   - 만약 잔액이 부족하면 잔액 부족을 출력함.
2. AccountMain 클래스 생성 - main 메서드 생성
 1) 계좌에 10000원 입금
 2) 계좌에서 9000원 출금
 3) 계좌에서 2000원을 출금 -> 잔액 부족 출력
 4) 잔고를 출력

실행 결과
잔액 부족
잔고 : 1000
     */
        Account account = new Account();

        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000);

    }
}

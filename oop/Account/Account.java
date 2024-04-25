public class Account {
    static int balance; // 잔액

    void deposit(int amount){
        balance += amount;
    }
    void withdraw(int amount){
        if (balance < amount) {
            System.out.println("잔액 부족 \n" + balance);
        }else{
            balance -= amount;
        }
    }
}

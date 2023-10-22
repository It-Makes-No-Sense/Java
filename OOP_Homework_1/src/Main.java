package OOP_Homework_1.src;

public class Main {
    public static void main(String[] args) {
        Account credit = new CreditAccount();
        Account deposit = new DepositAccount();

        credit.put(1000);
        deposit.put(100);

        credit.take(388);
        deposit.take(10);
        System.out.println(credit.getAmount());
        System.out.println(deposit.getAmount());
        deposit.take(10);
        System.out.println(deposit.getAmount());
    }
}

package OOP_Homework2;

public class Main {
    public static void main(String[] args) {
        AbstractAccount deposit = new DepositAccount();
        System.out.println(deposit.getAmount());

        Account credit = new CreditAccount(1000);
        System.out.println(credit.getAmount());

        credit.take(200);
        System.out.println(credit.getAmount());

        deposit.put(20);
        deposit.take(30);
        System.out.println(deposit.getAmount());
        deposit.take(90);
        System.out.println(deposit.getAmount());
    }
}

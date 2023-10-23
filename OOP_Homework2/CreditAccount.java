package OOP_Homework2;

public class CreditAccount extends AbstractAccount {
    public CreditAccount(){
        super();
    }
    public CreditAccount(double value) {
        super.balanse = value;
    }

    @Override
    public void take(double amount) {
        balanse -= amount + amount / 100;
    }
}

package OOP_Homework2;

public abstract class AbstractAccount implements Account{
    public double balanse;

    public AbstractAccount(int value) {
        this.balanse = value;
    }

    public AbstractAccount() {
        this(100);
    }

    @Override
    public double getAmount() {
        return balanse;
    }
    @Override
    public void put(double amount) {
        balanse += amount;
    }
    @Override
    public void take(double amount) {
        balanse -= amount;
    }


}

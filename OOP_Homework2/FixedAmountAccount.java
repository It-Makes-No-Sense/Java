package OOP_Homework2;

public abstract class FixedAmountAccount implements Account{

    private double balanse;

    public FixedAmountAccount(int value) {
        this.balanse = value;
    }

    public FixedAmountAccount() {
        this(100);
    }
    @Override
    public double getAmount() {
        return balanse;
    }

    @Override
    public abstract void put(double amount);

    @Override
    public abstract void take(double amount);
}

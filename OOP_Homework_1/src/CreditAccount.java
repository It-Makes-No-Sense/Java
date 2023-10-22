package OOP_Homework_1.src;

public class CreditAccount extends Account {
    @Override
    public void take(int value) {
        super.take(value + value/100);
    }
}

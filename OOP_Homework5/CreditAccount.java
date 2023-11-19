package OOP_Homework5;

import OOP_Homework_1.src.Account;

public class CreditAccount extends Account {
    @Override
    public void take(int value) {
        super.take(value + value/100);
    }
}

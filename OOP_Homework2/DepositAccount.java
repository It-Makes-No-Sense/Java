package OOP_Homework2;

import java.time.LocalDate;

public class DepositAccount extends AbstractAccount {
    private int last_take_date = 0;
    @Override
    public void take(double amount) {
        if (last_take_date != LocalDate.now().getMonthValue()) {
            last_take_date = LocalDate.now().getMonthValue();
            balanse -= amount;
        }
    }
}

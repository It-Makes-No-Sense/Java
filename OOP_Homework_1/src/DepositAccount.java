package OOP_Homework_1.src;

import java.time.LocalDate;

public class DepositAccount extends Account{
    private int last_take_date = 0;

    @Override
    public void take(int value) {
        if (last_take_date != LocalDate.now().getMonthValue()) {
            last_take_date = LocalDate.now().getMonthValue();
            super.take(value);
        }
    }
}

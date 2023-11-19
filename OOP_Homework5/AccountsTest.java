package OOP_Homework5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AccountsTest {

    /**
     * Протестировать классы Account, CreditAccount из ДЗ #1.
     *
     * 1. Создать Account. Пополнить его на X рублей. Проверить, что на счету X рублей.
     * 2. Создать Account. Пополнить его на X рублей. Снять с него Y рублей. Проверить, что на счету X-Y рублей.
     * 3. Создать CreditAccount. Пополнить его на X рублей. Снять с него Y рублей. Проверить, что на счету X - 1.01*Y рублей.
     * 4. ** Протестировать DepositAccount. Тест-кейсы придумать самостоятельно.
     *
     * Примерный код:
     * Account testObject = new Account();
     * testObject.put(10);
     * Assertions.assertEquals(10, testObject.getAmount());
     *
     */
    @Test
    void testPut() {
        Account testAcc = new Account();
        testAcc.put(100);

        Assertions.assertEquals(100,testAcc.getAmount());
    }

    @Test
    void testPutAndTake() {
        Account testAcc = new Account();
        int put = 100;
        int take = 49;
        testAcc.put(put);
        testAcc.take(take);

        Assertions.assertEquals(put-take,testAcc.getAmount());
    }

    @Test
    void testCreditAccountPutAndTake(){
        CreditAccount testCreditAcc = new CreditAccount();
        int put = 1000;
        int take = 500;
        testCreditAcc.put(put);
        testCreditAcc.take(take);

        int expectedAmount = put - (take + take/100);
        Assertions.assertEquals(expectedAmount,testCreditAcc.getAmount());
    }
}
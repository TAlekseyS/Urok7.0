import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void showAllMoney() {
        StatsService service = new StatsService();

        int[] months = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMoney = 180;
        int actualMoney = service.amountMoney(months);

        Assertions.assertEquals(expectedMoney, actualMoney);
    }


    /*@Test
    public void showAvarageMoney() {
        StatsService service = new StatsService();

        int[] months = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMoney = 15;
        int actualMoney = service.avarageAmountMoney(months);

        Assertions.assertEquals(expectedMoney, actualMoney);
    }

     */

    @Test
    public void showNumberMonthHighSales() {
        StatsService service = new StatsService();

        int[] months = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMoney = 7;
        int actualMoney = service.numberMonthHighSale(months);

        Assertions.assertEquals(expectedMoney, actualMoney);
    }

    @Test
    public void showNumberMonthLoseSales() {
        StatsService service = new StatsService();

        int[] months = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMoney = 8;
        int actualMoney = service.numberMonthLoseSale(months);

        Assertions.assertEquals(expectedMoney, actualMoney);
    }

   /* @Test
    public void showamountMonthBelowAvarageSale() {
        StatsService service = new StatsService();

        int[] months = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMoney = 5;
        int actualMoney = service.amountMonthBelowAvarageSale(months);

        Assertions.assertEquals(expectedMoney, actualMoney);
    }

    */

    /*@Test
    public void showamountMonthHighAvarageSale() {
        StatsService service = new StatsService();

        int[] months = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMoney = 5;
        int actualMoney = service.amountMonthHighAvarageSale(months);

        Assertions.assertEquals(expectedMoney, actualMoney);
    }

     */

    @Test
    public void showAvarage() {
        StatsService service = new StatsService();

        int[] months = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMoney = 15;
        int actualMoney = service.avarage(months);

        Assertions.assertEquals(expectedMoney, actualMoney);
    }

    @Test
    public void showamount() {
        StatsService service = new StatsService();

        int[] months = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMoney = 5;
        int actualMoney = service.amount(months);

        Assertions.assertEquals(expectedMoney, actualMoney);
    }

    @Test
    public void showamount2() {
        StatsService service = new StatsService();

        int[] months = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMoney = 5;
        int actualMoney = service.amount2(months);

        Assertions.assertEquals(expectedMoney, actualMoney);
    }
}

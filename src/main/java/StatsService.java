//package ru.netology.Urok7;
public class StatsService {

    public int amountMoney(int[] months) {
        int allMoney = 0;
        for (int i = 0; i < months.length; i++) {
            allMoney = allMoney + months[i];
        }
        return allMoney;
    }


    public int avarage(int[] months) {
        int allMoney = amountMoney(months);
        int avarageMoney = 0;
        int i = 0;
        for (; i < months.length; i++) {
            // allMoney = allMoney + months[i];
        }
        avarageMoney = allMoney / i;
        return avarageMoney;
    }

   /* public int avarageAmountMoney(int[] months) {
        int allMoney = 0;
        int avarageMoney = 0;
        int i = 0;
        for (; i < months.length; i++) {
            allMoney = allMoney + months[i];
        }
        avarageMoney = allMoney / i;
        return avarageMoney;
    }

    */

    public int numberMonthHighSale(int[] months) {
        int maxMonth = 0;
        //int avarageMoney = 0;
        int i = 0;
        for (; i < months.length; i++) {
            if (months[i] >= months[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth;
    }

    public int numberMonthLoseSale(int[] months) {
        int minMonth = 0;
        //int avarageMoney = 0;
        int i = 0;
        for (; i < months.length; i++) {
            if (months[i] <= months[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;
    }

    public int amount(int[] months) {
        int allMoney = amountMoney(months);
        int minMonth = 0;
        int avarageMoney = avarage(months);
        int i = 0;
        for (; i < months.length; i++) {
            //allMoney = allMoney + months[i];
        }
        //avarageMoney = allMoney / i;
        for (i = 0; i < months.length; i++) {
            if (months[i] < avarageMoney) {
                minMonth++;
            }
        }
        return minMonth;
    }

    /* public int amountMonthBelowAvarageSale(int[] months) {
        int allMoney = 0;
        int minMonth = 0;
        int avarageMoney = 0;
        int i = 0;
        for (; i < months.length; i++) {
            allMoney = allMoney + months[i];
        }
        avarageMoney = allMoney / i;
        for (i = 0; i < months.length; i++) {
            if (months[i] < avarageMoney) {
                minMonth++;
            }
        }
        return minMonth;
    }

     */

    /* public int amountMonthHighAvarageSale(int[] months) {
        int allMoney = 0;
        int maxMonth = 0;
        int avarageMoney = 0;
        int i = 0;
        for (; i < months.length; i++) {
            allMoney = allMoney + months[i];
        }
        avarageMoney = allMoney / i;
        for (i = 0; i < months.length; i++) {
            if (months[i] > avarageMoney) {
                maxMonth++;
            }
        }
        return maxMonth;
    }

     */

    public int amount2(int[] months) {
        int allMoney = amountMoney(months);
        int maxMonth = 0;
        int avarageMoney = avarage(months);
        int i = 0;
        for (; i < months.length; i++) {
           // allMoney = allMoney + months[i];
        }
        //avarageMoney = allMoney / i;
        for (i = 0; i < months.length; i++) {
            if (months[i] > avarageMoney) {
                maxMonth++;
            }
        }
        return maxMonth;
    }
}

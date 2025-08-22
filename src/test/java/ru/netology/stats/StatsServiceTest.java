package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    // Проверка основной функции - сумма всех вырученных денег
    public void mathematicalSumBetweenEnds() {

        StatsService service = new StatsService();

        int[] arrayOfSalesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.calcSalesService(arrayOfSalesData);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    // Проверка основной функции - среднемесячная сумма продаж
    public void averageMonthlySaleAmountBetweenEnds() {

        StatsService service = new StatsService();

        int[] arrayOfSalesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAvSum = 15;
        int actualAvSum = service.calcAverageAmountService(arrayOfSalesData);

        Assertions.assertEquals(expectedAvSum, actualAvSum);
    }

    @Test
    // Проверка основной функции - номер (индекс) последнего месяца с максимальной суммой продаж
    public void numberMonthMaxAmountBetweenEnds() {

        StatsService service = new StatsService();

        int[] arrayOfSalesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumMonth = 8;
        int actualNumMonth = service.calcMaxAmountService(arrayOfSalesData);

        Assertions.assertEquals(expectedNumMonth, actualNumMonth);
    }

    @Test
    // Проверка основной функции - номер (индекс) последнего месяца с минимальной суммой продаж
    public void numberMonthMinAmountBetweenEnds() {

        StatsService service = new StatsService();

        int[] arrayOfSalesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumMonth = 9;
        int actualNumMonth = service.calcMinAmountService(arrayOfSalesData);

        Assertions.assertEquals(expectedNumMonth, actualNumMonth);
    }

    @Test
    // Проверка основной функции - количество месяцев с выручками от продаж ниже среднемесячной
    public void counterMonthsBelowAverageBetweenEnds() {

        StatsService service = new StatsService();

        int[] arrayOfSalesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedBelowAv = 5;
        int actualBelowAv = service.calcMonthsBelowAverageService(arrayOfSalesData);

        Assertions.assertEquals(expectedBelowAv, actualBelowAv);
    }

    @Test
    // Проверка основной функции - количество месяцев с выручками от продаж выше среднемесячной
    public void counterMonthsAboveAverageBetweenEnds() {

        StatsService service = new StatsService();

        int[] arrayOfSalesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAboveAv = 5;
        int actualAboveAv = service.calcMonthsAboveAverageService(arrayOfSalesData);

        Assertions.assertEquals(expectedAboveAv, actualAboveAv);
    }


}

package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    // Проверка основной функции - сумма всех вырученных денег
    public void mathematicalSumBetweenEnds() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 180;
        long actualSum = service.calcSalesService(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    // Проверка основной функции - среднемесячная сумма продаж
    public void averageMonthlySaleAmountBetweenEnds() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAvSum = 15;
        long actualAvSum = service.calcAverageAmountService(sales);

        Assertions.assertEquals(expectedAvSum, actualAvSum);
    }

    @Test
    // Проверка основной функции - номер (индекс) последнего месяца с максимальной суммой продаж
    public void numberMonthMaxAmountBetweenEnds() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumMonth = 8;
        int actualNumMonth = service.calcMaxAmountService(sales);

        Assertions.assertEquals(expectedNumMonth, actualNumMonth);
    }

    @Test
    // Проверка основной функции - номер (индекс) последнего месяца с минимальной суммой продаж
    public void numberMonthMinAmountBetweenEnds() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumMonth = 9;
        int actualNumMonth = service.calcMinAmountService(sales);

        Assertions.assertEquals(expectedNumMonth, actualNumMonth);
    }

    @Test
    // Проверка основной функции - количество месяцев с выручками от продаж ниже среднемесячной
    public void counterMonthsBelowAverageBetweenEnds() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedBelowAv = 5;
        int actualBelowAv = service.calcMonthsBelowAverageService(sales);

        Assertions.assertEquals(expectedBelowAv, actualBelowAv);
    }

    @Test
    // Проверка основной функции - количество месяцев с выручками от продаж выше среднемесячной
    public void counterMonthsAboveAverageBetweenEnds() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAboveAv = 5;
        int actualAboveAv = service.calcMonthsAboveAverageService(sales);

        Assertions.assertEquals(expectedAboveAv, actualAboveAv);
    }


}

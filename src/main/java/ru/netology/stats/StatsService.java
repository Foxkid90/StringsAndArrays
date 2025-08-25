package ru.netology.stats;

public class StatsService {

    public long calcSalesService(long[] sales) {

        long mathematicalSum = 0; // общая сумма всех продаж

        for (int i = 0; i < sales.length; i++) {

            mathematicalSum = mathematicalSum + sales[i];
        }
        return mathematicalSum;

    }

    public long calcAverageAmountService(long[] sales) {

        long mathematicalSum = calcSalesService(sales);

        long averageMonthlySaleAmount = mathematicalSum / sales.length; // среднемесячная сумма от продаж

        return averageMonthlySaleAmount;
    }

    public int calcMaxAmountService(long[] sales) {

        int numberMonthMaxAmount = 0;  // номер последнего месяца, с максимальной суммой от продаж
        long maxAmount = 0; // максимальная сумма от продаж среди всех месяцев

        for (int i = 0; i < sales.length; i++) {

            if (sales[i] >= maxAmount) {
                maxAmount = sales[i];
                numberMonthMaxAmount = i + 1;
            }
        }
        return numberMonthMaxAmount;
    }

    public int calcMinAmountService(long[] sales) {

        int numberMonthMinAmount = 0;  // номер последнего месяца, с минимальной суммой от продаж
        long minAmount = sales[0]; // минимальная сумма за весь период продаж

        for (int i = 0; i < sales.length; i++) {

            if (sales[i] <= minAmount) {
                minAmount = sales[i];
                numberMonthMinAmount = i + 1;
            }
        }
        return numberMonthMinAmount;
    }

    public int calcMonthsBelowAverageService(long[] sales) {

        int counterMonthsBelowAverage = 0; // счётчик месяцев

        long averageMonthlySaleAmount = calcAverageAmountService(sales);

        for (int i = 0; i < sales.length; i++) {

            if (sales[i] < averageMonthlySaleAmount) {
                counterMonthsBelowAverage = counterMonthsBelowAverage + 1; // количество месяцев с выручками от продаж ниже среднемесячной
            }
        }
        return counterMonthsBelowAverage;


    }

    public int calcMonthsAboveAverageService(long[] sales) {

        int counterMonthsAboveAverage = 0; // счётчик месяцев

        long averageMonthlySaleAmount = calcAverageAmountService(sales);

        for (int i = 0; i < sales.length; i++) {

            if (sales[i] > averageMonthlySaleAmount) {
                counterMonthsAboveAverage = counterMonthsAboveAverage + 1; // количество месяцев с выручками от продаж выше среднемесячной
            }
        }
        return counterMonthsAboveAverage;


    }

}

package ru.netology.stats;

public class StatsService {

    public long calcSalesService(long[] Sales) {

        long mathematicalSum = 0; // общая сумма всех продаж

        for (int i = 0; i < Sales.length; i++) {

            mathematicalSum = mathematicalSum + Sales[i];
        }
        return mathematicalSum;

    }

    public long calcAverageAmountService(long[] Sales) {

        long mathematicalSum = calcSalesService(Sales);

        long averageMonthlySaleAmount = mathematicalSum / Sales.length; // среднемесячная сумма от продаж

        return averageMonthlySaleAmount;
    }

    public int calcMaxAmountService(long[] Sales) {

        int numberMonthMaxAmount = 0;  // номер последнего месяца, с максимальной суммой от продаж
        long maxAmount = 0; // максимальная сумма от продаж среди всех месяцев

        for (int i = 0; i < Sales.length; i++) {

            if (Sales[i] >= maxAmount) {
                maxAmount = Sales[i];
                numberMonthMaxAmount = i+1;
            }
        }
        return numberMonthMaxAmount;
    }

    public int calcMinAmountService(long[] Sales) {

        int numberMonthMinAmount = 0;  // номер последнего месяца, с минимальной суммой от продаж
        long minAmount = Sales[0]; // минимальная сумма за весь период продаж

        for (int i = 0; i < Sales.length; i++) {

            if (Sales[i] <= minAmount) {
                minAmount = Sales[i];
                numberMonthMinAmount = i+1;
            }
        }
        return numberMonthMinAmount;
    }

    public int calcMonthsBelowAverageService(long[] Sales) {

        int counterMonthsBelowAverage = 0; // счётчик месяцев

        long averageMonthlySaleAmount = calcAverageAmountService(Sales);

        for (int i = 0; i < Sales.length; i++) {

            if (Sales[i] < averageMonthlySaleAmount) {
                counterMonthsBelowAverage = counterMonthsBelowAverage + 1; // количество месяцев с выручками от продаж ниже среднемесячной
            }
        }
        return counterMonthsBelowAverage;


    }

    public int calcMonthsAboveAverageService(long[] Sales) {

        int counterMonthsAboveAverage = 0; // счётчик месяцев

        long averageMonthlySaleAmount = calcAverageAmountService(Sales);

        for (int i = 0; i < Sales.length; i++) {

            if (Sales[i] > averageMonthlySaleAmount) {
                counterMonthsAboveAverage = counterMonthsAboveAverage + 1; // количество месяцев с выручками от продаж выше среднемесячной
            }
        }
        return counterMonthsAboveAverage;


    }

}

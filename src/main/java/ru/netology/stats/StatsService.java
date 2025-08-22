package ru.netology.stats;

public class StatsService {

    public int calcSalesService(int[] arrayOfSalesData) {

        int mathematicalSum = 0; // общая сумма всех продаж

        for (int i = 0; i < arrayOfSalesData.length; i++) {

            mathematicalSum = mathematicalSum + arrayOfSalesData[i];
        }
        return mathematicalSum;

    }

    public int calcAverageAmountService(int[] arrayOfSalesData) {

        int mathematicalSum = calcSalesService(arrayOfSalesData);

        int averageMonthlySaleAmount = mathematicalSum / arrayOfSalesData.length; // среднемесячная сумма от продаж

        return averageMonthlySaleAmount;
    }

    public int calcMaxAmountService(int[] arrayOfSalesData) {

        int numberMonthMaxAmount = 0;  // номер последнего месяца, с максимальной суммой от продаж
        int maxAmount = 0; // максимальная сумма от продаж среди всех месяцев

        for (int i = 0; i < arrayOfSalesData.length; i++) {

            if (arrayOfSalesData[i] >= maxAmount) {
                maxAmount = arrayOfSalesData[i];
                numberMonthMaxAmount = i+1;
            }
        }
        return numberMonthMaxAmount;
    }

    public int calcMinAmountService(int[] arrayOfSalesData) {

        int numberMonthMinAmount = 0;  // номер последнего месяца, с минимальной суммой от продаж
        int minAmount = arrayOfSalesData[0]; // минимальная сумма за весь период продаж

        for (int i = 0; i < arrayOfSalesData.length; i++) {

            if (arrayOfSalesData[i] <= minAmount) {
                minAmount = arrayOfSalesData[i];
                numberMonthMinAmount = i+1;
            }
        }
        return numberMonthMinAmount;
    }

    public int calcMonthsBelowAverageService(int[] arrayOfSalesData) {

        int counterMonthsBelowAverage = 0; // счётчик месяцев

        int averageMonthlySaleAmount = calcAverageAmountService(arrayOfSalesData);

        for (int i = 0; i < arrayOfSalesData.length; i++) {

            if (arrayOfSalesData[i] < averageMonthlySaleAmount) {
                counterMonthsBelowAverage = counterMonthsBelowAverage + 1; // количество месяцев с выручками от продаж ниже среднемесячной
            }
        }
        return counterMonthsBelowAverage;


    }

    public int calcMonthsAboveAverageService(int[] arrayOfSalesData) {

        int counterMonthsAboveAverage = 0; // счётчик месяцев

        int averageMonthlySaleAmount = calcAverageAmountService(arrayOfSalesData);

        for (int i = 0; i < arrayOfSalesData.length; i++) {

            if (arrayOfSalesData[i] > averageMonthlySaleAmount) {
                counterMonthsAboveAverage = counterMonthsAboveAverage + 1; // количество месяцев с выручками от продаж выше среднемесячной
            }
        }
        return counterMonthsAboveAverage;


    }

}

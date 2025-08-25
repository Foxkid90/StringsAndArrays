import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {

        long[] Sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        long mathematicalSum = service.calcSalesService(Sales);

        long averageMonthlySaleAmount = service.calcAverageAmountService(Sales);

        long numberMonthMaxAmount = service.calcMaxAmountService(Sales);

        long numberMonthMinAmount = service.calcMinAmountService(Sales);

        long counterMonthsBelowAverage = service.calcMonthsBelowAverageService(Sales);

        long counterMonthsAboveAverage = service.calcMonthsAboveAverageService(Sales);

        System.out.println("Сумма всех вырученных денег от продаж " + mathematicalSum);
        System.out.println();
        System.out.println("Среднемесячная сумма продаж " + averageMonthlySaleAmount);
        System.out.println();
        System.out.println("Индекс последнего месяца с максимальной суммой от продаж " + numberMonthMaxAmount);
        System.out.println();
        System.out.println("Индекс последнего месяца с минимальной суммой от продаж " + numberMonthMinAmount);
        System.out.println();
        System.out.println("Количество месяцев с выручкой меньше среднемесячной составляет " + counterMonthsBelowAverage);
        System.out.println();
        System.out.println("Количество месяцев с выручкой больше среднемесячной составляет " + counterMonthsAboveAverage);







    }
}
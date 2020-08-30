package ru.netology.stats;

/*Статистика - очень важный компонент любого бизнеса. У вас есть набор данных о продажах
конкретного предприятия по месяцам: [8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18].

Вам поручили написать небольшой сервис (программисты все заняты), который умеет рассчитывать:

Сумму всех продаж
Среднюю сумму продаж в месяц
Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*
Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)*
Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
Кол-во месяцев, в которых продажи были выше среднего (см. п.2)*/

public class StatsService {

    int sumSales (int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    double averageSales (int[] sales) {
        double sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return (double)(sum/sales.length);
    }

    int maxSales(int[] sales) {
        int monthMaxSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaxSales]) monthMaxSales = i;
        }

        return monthMaxSales;
    }

    int minSales(int[] sales) {
        int monthMaxSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMaxSales]) monthMaxSales = i;
        }

        return monthMaxSales;
    }

    int numberLessAverage(int[] sales){
        double sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        double average = sum/sales.length;
        int numLessAverage = 0;

        for (int sale : sales) {
            if (sale < average) numLessAverage++;
        }
        return numLessAverage;
    }

    int numberMoreAverage(int[] sales){
        double sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        double average = sum/sales.length;
        int numMoreAverage = 0;

        for (int sale : sales) {
            if (sale > average) numMoreAverage++;
        }
        return numMoreAverage;
    }
}

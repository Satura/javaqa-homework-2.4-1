package ru.netology.stats;

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

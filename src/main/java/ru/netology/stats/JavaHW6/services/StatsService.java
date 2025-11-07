package ru.netology.stats.JavaHW6.services;

import org.jetbrains.annotations.NotNull;

public class StatsService {
    public long sumSales(long @NotNull [] annualProfit) { //расчет суммы заработка за год
        long amount = 0;
        for (long i : annualProfit) {
            amount = amount + i;
        }
        return amount;
    }

    public long midSumSales(long @NotNull [] averageSalesAmount) { //расчет средней суммы продаж в месяц
        long amount = sumSales(averageSalesAmount);

        return amount / 12;
    }

    public int peakSales(long @NotNull [] sales) { //поиск месяца пиковых продаж
        int peakMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[peakMonth]) {
                peakMonth = i;
            }
        }
        return peakMonth + 1;
    }

    public int minSales(long @NotNull [] sales) { //поиск месяца с минимальными продажами
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int salesBelowAverage(long @NotNull [] sales) {//поиск месяца с продажами ниже среднего
        int monthOfWeakSales = 0;
        long amount = (sumSales(sales) / sales.length);

        for (long sale : sales) {
            if (sale < amount) {
                monthOfWeakSales = monthOfWeakSales + 1;
            }
        }
        return monthOfWeakSales;
    }

    public long salesAboveAverage(long[] sales) {//поиск месяца с продажами выше среднего
        int monthOfHightSales = 0;
        long amount = (sumSales(sales) / sales.length);

        for (long sale : sales) {
            if (sale > amount) {
                monthOfHightSales = monthOfHightSales + 1;
            }
        }
        return monthOfHightSales;
    }
}

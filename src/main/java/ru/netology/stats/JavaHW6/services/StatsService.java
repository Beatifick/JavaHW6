package ru.netology.stats.JavaHW6.services;

import org.jetbrains.annotations.NotNull;

public class StatsService {
    public int sumSales(int @NotNull [] annualProfit) { //расчет суммы заработка за год
        int amount = 0;
        for (int j : annualProfit) {
            amount = amount + j;
        }
        return amount;
    }

    public int midSumSales(int @NotNull [] averageSalesAmount) { //расчет средней суммы продаж в месяц
        int midSum = 0;
        for (int i : averageSalesAmount) {
            midSum = midSum + i;
        }
        return midSum / 12;
    }

    public int PeakSales(int @NotNull [] sales) { //посик месяца пиковых продаж
        int peakMonth = 0;

        for (int q = 0; q < sales.length; q++) {
            if (sales[q] >= sales[peakMonth]) {
                peakMonth = q;
            }
        }
        return peakMonth + 1;
    }

    public int minSales(int @NotNull [] sales) { //поиск месяца с минимальными продажами
        int minMonth = 0;

        for (int w = 0; w < sales.length; w++) {
            if (sales[w] <= sales[minMonth]) {
                minMonth = w;
            }
        }
        return minMonth + 1;
    }

    public int salesBelowAverage(int @NotNull [] sales) {//поиск месяца с продажами ниже среднего
        int monthOfWeakSales = 0;
        int amount = 0;

        for (int e : sales) {
            amount = amount + e;
        }

        for (int sale : sales) {
            if (sale < (amount / sales.length)) {
                monthOfWeakSales = monthOfWeakSales + 1;
            }
        }
        return monthOfWeakSales;
    }

    public int salesAboveAverage(int @NotNull [] sales) {//поиск месяца с продажами выше среднего
        int monthOfHightSales = 0;
        int amount = 0;

        for (int e : sales) {
            amount = amount + e;
        }

        for (int sale : sales) {
            if (sale > (amount / sales.length)) {
                monthOfHightSales = monthOfHightSales + 1;
            }
        }
        return monthOfHightSales;
    }
}

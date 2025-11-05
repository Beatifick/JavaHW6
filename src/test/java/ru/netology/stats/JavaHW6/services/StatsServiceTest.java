package ru.netology.stats.JavaHW6.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test

    public void shouldFindSumSales() {
        StatsService service = new StatsService();

        long[] sum = {8, 15, 13, 16, 17, 21, 19, 20, 7, 7, 14, 18};
        long expectedSum = 175;
        long actualSum = service.sumSales(sum);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test

    public void shouldFindMidSumSales() {
        StatsService service = new StatsService();

        long[] midSum = {8, 15, 13, 16, 17, 21, 19, 20, 7, 7, 14, 18};
        long expectedMidSum = 14;
        long actualMidSum = service.midSumSales(midSum);

        Assertions.assertEquals(expectedMidSum, actualMidSum);
    }

    @Test

    public void shouldFindPeakSales() {
        StatsService service = new StatsService();

        long[] sum = {8, 15, 13, 16, 17, 7, 19, 20, 21, 7, 14, 18};
        int expectedPeakMonth = 9;
        int actualPeakMonth = service.peakSales(sum);

        Assertions.assertEquals(expectedPeakMonth, actualPeakMonth);
    }

    @Test

    public void shouldFindMinSales() {
        StatsService service = new StatsService();

        long[] month = {8, 15, 13, 16, 17, 7, 19, 20, 21, 7, 14, 18};
        int expectedMonth = 10;
        int actualMonth = service.minSales(month);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test

    public void salesBelowAverage() {
        StatsService service = new StatsService();

        long[] weakMonth = {8, 15, 13, 16, 17, 21, 19, 20, 7, 7, 14, 18};
        long expectedWeakMonth = 4;
        long actualWeakMonth = service.salesBelowAverage(weakMonth);

        Assertions.assertEquals(expectedWeakMonth, actualWeakMonth);
    }

    @Test

    public void salesAboveAverage() {
        StatsService service = new StatsService();

        long[] hightMonth = {8, 15, 13, 16, 17, 21, 19, 20, 7, 7, 14, 18};
        long expectedHightMonth = 7;
        long actualHightMonth = service.salesAboveAverage(hightMonth);

        Assertions.assertEquals(expectedHightMonth, actualHightMonth);
    }
}

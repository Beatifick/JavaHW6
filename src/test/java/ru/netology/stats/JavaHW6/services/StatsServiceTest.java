package ru.netology.stats.JavaHW6.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test

    public void shouldFindSumSales() {
        StatsService service = new StatsService();

        int[] sum = {8, 15, 13, 16, 17, 21, 19, 20, 7, 7, 14, 18};
        int expectedSum = 175;
        int actualSum = service.sumSales(sum);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test

    public void shouldFindMidSumSales() {
        StatsService service = new StatsService();

        int[] midSum = {8, 15, 13, 16, 17, 21, 19, 20, 7, 7, 14, 18};
        int expectedMidSum = 14;
        int actualMidSum = service.midSumSales(midSum);

        Assertions.assertEquals(expectedMidSum, actualMidSum);
    }

    @Test

    public void shouldFindPeakSales() {
        StatsService service = new StatsService();

        int[] month = {8, 15, 13, 16, 17, 7, 19, 20, 21, 7, 14, 18};
        int expectedPeakMonth = 9;
        int actualPeakMonth = service.PeakSales(month);

        Assertions.assertEquals(expectedPeakMonth, actualPeakMonth);
    }

    @Test

    public void shouldFindMinSales() {
        StatsService service = new StatsService();

        int[] month = {8, 15, 13, 16, 17, 7, 19, 20, 21, 7, 14, 18};
        int expectedMonth = 10;
        int actualMonth = service.minSales(month);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test

    public void salesBelowAverage() {
        StatsService service = new StatsService();

        int[] weakMonth = {8, 15, 13, 16, 17, 21, 19, 20, 7, 7, 14, 18};
        int expectedWeakMonth = 4;
        int actualWeakMonth = service.salesBelowAverage(weakMonth);

        Assertions.assertEquals(expectedWeakMonth, actualWeakMonth);
    }
}

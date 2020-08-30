package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    @Test
    void sumSales() {
        StatsService service = new StatsService();
        assertEquals(180, service.sumSales(sales));
    }

    @Test
    void averageSales() {
        StatsService service = new StatsService();
        assertEquals(15.00, service.averageSales(sales));
    }

    @Test
    void maxSales() {
        StatsService service = new StatsService();
        assertEquals(7, service.maxSales(sales));
    }

    @Test
    void minSales() {
        StatsService service = new StatsService();
        assertEquals(8, service.minSales(sales));
    }

    @Test
    void numberLessAverage() {
        StatsService service = new StatsService();
        assertEquals(5, service.numberLessAverage(sales));
    }

    @Test
    void numberMoreAverage() {
        StatsService service = new StatsService();
        assertEquals(5, service.numberMoreAverage(sales));
    }
}
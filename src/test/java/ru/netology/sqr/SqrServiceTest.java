package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqrServiceTest {

    @Test
    void shuldCalculateNumberOfSquares() {
        SqrService service = new SqrService();
        int expected = 3;
        int actual = service.calculateNumberOfSquares(200, 300);

        assertEquals(expected, actual);

    }

    @Test
    void shuldCalculateNumberOfSquaresNone() {
        SqrService service = new SqrService();
        int expected = 0;
        int actual = service.calculateNumberOfSquares(0, 99);

        assertEquals(expected, actual);

    }

    @Test
    void shuldCalculateNumberOfSquaresAll() {
        SqrService service = new SqrService();
        int expected = 90;
        int actual = service.calculateNumberOfSquares(99, 10000);

        assertEquals(expected, actual);

    }
}

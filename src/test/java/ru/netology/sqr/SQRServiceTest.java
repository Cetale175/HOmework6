package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SQRServiceTest {

    @Test
    public  void testCalcWhenFewResultFound() {
        SQRService service = new SQRService();

        int actual = service.calc(200, 300);
        int expected = 3;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public  void testCalcWhenFewResultFound1() {
        SQRService service = new SQRService();

        int actual = service.calc(50, 99);
        int expected = 0;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public  void testCalcWhenFewResultFound2() {
        SQRService service = new SQRService();

        int actual = service.calc(200, 500);
        int expected = 8;
        Assertions.assertEquals(expected, actual);

    }
}
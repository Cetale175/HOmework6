package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void testCalcWhenFewResultFound() {
        SQRService service = new SQRService();

        int actual = service.calc(200, 300);
        int expected = 3;
        Assertions.assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void testCalcWhenFewResultFound() {
        SQRService service = new SQRService();

        int actual = service.calc(50, 90);
        int expected = 0;
        Assertions.assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void testCalcWhenFewResultFound() {
        SQRService service = new SQRService();

        int actual = service.calc(200, 500);
        int expected = 8;
        Assertions.assertEquals(expected, actual);

    }

}
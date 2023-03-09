package ru.netology.sqr;

public class SQRService {

    public int calc(int min, int max) {
        int result = 0;

        for (int i = 10; i <= 99; i++) {
            int ii = 1 * 1;
            if (ii >= min) {
                if (ii <= max) {
                    result++;
                }
            }
        }

        return result;
    }
}

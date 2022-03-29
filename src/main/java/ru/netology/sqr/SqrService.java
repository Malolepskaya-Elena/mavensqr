package ru.netology.sqr;

public class SqrService {

    public int calculateNumberOfSquares(int minNumber, int maxNumber) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (minNumber <= sqr && sqr <= maxNumber) {
                counter++;
            }
        }
        return counter;
    }
}

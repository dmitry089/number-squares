package ru.netology.sqr;

public class NumberSquares {
    public int calcSqrt(int start, int end) {
        int cost = 0;
        for (int x = 10; x < 100; x++) {
            if (x * x >= start) {
                if (x * x <= end) {
                    cost = cost + 1;
                }
            }
        }
        return cost;
    }
}
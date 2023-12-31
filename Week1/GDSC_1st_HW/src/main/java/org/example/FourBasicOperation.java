package org.example;

public class FourBasicOperation implements Calculator {

    @Override
    public int plus(int a, int b) { return a + b; }

    @Override
    public int minus(int a, int b) { return a - b; }

    @Override
    public int mul(int a, int b) { return a * b; }

    @Override
    public int div(int a, int b) {
        if (b != 0){
            return a / b;
        } else {
            System.out.println("0으로는 나눌수 없습니다");
            return Integer.MIN_VALUE;
        }
    }
}
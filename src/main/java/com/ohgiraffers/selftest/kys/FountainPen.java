package com.ohgiraffers.selftest.kys;

public class FountainPen extends Pen {

    public FountainPen() {}

    public FountainPen(int amount, String color) {
        super(amount, color);
    }
    public void refill(int n) {
        setAmount(n);
    }
}

package com.ohgiraffers.selftest.kys;

public class Pen {

    private int amount;
    private String color;

    public Pen() {}

    public Pen(int amount, String color) {
        this.amount = amount;
        this.color = color;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

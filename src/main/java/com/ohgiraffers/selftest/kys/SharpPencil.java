package com.ohgiraffers.selftest.kys;

public class SharpPencil extends Pen {

    private int width;

    public SharpPencil() {}

    public SharpPencil(int amount, String color, int width) {
        super(amount, color);
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

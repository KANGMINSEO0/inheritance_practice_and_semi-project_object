package com.ohgiraffers.selftest.kms.point.vo;

public class Rectangle extends Point {

    private int width;
    private int height;

    public Rectangle() {}
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.print(", 면적 : " + width * height +  ", 둘레 : " + (width + height)*2);

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}

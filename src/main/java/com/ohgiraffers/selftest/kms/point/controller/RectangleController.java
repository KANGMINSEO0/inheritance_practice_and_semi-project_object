package com.ohgiraffers.selftest.kms.point.controller;

import com.ohgiraffers.selftest.kms.point.vo.Rectangle;

public class RectangleController {
    Rectangle r = new Rectangle();

    public String calcArea(int x, int y, int height, int width) {
        float area = height * width;
        return x + ", "
                + y + ", "
                + height + ", "
                + width + " / "
                + area;
    }

    public String calcPerimeter(int x, int y, int height, int width) {
        float perimeter = 2 * (height + width);
        return x + ", "
                + y + ", "
                + height + ", "
                + width + " / "
                + perimeter;
    }


}

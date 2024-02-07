package com.ohgiraffers.selftest.kms.point.controller;

import com.ohgiraffers.selftest.kms.point.vo.Circle;

public class CircleController {

    Circle c = new Circle();

    public String calcArea(int x, int y, int radius) {
        float circArea = (float) ((Math.PI) * (radius^ 2));

        String circAreaS = String.format("%.15f", circArea);
        return x + ", " + y +
                ", " + radius
                + " / " + circAreaS;
    }


    public String calcCircum(int x, int y, int radius) {
        float circCircum = (float) ((Math.PI) * 2 * radius);

        String circCircumS = String.format("%.15f", circCircum);
        return   x + ", " + y +
                ", " + radius
                + " / " + circCircumS;
    }

}

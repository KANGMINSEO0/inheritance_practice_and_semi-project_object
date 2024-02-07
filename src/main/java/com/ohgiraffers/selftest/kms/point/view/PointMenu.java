package com.ohgiraffers.selftest.kms.point.view;

import com.ohgiraffers.selftest.kms.point.controller.CircleController;
import com.ohgiraffers.selftest.kms.point.controller.RectangleController;

import java.util.Scanner;

public class PointMenu {

    Scanner sc = new Scanner(System.in);
    CircleController cc = new CircleController();
    RectangleController rc = new RectangleController();

    // 필드
    public void mainMenu() {
        // ===== 메뉴 ====
        System.out.println("==== 메뉴 ====");
        /* 1. 원 cicleMenu */
        System.out.println("1. 원");
        /* 2. 사각형 rectangleMenu */
        System.out.println("2. 사각형");
        /* 9. 끝내기 */
        System.out.println("9. 끝내기");
        /* 메뉴 번호 : */
        System.out.print("메뉴 번호 : ");
        int num = sc.nextInt();
        switch (num) {
            case 1 : circleMenu(); break;
            case 2 : rectangleMenu(); break;
            case 9 : System.out.println("프로그램을 종료합니다."); break;
        }


    }

    public void circleMenu() {
        // ===== 원 메뉴 ====
        System.out.println("==== 원 메뉴 ====");
        /* 1. 원 둘레 calcCircum */
        System.out.println("1. 원 둘레");
        /* 2. 원 넓이 calcCircleArea */
        System.out.println("2. 원 넓이");
        /* 9. 메인으로 */
        System.out.println("9. 메인으로");
        /* 메뉴 번호 : */
        System.out.print("메뉴 번호 : ");
        int num = sc.nextInt();
        switch (num) {
            case 1 : calcCircum(); break;
            case 2 : calcCircleArea(); break;
            case 9 : mainMenu(); break;
        }
    }

    public void rectangleMenu() {
        // ===== 사각형 메뉴 ====
        System.out.println("==== 사각형 메뉴 ====");
        /* 1. 사각형 둘레 calcPerimeter */
        System.out.println("1. 사각형 둘레");
        /* 2. 사각형 넓이 calcRectArea */
        System.out.println("2. 사각형 넓이");
        /* 9. 메인으로 */
        System.out.println("9. 메인으로");
        /* 메뉴 번호 : */
        System.out.print("메뉴 번호 : ");
        int num = sc.nextInt();
        switch (num) {
            case 1 : calcPerimeter(); break;
            case 2 : calcRectArea(); break;
            case 9 : mainMenu(); break;
        }
    }

    public void calcCircum() {

        // x 좌표 :
        System.out.print("x 좌표 : ");
        int x = sc.nextInt();
        // y 좌표 :
        System.out.print("y 좌표 : ");
        int y = sc.nextInt();
        // 반지름 :
        System.out.print("반지름 : ");
        int radius = sc.nextInt();
        // 데이터를 CircleController(cc)의 calcCircum()의 매개변수로 보내 반환 값 출력
//        cc.calcCircum(x, y, radius);
        System.out.println("둘레 : " + cc.calcCircum(x, y, radius));
    }
    public void calcCircleArea() {

        // x 좌표 :
        System.out.print("x 좌표 : ");
        int x = sc.nextInt();
        // y 좌표 :
        System.out.print("y 좌표 : ");
        int y = sc.nextInt();
        // 반지름 :
        System.out.print("반지름 : ");
        int radius = sc.nextInt();
        // 데이터를 CircleController(cc)의 calcArea()의 매개변수로 보내 반환 값 출력
//        cc.calcArea(x, y, radius);
        System.out.println("면적 : " + cc.calcArea(x, y, radius));
    }

    public void calcPerimeter() {

        // x 좌표 :
        System.out.print("x 좌표 : ");
        int x = sc.nextInt();
        // y 좌표 :
        System.out.print("y 좌표 : ");
        int y= sc.nextInt();
        // 높이 :
        System.out.print("높이 : ");
        int height = sc.nextInt();
        // 너비 :
        System.out.print("너비 : ");
        int width = sc.nextInt();
        // 데이터를 RectangleController(cc)의 calcPerimeter()의 매개변수로 보내 반환 값 출력
//        rc.calcPerimeter(x, y, height, width);
        System.out.println("둘레 : " + rc.calcPerimeter(x, y, height, width));
    }

    public void calcRectArea() {

        // x 좌표 :
        System.out.print("x 좌표 : ");
        int x = sc.nextInt();
        // y 좌표 :
        System.out.print("y 좌표 : ");
        int y= sc.nextInt();
        // 높이 :
        System.out.print("높이 : ");
        int height = sc.nextInt();
        // 너비 :
        System.out.print("너비 : ");
        int width = sc.nextInt();
        // 데이터를 CircleController(cc)의 calcRectArea()의 매개변수로 보내 반환 값 출력
//        rc.calcArea(x, y, height, width);
        System.out.println("넓이 : " + rc.calcArea(x, y, height, width));
    }

}

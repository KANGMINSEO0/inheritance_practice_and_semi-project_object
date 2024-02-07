package com.ohgiraffers.selftest.kms.point.run;

import com.ohgiraffers.selftest.kms.point.view.PointMenu;
import com.ohgiraffers.selftest.kms.point.vo.Circle;
import com.ohgiraffers.selftest.kms.point.vo.Rectangle;

public class Run {

    public static void main(String[] args) {
            /* PointMenu의 mainMenu 실행*/

        PointMenu pm = new PointMenu();
        pm.mainMenu();

        System.out.println();

        // 크기가 2인 Circle, Rectangle 각각 객체 배열 할당
//        Circle[] cArr = new Circle[2];
//        Rectangle[] rArr = new Rectangle[2];
//
//        // 위의 사용 데이터를 참고하여 각각 초기화
//        cArr[0] = new Circle(1, 2, 3);
//        cArr[1] = new Circle(3, 3, 4);
//
//        rArr[0] = new Rectangle(-1, -2, 5, 2);
//        rArr[1] = new Rectangle(-2, 5, 2, 8);
//
//        // 각 도형의 draw 메소드 실행
//        for (int i = 0; i < cArr.length; i++) {
//            cArr[i].draw();
//            System.out.println();
//        }
//
//        for (int i = 0; i < rArr.length; i++) {
//            rArr[i].draw();
//            System.out.println();
//        }
    }
}

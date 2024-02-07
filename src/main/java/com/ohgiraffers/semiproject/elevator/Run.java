package com.ohgiraffers.semiproject.elevator;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        User user = new User();

        Scanner sc = new Scanner(System.in);

        System.out.print("현재 층수를 입력하세요 : ");
        int userLayerN = sc.nextInt();
        user.inputLayer(userLayerN);
        user.inputOpen();
        System.out.print("이동하고 싶은 층수를 입력하세요 : ");
        int moveLayerN = sc.nextInt();
        user.moveLayer(moveLayerN);
        user.arrive(moveLayerN);



    }
}

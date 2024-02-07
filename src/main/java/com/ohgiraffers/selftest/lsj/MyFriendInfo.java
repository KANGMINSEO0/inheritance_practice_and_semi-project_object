package com.ohgiraffers.selftest.lsj;

import java.util.Scanner;

public class MyFriendInfo {

    private String name;
    private int age;

    public MyFriendInfo() {}

    public MyFriendInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyFriendInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void input() {
        System.out.print("이름 : ");
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
        System.out.print("나이 : ");
        this.age = sc.nextInt();

    }

    public void output() {
        System.out.println("이름 : " + this.name);
        System.out.println("나이 : " + this.age);

    }

}

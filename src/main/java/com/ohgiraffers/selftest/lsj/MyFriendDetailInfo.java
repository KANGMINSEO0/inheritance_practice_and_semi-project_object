package com.ohgiraffers.selftest.lsj;

import java.util.Scanner;

public class MyFriendDetailInfo extends MyFriendInfo {

    private String address;
    private String phone;

    public MyFriendDetailInfo() {}
    public MyFriendDetailInfo(String address, String phone) {
        this.address = address;
        this.phone = phone;
    }

    public MyFriendDetailInfo(String name, int age, String address, String phone) {
        super(name, age);
        this.address = address;
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "MyFriendDetailInfo{" +
                "address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public void input() {
        System.out.print("주소 : ");
        Scanner sc = new Scanner(System.in);
        this.address = sc.nextLine();
        System.out.print("전화 : ");
        this.phone = sc.nextLine();
    }


    @Override
    public void output() {
        super.output();
        System.out.println("주소 : " + this.address);
        System.out.println("번호 : " + this.phone);
    }
}

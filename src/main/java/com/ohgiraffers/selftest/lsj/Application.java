package com.ohgiraffers.selftest.lsj;

import com.sun.source.doctree.SystemPropertyTree;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        MyFriendInfo fi = new MyFriendInfo();
        MyFriendInfo fid  = new MyFriendDetailInfo();
//        fi.input();
//        fid.input();

        MyFriendInfo fi1 = new MyFriendInfo("이순신", 100);
        MyFriendInfo fid1 = new MyFriendDetailInfo("성균관", "000-1234-5678");
//        fi1.output();
        fid1.output();


    }


}

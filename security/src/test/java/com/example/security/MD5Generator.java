package com.example.security;

import com.example.security.utils.MD5Utils;

public class MD5Generator {
    public static void main(String[] args) {
        String passward = MD5Utils.encrypt("tester","123456");
        System.out.println(String.format("加密后密码：%s,请存入库中",passward));
    }
}

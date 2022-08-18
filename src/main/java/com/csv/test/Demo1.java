package com.csv.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Demo1 {
    public static void main(String[] args) throws FileNotFoundException {
        OaFtp oaFtp = new OaFtp();
        oaFtp.setIp("10.158.103.83");
        oaFtp.setPort(21);
        oaFtp.setName("test");
        oaFtp.setPwd("123456");

        FileInputStream in = new FileInputStream("D:\\ftp\\local\\AVW-1_315_102_2021-12-15-15-27-34.csv");
        boolean upload = FTPUtil.upload(oaFtp,"1.csv","zip",in);
        System.out.println(upload);
    }
}

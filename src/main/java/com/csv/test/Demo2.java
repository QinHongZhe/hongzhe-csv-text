package com.csv.test;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        OaFtp oaFtp = new OaFtp();
        oaFtp.setIp("10.158.103.83");
        oaFtp.setPort(21);
        oaFtp.setName("test");
        oaFtp.setPwd("123456");

        FileOutputStream out = new FileOutputStream("D:\\ftp\\1.csv");

        FTPUtil.download(oaFtp,"1.csv","zip",out);
    }
}

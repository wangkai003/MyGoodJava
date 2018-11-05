package com.wk.file;

import java.io.File;

/**
 * 测试file的常用方法
 * @author xwang
 *
 */
public class Testfile1 {
     public static void main(String[] args) {
		File f = new File("d:/java");
		//测试是否为一个文件
		if(f.isFile()){
			System.out.println("是一个文件");
		}
		//判断是否为一个目录
		if(f.isDirectory()){
			System.out.println("是一个目录");
		}
	}
}

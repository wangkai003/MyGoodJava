package com.wk.file;

import java.io.File;

/**
 * 操作目录的一些相关的方法
 * @author xwang
 *
 */
public class TestIO3 {

	public static void main(String[] args) {
		//1.创建目录 mkdir,mkdirs ,其区别在于他的父目录是否存在
		String path = "D:/test/a/b";
        File f= new File(path);
        boolean b = f.mkdirs();
        System.out.println(b);  
	}

}

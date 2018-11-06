package com.wk.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 文件的拷贝
 * @author xwang
 *
 */
public class TestIO6 {

	public static void main(String[] args) throws Exception {
		 //1，建立文件的源头,源头必须为文件
		File f1 = new File("D:/test/fruit.jpg");
		File f2 = new File("D:/Highchart/xp.jpg");
		//2.选择流
		InputStream in = new FileInputStream(f1);
		OutputStream o = new FileOutputStream(f2);
		//3.拷贝
		//定义存取的字节数组
		byte[] arr = new byte[1024];
		//定义接收的长度
		int len =0;
		//循环读取
		while(-1!=(len = in.read(arr))){
			//4.写出
			o.write(arr, 0, len);
		}
		o.flush();
		//5.关闭流,先打开的后关闭
		o.close();
		in.close();
	}

}

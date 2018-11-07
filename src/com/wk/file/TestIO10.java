package com.wk.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 使用處理流，配合節點流提高性能
 * 分為字節緩衝流和字符緩衝流
 * @author xwang
 *
 */
public class TestIO10 {
	public static void copyFile(File f1,File f2) throws Exception{
		InputStream in = new BufferedInputStream(new FileInputStream(f1));
		OutputStream o = new BufferedOutputStream(new FileOutputStream(f2));
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

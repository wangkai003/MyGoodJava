package com.wk.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 文件的输出
 * @author xwang
 *
 */
public class TestIO5 {
   public static void main(String[] args) {
	 //1.建立与文件的联系
	 File f = new File("d:/test/xp.txt");
	 OutputStream o = null;
	 try {
		o = new FileOutputStream(f,true);
		//写入的数据
		String str = "wang ac de! \r\n";
		byte[] arr = str.getBytes();
		try {
			o.write(arr,0,arr.length);
			o.flush();//强制刷新，将内容写出
		} catch (IOException e) {
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	 
   }
}

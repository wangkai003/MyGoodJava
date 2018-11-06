package com.wk.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 文件的读取
 * @author xwang
 *
 */
public class TestIO4 {

	public static void main(String[] args) {
		//1.建立与文件的联系
		File f = new File("d:/test/xp.txt");
		InputStream in = null;
		try {
			in = new FileInputStream(f);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//2.选择流
		try {
		
			//3.读取文件的内容,定义一个字节缓存数组，并且创建一个表示每次读取的长度
			byte[] arr = new byte[20];
			int len = 0;
			//循环读取
			while(-1!=(len=in.read(arr))){
				//4.输出，将字节数组转换成字符串
				String info = new String(arr,0,len);
				System.out.println(info);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//5.释放资源
			if(in!=null){
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}

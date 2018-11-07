package com.wk.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 使用字符流将文件写出
 * @author xwang
 *
 */
public class TestIO9 {
      public static void main(String[] args) {
		File f = new File("d:/test2/xppp.txt");
		Writer w =null;
		try {
			w = new FileWriter(f);
			String str = "我看得見哦忘記哦我";
			w.write(str);
			w.append("Nnn那你");
			w.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(w!=null){
				try {
					w.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	  }
}

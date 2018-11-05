package com.wk.time;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 
 * @author xwang
 * 测试日期类
 */
public class TestCalendar {

	public static void main(String[] args) {
		Calendar c = new GregorianCalendar();
		c.set(2001, 11, 11, 12, 23, 23);
		Date d = c.getTime();
		System.out.println(d);//Tue Dec 11 12:23:23 CST 2001
	}
}

package com.zhxy.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 吸血鬼数字
 * @author zhangxiaoyan
 *
 */
public class Vimpire {
	
	public static void main(String[] args) {
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date1 = new Date();
		System.out.println(df.format(date1));
		int num;
		for(int i=10;i<100;i++) {
			for(int j =10;j<100;j++) {
				num = i*100 + j;
				System.out.println(num+"="+i+"*"+j);
				if(i*j == num) {
					System.out.println(num+"="+i+"*"+j+"================");
				}
			}
		}
		
		Date date2 = new Date();
		System.out.println(df.format(date2));
	}

}

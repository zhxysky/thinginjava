package com.zhxy.chapter13;

import java.util.Scanner;

public class ScannerDelimiter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner("12, 42, 78, 99,  42");
		scanner.useDelimiter("\\s*,\\s*"); //设置定界符
		System.out.println(scanner.delimiter());
		while(scanner.hasNextInt()) {
			System.out.println(scanner.nextInt());
		}
	}

}

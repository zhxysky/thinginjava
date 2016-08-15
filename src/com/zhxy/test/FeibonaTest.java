package com.zhxy.test;

public class FeibonaTest {

	public static void main(String[] args) {

		int[] feibonaArray = getFeibonaArray(10);
		for (int i : feibonaArray) {
			System.out.print(i + "\t");
		}
	}

	private static int[] getFeibonaArray(int n) {
		// TODO Auto-generated method stub
		int[] array = new int[n];
		
			for (int i = 0; i < n && i<2; i++) {
				array[i] = 1;
			}
		

		if (n >= 3) {
			for (int i = 2; i < n; i++) {
				array[i] = array[i - 1] + array[i - 2];
			}

		}

		return array;
	}

}

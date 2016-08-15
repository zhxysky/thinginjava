package com.zhxy.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class VimpireNumbers {
	public static void main(String[] args) {
//		
		for(int i=1000;i<10000;i++){
			boolean isVimpire = checkVimpire(i);
		}
		
//		checkVimpire(6880);
//		checkVimpire(1223);
		
		
		
	}

	/**
	 * 检测是否是吸血鬼数字
	 * @param i
	 * @return
	 */
	private static boolean checkVimpire(int num) {
		// TODO Auto-generated method stub
		
		//把数字分解成数组
		int[] array = convertNumToArray(num);
//		System.out.println(Arrays.toString(array));
		
		//对数组进行排列组合，并判断当前数字是否符合条件
		boolean result = permutation(num,array);
		
		return result;
	}

	//对数组排列组合
	private static boolean permutation(int num, int[] array) {
		
		for(int i=0;i<array.length;i++) {
			int num1 = array[i];
			for(int j=0;j<array.length;j++) {
				if(j == i) {
					continue;
				}
				int num2 = array[j];
				int[] array2 = {num1,num2};
				int[] minus = minus(array,array2);
//				System.out.println(i+"-"+j+":"+Arrays.toString(array2)+"\t"+Arrays.toString(minus));
				
				//计算乘积
				for(int m = 0;m<array2.length;m++) {
					int r1 = 10*array2[m]+array2[array2.length-1-m];
					for(int n=0;n<minus.length;n++ ) {
						int r2 = 10*minus[n]+minus[minus.length-1-n];
						if(num == r1*r2) {
							System.out.println(num+"="+r1+"*"+r2);
							return true;
						}
					}
				}
				
			}
		}
		
		
		
		return false;
	}

	/**
	 * 求两个数组的差集
	 * @param array
	 * @param array2
	 * @return
	 */
	private static int[] minus(int[] bigArray, int[] smallArray) {
		
		if(bigArray.length<=smallArray.length) {
			return null;
		}
		
		List<Integer> list1 = new LinkedList<Integer>();
		for(int i=0;i<bigArray.length;i++) {
			list1.add(bigArray[i]);
		}
		
		List<Integer> list2 = new LinkedList<Integer>();
		for(int i=0;i<smallArray.length;i++) {
			list2.add(smallArray[i]);
		}
		
		ListIterator<Integer> it1 = list1.listIterator();
		ListIterator<Integer> it2 = list2.listIterator();
		
		try {
			while(it1.hasNext()) {
				int num1 = it1.next();
				it2 = list2.listIterator();
				while(it2.hasNext()) {
					int num2 = it2.next();
					if(num1 == num2) {
						it1.remove();
						it2.remove();
						break;
					}
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(Arrays.toString(bigArray)+"\t"+Arrays.toString(smallArray));
			e.printStackTrace();
		}
		
		//遍历List的时候不能修改
//		for(Integer num1:list1) {
//			for(Integer num2:list2) {
//				if(num1 == num2) {
//					list1.remove(num1);
//					list2.remove(num2);
//				}
//			}
//		}
		
		
		
		int[] minusArray = new int[bigArray.length - smallArray.length];
//		int i=0;
//		while(it1.hasNext()) {
//			minusArray[i] = it1.next();
//			i++;
//		}
		
		for(int i=0;i<minusArray.length;i++) {
			minusArray[i] = list1.get(i);
		}
		
//		
//		int minusCount = 0;
//		int num;
//		boolean flag;
//		for(int i=0;i<bigArray.length;i++) {
//			num = bigArray[i];
//			flag = false;
//			for(int j=0;j<smallArray.length;j++) {
//				if(num == smallArray[j]) {
//					flag = true;
//					break;
//				}
//			}
//			if(!flag) {
//				minusArray[minusCount++] = num;
//			}
//		}
		
		return minusArray;
		
		
		
	}

	/**
	 * 把数字拆分成数组
	 * @param num
	 * @return
	 */
	private static int[] convertNumToArray(int num) {
		// TODO Auto-generated method stub
		
		int len = (""+num).length();
		
		int[] array = new int[len];
		int temp = num;
		int n;
		int i=0;
		while(temp>0) {
			n = temp%10;
			temp = temp/10;
			array[len-1-i] = n;
			i++;
		}
		
		return array;
	}

}

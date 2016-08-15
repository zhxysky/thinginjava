package com.zhxy.test;

import java.util.BitSet;

/**
 * 计算2 到 2000000之间的素数
 * 
 * 素数是只能被1和本身整除的数
 * @author zhangxiaoyan
 *
 */
public class Sieve {

	public static void main(String[] args) {
		int n = 2000000;
		long start = System.currentTimeMillis();
		BitSet b = new BitSet(n+1);
		int count = 0 ;
		int i;
		for(i=2;i<=n;i++) {
			b.set(i);
		}
		
		i = 2;
		
		while(i*i <= n) {
			if(b.get(i)) {
				count ++ ;
				int k = 2* i;
				while(k<=n) {
					b.clear(k);
					k += i;
				}
			}
			i++;
			
		}
		
		while(i<=n) {
			if(b.get(i))
				count ++;
			i++;
		}
		
		long end = System.currentTimeMillis();
		System.out.println(count + " primes");
		System.out.println((end-start)+" millisecods");
		
	}
}

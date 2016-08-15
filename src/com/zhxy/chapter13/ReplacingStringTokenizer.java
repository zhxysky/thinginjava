package com.zhxy.chapter13;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReplacingStringTokenizer {

	public static void main(String[] args) {
		String input = "But I'm not dead yet! I feel happy!";
		StringTokenizer stoke = new StringTokenizer(input);
		while(stoke.hasMoreTokens()) {
			System.out.print(stoke.nextToken()+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(input.split(" ")));
		Scanner s = new Scanner(input);
		while(s.hasNext()) {
			System.out.print(s.next()+" ");
		}
	}
}

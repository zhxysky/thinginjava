package com.zhxy.chapter9.interfaces;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class AdaptedRandomDoubles extends RandomDoubles implements Readable {

	
	private int count;
	public AdaptedRandomDoubles(int count) {
		this.count = count;
		// TODO Auto-generated constructor stub
	}
	@Override
	public int read(CharBuffer cb) throws IOException {
		
		if(count-- ==0) {
			return -1;
		}
		// TODO Auto-generated method stub
		String result = Double.toString(next()) + " ";
		cb.append(result);
		return result.length();
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(new AdaptedRandomDoubles(7));
		while(s.hasNext()) {
			System.out.println(s.next());
		}
	}

}

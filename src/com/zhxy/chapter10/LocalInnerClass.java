package com.zhxy.chapter10;

interface Counter {
	int next();
}

public class LocalInnerClass {

	private int count = 0;
	Counter getCount(final String name) {
		
		//局部内部类
		class LocalCounter implements Counter {

			public LocalCounter() {
				// TODO Auto-generated constructor stub
				System.out.println("LocalCounter");
			}
			
			@Override
			public int next() {
				// TODO Auto-generated method stub
				System.out.print(name);
				
				return count++;
			}
			
		}
		return new LocalCounter();
	}
	
	
	Counter getCounter2(final String name) {
		//匿名内部类
		return new Counter(){
			{
				System.out.println("Counter()");
			}
			public int next() {
				System.out.print(name);
				return count++;
			}
		};
	}
	
	public static void main(String[] args) {
		LocalInnerClass lic = new LocalInnerClass();
		Counter c1 = lic.getCount("Local inner");
		Counter c2 = lic.getCounter2("Anonymous inner");
		for(int i=0;i<5;i++) {
			System.out.println(c1.next());
		}
		for(int i=0;i<5;i++) {
			System.out.println(c2.next());
		}
	}
}

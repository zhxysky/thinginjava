package com.zhxy.test;

public class CurrencyTest {

	public static void main(String[] args) {
		for(Currency c:Currency.values()) {
			System.out.println(c);
		}
		
		Currency a =  Currency.TEN;
		switch(a) {
		case ONE:
			System.out.println("one....");
			break;
		case TWO:
			System.out.println("two....");
			break;
		case FIVE:
			System.out.println("five...");
			break;
		case TEN:
			System.out.println("ten...");
			break;
		case TWENTY:
			System.out.println("twenty...");
			break;
		case HUNDRED:
			System.out.println("hundred...");
			break;
		default:
			System.out.println("nothing....");
		}
		
	}
}

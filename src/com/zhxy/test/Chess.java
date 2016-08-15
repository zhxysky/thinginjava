package com.zhxy.test;


class Game{
	
	Game()  {
		
	}
	Game(int i) {
		System.out.println("Game constructor");
	}
}

class BoardGame extends Game {
	
	BoardGame() {
		super();
		System.out.println("BoardGame default constructor");
	}

	BoardGame(int i) {
		super(i);
		System.out.println("BoardGame constructor");
	}
	
}
public class Chess extends BoardGame{

	Chess() {
		super(11);
		System.out.println("Chess Constructor");
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Chess x = new Chess();
	}

}

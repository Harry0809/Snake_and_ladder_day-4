package com.snake.ladder;

public class SnakeAndLadder {
	static int start_position = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dice = (int) (Math.random() * 10) % 6 + 1;

		System.out.println("Welcome to Snake and ladder Game");
		System.out.println("Number on dice:" + dice);
	}

}

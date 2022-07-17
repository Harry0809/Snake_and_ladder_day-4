package com.snake.ladder;

public class SnakeAndLadder {
	
	
		// TODO Auto-generated method stub
		static int dice_count = 0;
		static final int initial_position = 0;
		static final int no_play = 0;
		static final int ladder = 1;
		static final int snake = 2;
		static int current_position = 0;

		public static void main(String[] args) {
			System.out.println("Welcome to Snake and ladder game");
			while (current_position < 100) {
				int dice = (int) (Math.random() * 10) % 6 + 1;
				int option = (int) (Math.random() * 10) % 3;
				dice_count++;

				if (option == ladder) {
					System.out.println("ladder!!");
					current_position += dice;

				} else if (option == snake) {
					System.out.println("snake!!");
					current_position -= dice;

				} else {
					System.out.println("N0 play");

				}
				if (current_position > initial_position) {
					current_position -= initial_position;
				}
				if (current_position > 100)
					current_position = 0;

				System.out.println("currentposition: " + current_position);
			}

			System.out.println("current position" + " " +  current_position + " " +  "dice count " + " " + dice_count);
		}
	}

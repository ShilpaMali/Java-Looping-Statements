package com.loop.statements;

public class WhileLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// i=5, i=4 , i=3, i=2, i=1, i=0
				int i = 5; // initialization
				while (i >= 1) { // i>=1 - condition
					// 5>=1-T,4>=1-T, 3>=1- T, 2>=1-T, 1>=1-T, 0>=1-F
					System.out.println(i); // statement
					// 5 4 3 2 1
					i--; // decrement operator
				}
		

	}

}

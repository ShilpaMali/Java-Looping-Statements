package com.loop.statements;

public class DoWhileLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//i=5, i=4, i=3, i=2, i=1
		int i = 5;
		do {
			System.out.println(i); //5 4 3 2 1
			i--;
		} while (i >= 1);
		//4>=1-T, 3>=1-T, 2>=1-T, 1>=1-T, 0>=1-F

	}

}

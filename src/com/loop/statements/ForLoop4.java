package com.loop.statements;

public class ForLoop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// i=5, i=4, i=3, i=2 , i=1, i=0
		for (int i = 5; i > 1; i--) {// 5>1-T, 4>1-T, 3>1-T, 2>1-T, 1>1-F
			System.out.println("value of i>>" + i); // 5 4 3 2
		} // jvm control here
			// System.out.println("outside for loop");

	}

}

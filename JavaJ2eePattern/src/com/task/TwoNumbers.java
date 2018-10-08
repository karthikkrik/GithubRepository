package com.task;

import java.util.Scanner;

public class TwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number a: ");
		int a = in.nextInt();
		System.out.println("Enter the number b: ");
		int b = in.nextInt();
		in.close();
		if(a-b>=2){
			System.out.println(a+"(a) is the bigger than b by more than 2");
		}else if(b-a>=2){
			System.out.println(b+"(b) is the bigger than a2 by more than 2");
		}else{
			System.out.println("INCONCLUSIVE");
		}
		
		
	}

}

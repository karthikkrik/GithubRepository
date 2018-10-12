package com.task;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the input string: ");
		String str = sc.nextLine();
		sc.close();
		
		char arr[] = str.toCharArray();
		int length = str.length();
		
		//upper sequence
		for(int i=0;i<=length-1;i++){
		   for(int j=0;j<=i;j++)   {
			System.out.print(arr[j]+" ");
		}
		System.out.println();
		}
		
		//lower sequence
		for(int i=length-2;i>=0;i--){
			for(int j=0;j<=i;j++){
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
	}
	

}

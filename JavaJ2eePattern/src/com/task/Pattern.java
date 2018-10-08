package com.task;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "JavaJ2ee";
		char arr[] = str.toCharArray();
		int length = str.length();
		
		//upper sequence
		for(int i=0;i<=length-1;i++){
		   for(int j=0;j<=i;j++)   {
			System.out.print(arr[j]);
		}
		System.out.println();
		}
		
		//lower sequence
		for(int i=length-2;i>0;i--){
			for(int j=0;j<=i;j++){
				System.out.print(arr[j]);
			}
			System.out.println();
		}
	}
	

}

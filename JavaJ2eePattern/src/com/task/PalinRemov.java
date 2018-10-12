package com.task;

import java.util.Scanner;

public class PalinRemov {
	
	public static String strRev(String str){
//		char[] ch = str.toCharArray();
//		String rev = "";
//		for (int i=ch.length-1;i>=0;i--){
//			rev += Character.toString(ch[i]);
//		}
		StringBuilder st = new StringBuilder(str);
		String rev = st.reverse().toString();
		return rev;
	}

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the input string: ");
		String str  = sc.nextLine();
		String strresult = "";
		sc.close();
		String [] strArr  = (str.split(" "));
	
	for(int i=0;i<=strArr.length-1;i++){
	if(strArr[i].length()>1){	
		if(!(strArr[i].equalsIgnoreCase(strRev(strArr[i])))){//passing original array string to strRev method
				strresult = strresult +strArr[i]+" ";// and comparing with original array string.
			}
	}else{
		strresult = strresult +strArr[i]+" ";
		 }
   }
	System.out.println(strresult);
	
}

}

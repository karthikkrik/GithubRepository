package com.task;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SmallGreater {

	public static int getMax(int[] arr){
		int l = arr.length;
		int maxdigit = arr[0];
		for(int i=0;i<l;i++){
			
			if(arr[i]>maxdigit){
				maxdigit = arr[i];
			}
		}
		return maxdigit;
	}
//	public static int getMin(int[] arr){
//		int l = arr.length;
//		int mindigit = arr[0];
//		for(int i=0;i<l;i++){
//			
//			if(arr[i]<mindigit){
//				mindigit = arr[i];
//			}
//		}
//		return mindigit;
//	}
	public static void main(String[] args) {
		int []arr = {6,3,9,8,10,2,1,15,7};
		int l = arr.length;
		int [] arrcopy = new int[l];
		arrcopy = Arrays.copyOf(arr, l);//copying array to new array
		Arrays.sort(arrcopy);
		
		int []arrresult = new int[l];
		
		for(int i=0;i<l-1;i++){
			for(int j=0;j<l-1;j++){
				
				if(arr[i]==arrcopy[j]){
					arrresult[i]=arrcopy[j+1];
				}
				
			}
		}
		for(int i=0;i<l-1;i++){	
			System.out.print(arr[i]+" ");
		}
		System.out.println();
//		for(int i=0;i<l-1;i++){	
//			System.out.print(arrcopy[i]+" ");
//		}
//		System.out.println();
		for(int i=0;i<l-1;i++){
			if(arr[i]==getMax(arr)){
				System.out.println("_");
			}else{
			System.out.print(arrresult[i]+" ");
			}
		}
		
	
//		for(int i=0;i<l;i++){
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
//		for(int i=0;i<l-1;i++){
//			arr[i]=arr[i+1];
//			System.out.print(arr[i]+" ");
//				
//		}
//		System.out.print(" _");	
	}

}

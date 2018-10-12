package com.task;


import java.util.Arrays;

public class SmallGreater {

//	finding the maximum value of the array
	
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

	public static void main(String[] args) {
		int []arr = {6,3,9,8,10,2,1,15,7};
		int l = arr.length;
		int [] arrcopy = new int[l+1];
		arrcopy = Arrays.copyOf(arr, l+1);//copying array to new array
		Arrays.sort(arrcopy);
		
		int []arrresult = new int[l];
		
		for(int i=0;i<l;i++){
			for(int j=0;j<l;j++){
				
				if(arr[i]==arrcopy[j]){
					arrresult[i]=arrcopy[j+1];
				}
				
			}
		}
//		Printing the input array
		for(int i=0;i<l;i++){	
			System.out.print(arr[i]+" ");
		}
		System.out.println();
//		Printing the intermediate sorted array(arrcopy)
//		for(int i=0;i<l;i++){	
//			System.out.print(arrcopy[i]+" ");
//		}
//		System.out.println();
//		Printing the result array
		for(int i=0;i<l;i++){
			if(arr[i]==getMax(arr)){
				System.out.print("_ ");
			}else{
			System.out.print(arrresult[i]+" ");
			}
		}
		

	}

}

package com.task;

public class DupArray {
	
	
	public static void main(String[] args) {
		int [] arr = {2,0,0,4,8,2};
		int l = arr.length-1;
	//manipulation as per the requirement	
	for(int i=0;i<=l;i++){
		for(int j=0;j<=l;j++){
			while(i!=j){
				if(arr[i]==arr[j]){
					arr[i] += arr[j];
					arr[j] = 0;
				}
				break;
			}
		}
	}
	System.out.println();
//	Shifting zeros to the last
	for(int i=l;i>0;i--){
		for(int j=i-1;j>=0;j--){
			if(arr[i]!=0){
				int temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
			}
		}
		
	}
	System.out.println();
//	printing the Array
	for(int i=0;i<=l;i++){
		System.out.print(" "+arr[i]+" ");
	}
	}

}

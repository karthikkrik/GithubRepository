package com.task;

public class DupArray {
	
	
	public static void main(String[] args) {
		int [] arr = {2,8,0,4,0,8};
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
//	Shifting zeros to the last
	for(int i=0;i<l;i++){
		if(arr[i]==0){
			arr[i]=arr[i+1];//Assigning right adjacent element to current element
			arr[i+1]=0;  //shifting current zero to adjacent element
		}
	}
//	printing the Array
	for(int i=0;i<=l;i++){
		System.out.print(arr[i]+" ");
	}
	}

}

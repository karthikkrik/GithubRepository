package com.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomGen {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	Random rd = new Random();

	System.out.println("Enter the names: ");
	List<String> names  = new ArrayList<String>();	
	String [] arr = sc.nextLine().split(" ");
	sc.close();
		names.addAll(Arrays.asList(arr));
		Collections.shuffle(names);
	System.out.println(names.get(1));	
	
	System.out.println(arr[rd.nextInt(arr.length)]);
		
			
	}

}

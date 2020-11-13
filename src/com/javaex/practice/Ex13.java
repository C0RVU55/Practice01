package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		//문제13
		
		//달러=원화/환율
		
		Scanner sc=new Scanner(System.in);
		
		final double one$=1230.95;
		
		System.out.print("환전할 원화를 입력하세요: ");
		int won=sc.nextInt();
		
		double dollar=(double)won/one$;
		
		System.out.println("받으실 달러는 "+dollar);
		
		
		sc.close();

	}

}

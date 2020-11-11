package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		//문제130000000000000
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("환전할 원화를 입력하세요: ");
		
		final double one=1230.95;
		double won=sc.nextDouble();
		
		double dollar=won*one;
		
		System.out.println("받으실 달러는 "+dollar);
		
		
		sc.close();

	}

}

package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		
		//문제12
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("반지름을 입력하세요: ");
		double r=sc.nextDouble();
		
		final double PI=3.14;
		
		double s=r*r*PI;
		
		System.out.println("원의 넓이는 "+s);
		
		sc.close();
	}

}

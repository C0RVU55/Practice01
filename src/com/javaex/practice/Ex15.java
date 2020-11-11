package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		//문제15
		
		Scanner sc=new Scanner(System.in);
		
		final double MI=1.609;
		
		System.out.print("마일을 입력하세요: ");
		double miles=sc.nextDouble();
		
		double km=MI*miles;
		
		System.out.println(miles+"마일은 "+km+"킬로미터입니다");
		
		sc.close();

	}

}

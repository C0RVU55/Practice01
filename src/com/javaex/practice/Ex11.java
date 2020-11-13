package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		//문제11
		
		//원금합계=연*월*월적립액
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("월급을 입력하세요: ");
		int pay=sc.nextInt();
		
		int sum=10*12*pay;
		
		System.out.println("10년동안 최대 저축액은 "+sum+"원입니다.");
		
		sc.close();

	}

}

package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {
		//문제4
		/*
		int x, y
		x=10
		y=20
		
		sum=x+y
		System.out.println("합은'+sum);
		*/
		
		int x, y; //; 빠짐.
		x=10; //; 빠짐.
		y=20; //; 빠짐.
		
		int sum=x+y; //새 변수 sum의 자료형과 ; 빠짐. x와 y가 int이므로 이 변수들의 합인 sum도 int임.
		System.out.println("합은"+sum); //"합은"은 문자열이라 전부 큰따옴표로 표기해야 함.
	}

}

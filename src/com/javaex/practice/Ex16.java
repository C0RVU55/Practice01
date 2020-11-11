package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		//문제16
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("상품가격: ");
		double price=sc.nextDouble();
		System.out.print("받은 돈: ");
		double paied=sc.nextDouble();
		
		System.out.println("=======================");
		System.out.println("받은 돈: "+paied+"\n상품가격: "+
				price+"\n부가세: "+(0.1*price)+"\n잔액: "+(paied-price));
		
		sc.close();

	}

}

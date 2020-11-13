package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		//문제20 
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("500원 개수: ");
		int five100=sc.nextInt();
		System.out.print("100원 개수: ");
		int one100=sc.nextInt();
		System.out.print("50원 개수: ");
		int five10=sc.nextInt();
		System.out.print("10원 개수: ");
		int one10=sc.nextInt();
		
		int sum=(500*five100)+(100*one100)+(50*five10)+(10*one10);
		
		System.out.println("동전의 총합은 "+sum+"원입니다.");
		
		
		
		sc.close();

	}

}

package com.javaex.practice;

public class Ex07 {

	public static void main(String[] args) {
		//문제7
		
		int i=10;
		int n=++i %2; //n=(10+1)%2=1 --> 문제6과 달리 +1이 먼저 적용됨.
		
		System.out.println(i); //변수 n에서 이미 +1된 값이 i에 저장됐기 때문에 i=11
		System.out.println(n);		

	}

}

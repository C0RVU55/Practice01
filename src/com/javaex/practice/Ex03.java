package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		//문제3
		
		int x=1;
		int y=1;
		
		int a=++x*2; //a=(x+1)*2=4
		int b=y++*2; //b=(1)*2=2
		
		System.out.println("a="+a); //a=4
		System.out.println("b="+b); //b=2
		System.out.println("x="+x); //x=2 --> a에서 +1돼서 값이 2로 변함.
		System.out.println("y="+y); //y=2 --> b에서 +1된 게 이때 출력됨.  

	}

}

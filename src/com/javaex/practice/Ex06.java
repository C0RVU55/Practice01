package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		//문제6
		
		int i=10;
		int n=i++ %2; //n=(10)%2=0 --> i++에 +1된 게 여기가 아니라 뒤에 i를 다시 불러오게 되면 그때 적용됨.
		
		System.out.println(i); //변수 n에서 +1된 게 여기서 출력됨. --> 10+1=11
		System.out.println(n); 

	}

}

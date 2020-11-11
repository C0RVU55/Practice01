package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
		//문제9
		/*값이 0이 나오는 이유를 쓰고 정상적인 결과가 나오도록 코드 수정하기.
		
		double f=80.0;
		System.out.println(5/9*(f-32.0));
		
		c=5/9*(f-32)
		f=(c*9/5)+32
		*/
		
		double f=80.0;
		System.out.println(5.0/9.0*(f-32.0));
		System.out.println((double)5/(double)9*(f-32.0));
		/*섭씨=(5/9*(80.0-32.0))에서 5/9=0.555...인데 정수 계산이라 소수점 아래가 자동으로 탈락돼서 0*48.0=0이 나옴.
		 * --> 출력하기 전에 5/9를 실수로 표현하거나 자료형을 double로 바꿈.*/

	}

}

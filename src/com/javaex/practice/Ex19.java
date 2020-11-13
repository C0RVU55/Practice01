package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		//문제19
		
		//거리=속력*시간
		
		long speed=300000L;
		long second=60*60*24*365L;
		long distance=speed*second;
		
		System.out.println("빛이 1년 동안 가는 거리는 "+distance+"km 입니다.");

	}

}

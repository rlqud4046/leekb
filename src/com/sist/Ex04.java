package com.sist;

public class Ex04 {

	public static void main(String[] args) {
		
		
		System.out.println(10+2);		//숫자 + 숫자 >> 숫자 +가 덧셈으로 인식 12
		System.out.println("10"+2);		//문자 + 숫자 >> 문자 10이라는 문자에 +가 연결자로 쓰이고 2가 붙여져 102라고 출력
		System.out.println(10+"2"); 	//숫자 + 문자 >> 문자 
		System.out.println("10"+"2");	//문자 + 문자 >> 문자
		System.out.println("a = " + 10 + 2);	//문자 + 문자 + 문자 >> 문자 a = 102
		System.out.println("a = " + (10 + 2));	//문자 + (숫자 + 숫자) >> 문자 a = 12
		
		// **** +는 더하기로 쓰일 수도 있고 문자간의 연결자로 쓰일 수도 있다. 
	}

}

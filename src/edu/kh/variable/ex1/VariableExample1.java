package edu.kh.variable.ex1;

public class VariableExample1 {
	
	public static void main(String[] args) {
		
		System.out.println(2 * 3.141592653589793 * 10);
		System.out.println(3.141592653589793 * 10 * 10);
		System.out.println(3.141592653589793 * 10 * 10 * 20);
		System.out.println(4 * 3.141592653589793 * 10 * 10);
		
		/* 변수(Variable)
		 * - 메모리(RAM)에 값을 기록하는 공간
		 * - 공간에 기록되는 값(DATA)이 변할 수 있어서 변수라고 함
		 * - 변수는 여러 종류 존재(저장되는 값의 형태, 크기가 다름)
		 * 
		 * 변수 사용의 장점
		 * - 가독성이 증가 (읽기 편해짐)
		 * - 재사용성 증가 (한번 만든 변수를 계속 사용)
		 * - 코드 길이 감소
		 * - 유지보수성 증가 (코드 수정이 간단해짐) */
		
		// 변수 사용
		double pi = 3.141592653589793; // 원주율
		int r = 10; // 반지름(radius)
		int h = 20; // 높이(height)
		
		System.out.println("---------------------------");
		System.out.println(2 * pi * r);
		System.out.println(pi * r * r);
		System.out.println(pi * r * r * h);
		System.out.println(4 * pi * r * r);
	}
}

package com.iu.s1;

import java.util.Scanner;

public class SchoolController {


	//메서드명은 start
	//리턴은 x
	//내용은
	//1.학생등록
	//2.성적입력
	//3.성적조회
	//4.전체조회
	//5.프로그램 종료


	public void start() {

		boolean check=true;
		
		while(check) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.학생등록");
		System.out.println("2.성적입력");
		System.out.println("3.성적조회");
		System.out.println("4.전체조회");
		System.out.println("5.프로그램 종료");
		
		int select=sc.nextInt();
		
		
		switch(select) {
		
		
		case 1:
			System.out.println("학생을 등록하세요.");
			String names=sc.next();
			break;
			
			
			
		case 2:
			
			System.out.println("성적을 입력하세요.");
			int points=sc.nextInt();
			break;
			
		case 3:
			System.out.println();
			break;
			
			
		case 4:
			
			System.out.println();
			break;
			
		case 5:
			
			System.out.println("프로그램이 종료되었습니다.");
			break;
		
		
		
		
		
		}
		
		
		
				
		
		
		} 
		
		



	}



}

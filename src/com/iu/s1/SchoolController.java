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
		
		Scanner sc=new Scanner(System.in);
		StudentService ss = new StudentService(); //맨위에다가 메서드 선언해줘야함!!!!
		StudentView sv = new StudentView();
		Student [] students=null;
		

		boolean check=true;
		
		while(check) {
		
		System.out.println("1.학생등록");
		System.out.println("2.성적입력");
		System.out.println("3.성적조회");
		System.out.println("4.전체조회");
		System.out.println("5.프로그램 종료");
		
		int select=sc.nextInt();
		
		
		switch(select) {
		
		
		case 1:
			
			students=ss.addStudent();
			break;
			
			
			
		case 2:
			
			
			System.out.println("성적을 입력하세요.");
			int num=sc.nextInt();
								
			break;
			
		case 3:
			
			System.out.println("성적조회:");
			break;
			
			
		case 4:
			
			
			sv.view(students);  //public void view(Student [] students) 니까!!! 괄호 안에 써줘야함
			break;
			
		case 5:
			
			System.out.println("프로그램이 종료되었습니다.");
			check=!check;
			break;
		
		
		
		
		
		}
		
		
		
				
		
		
		} 
		
		



	}



}

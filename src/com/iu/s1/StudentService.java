package com.iu.s1;

import java.util.Scanner;

public class StudentService {

	//학생추가 메서드
	//메서드명 addStudent
	//학생 인원수 입력
	//학생수만큼
	//이름입력
	//번호입력


	//1번누르면 여기로!
	//국어입력은 안함!
	//SchoolController로 가게 2번누르면 나오게


	public Student [] addStudent() { //리턴타입을 배열로 바꿔줘야함 Student []

		Scanner sc=new Scanner(System.in);



		System.out.println("학생 인원 수 입력:");
		int num=sc.nextInt();

		Student [] students=new Student[num];  //Student 배열 선언!!!-> 없어지니까 return 해줘야함

		for(int i=0;i<students.length;i++) {
			Student student=new Student();
			System.out.println("이름입력:");
			student.name=sc.next();

			System.out.println("번호입력:");
			student.num=sc.nextInt();
			students[i]=student; //배열에 정보 저장


		}
		return students; //배열에 모든 정보가 저장됨->리턴해줘야함
	} 



}

package com.iu.s1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*SchoolController sc=new SchoolController();
		sc.start();
		*/
		
		//2줄을 1줄로 줄인것!!!! 한번호출하고  더이상 쓰지 않을때 이런식으로 씀
		new SchoolController().start();
		
		

		//객체:눈에 보이는 사물 또는 개념
		//학생:3명 

		/*Scanner sc=new Scanner(System.in);
		Student [] ar=new Student[2]; //학생 객체를 담을 수 있는 공간만 만듬 아직 학생은 안채워짐 학생 1명은 집어넣어야
		Student student=new Student();


		ar[0].name=sc.next();
		System.out.println(ar[0].name);




		for(int i=0;i<ar.length;i++) {
			student.name=sc.next();
			ar[i]=student;  //i=0, iu i=1, suzy
			System.out.println(ar[i].name);


		}

		System.out.println("==============================================");
		for(int i=0;i<ar.length;i++) {
			student=new Student();
			student.name=sc.next();
			ar[i]=student; //i=0,iu i=1,suzy
			System.out.println(ar[i].name);


		}
*/
	}

}

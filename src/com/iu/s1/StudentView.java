package com.iu.s1;

public class StudentView {

	//학생들의 정보를 출력
	//메서드명 view
	//학생들의 정보출력
	
	//view는 4번 눌렀을때 실행됨
	
	
	
	public void view(Student [] students) { //매개변수를 넣기!!!!!!!!!
	
		
		
	for(int i=0;i<students.length;i++) {
		System.out.println("이름:"+students[i].name);
		System.out.println("번호:"+students[i].num);
		System.out.println("번호:"+students[i].kor);
		System.out.println("번호:"+students[i].eng);
		System.out.println("번호:"+students[i].math);
		
	
	
	}
		
	}
	
}

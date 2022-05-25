package j09_접근지정;

import j09_접근지정.Teacher.*;


public class UserMain {

	public static void main(String[] args) {
		Student student = new Student();
		Teacher teacher = new Teacher();
		
		student.setName("김준일");
		System.out.println(student.getName());
		
		teacher.setName("김준일");
		teacher.setAddress("부산");
		teacher.setPhone("010-111-1111");
		teacher.showInfo();
		
		
				

	}

}

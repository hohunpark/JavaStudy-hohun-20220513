package j08_클래스;

public class User {
	String name;
	String age;
	String phone;
	String adress;

	User() {	//기본 생성자
		System.out.println("생성.");
	}
	
	User(String name) { //사용자정의 생성자
		System.out.println(name);
	}
	
	void setName(String name) {
		System.out.println("setName 메소드 안에서 호출 : " + this);
		this.name = name;
	}
	
}

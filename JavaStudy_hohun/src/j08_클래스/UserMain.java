package j08_클래스;

public class UserMain {

	public static void main(String[] args) {
		//User user1 = new User();
		//user1.name = "김준일";
		//User user2 = new User();
		//user2.age = "29";
		
		//System.out.println(user1.name);
		//System.out.println(user1.age);
		//System.out.println(user2.name);
		//System.out.println(user2.age);

		User user1 = new User();
		System.out.println("첫번재 : " + user1.name);
		System.out.println("메인메소드에서 호출 : " + user1.name);
		
		user1.setName("aaaa");
		System.out.println("두번째 : " + user1.name);
		
		
	}

}

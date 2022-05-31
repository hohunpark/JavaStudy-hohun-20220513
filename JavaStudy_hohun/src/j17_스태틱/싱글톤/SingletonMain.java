package j17_스태틱.싱글톤;

public class SingletonMain {

	public static void main(String[] args) {
		
		/*
		 * 싱글톤
		 * 1. 유일한 객체(인스턴스)를 생성해야한다.
		 */
		
		
		
		Singleton singleton = Singleton.getSingleton();
		singleton.setCount(10);
		singleton.printInfo();

		Singleton singleton2 = Singleton.getSingleton();
		singleton.setCount(20);
		singleton.printInfo();
		
	}

}

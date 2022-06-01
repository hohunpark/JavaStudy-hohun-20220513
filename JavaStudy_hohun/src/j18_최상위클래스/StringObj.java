package j18_최상위클래스;

import java.util.Scanner;

public class StringObj {

	public static void main(String[] args) {
		String name = "김준일";
		String name2 = "김준일";
		
		System.out.println(name == name2);
		//리터럴 값이라 (원래있는 김준일이라는 리터럴값이니까) 주소가 같음.
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름1 : ");
		name = scanner.nextLine();
		System.out.print("이름2 : ");
		name2 = scanner.nextLine();
		System.out.println(name == name2);
		//new 로 생성이 되었기때문에 주소가 다르다.
		
		name = new String("김준일");
		name2 = new String("김준일");
		
		System.out.println(name == name2);
		//new 로 생성이 되었기때문에 주소가 다르다.
		System.out.println(name.equals(name2));
		//이렇게 해줘야 값이 
		
	}

}

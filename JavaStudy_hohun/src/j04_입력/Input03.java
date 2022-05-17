package j04_입력;

import java.util.Scanner;

public class Input03 {

	public static void main(String[] args) {
		/*
		 * [개인정보 입력]
		 * 이름 : 000				문자열   name
		 * 나이 : 00				정수     age
		 * 연락처 : 000-0000-0000	문자열   phone
		 * 주소 : 00 00 00			문자열   address
		 * 성별 : 0					문자     gender
		 * 
		 * 이름 => 000				
		 * 나이 => 00				
		 * 연락처 => 000-0000-0000	
		 * 주소 => 00 00 00			
		 * 성별 => 0	
		 * 
		 * 
		 */

		Scanner scanner = new Scanner(System.in);

		String name = null;
		int age = 0;
		String phone = null;
		String address = null;
		char gender = ' ';
		
		System.out.println("[개인정보 입력]");
		System.out.print("이름 : ");
		name = scanner.next();
		System.out.print("나이 : ");
		age = scanner.nextInt();
		System.out.print("연락처 : ");
		phone = scanner.next(); //010-4044-4444 \n (\n이 살아있음)
		scanner.nextLine(); // \n날려야함
		
		System.out.print("주소 : ");
		address = scanner.nextLine();
		System.out.print("성별 : ");
		gender = scanner.next().charAt(0);
		
		System.out.println();
		System.out.println("이름 => " + name);
		System.out.println("나이 => " + age);
		System.out.println("연락처 => " + phone);
		System.out.println("주소 => " + address);
		System.out.println("성별 => " + gender);
		
		// next = 스페이스바, 엔터는 무시한다.
		// nextLine = Line을써야 스페이스바
		
	}

}

package j04_입력;

import java.util.Scanner;

public class Input02 {

	public static void main(String[] args) {
		/*
		 * 문자열1 입력 : nextLine()	hi
		 * 문자열2 입력 : next()		안녕
		 * 문자 입력 : next().charAt(0)	A
		 * 정수 입력 : nextInt()		10
		 * 실수 입력 : nextDouble()		3.14
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		/* 내가푼거
		System.out.print("문자열1 입력 : ");
		String A1 = scanner.nextLine();
		System.out.print("문자열2 입력 : ");
		String A2 = scanner.next();
		System.out.print("문자 입력 : ");
		char A3 = scanner.next().charAt(0);
		System.out.print("정수 입력 : ");
		int A4 = scanner.nextInt(); 
		System.out.print("실수 입력 : ");
		double A5 = scanner.nextDouble();
		
		System.out.println("문자열1 출력 : " + A1);
		System.out.println("문자열2 출력 : " + A2);
		System.out.println("문자 출력 : " + A3);
		System.out.println("정수 출력 : " + A4);
		System.out.println("실수 출력 : " + A5);
		*/
		
		String a = null;
		String b = null;
		char c = ' ';
		int d = 0;
		double e = 0;
		
		System.out.print("문자열1 출력 : ");
		a = scanner.nextLine();
		System.out.print("문자열2 출력 : ");
		b = scanner.next();
		System.out.print("문자 출력 : ");
		c = scanner.next().charAt(0);
		System.out.print("정수 출력 : ");
		d = scanner.nextInt(); 
		System.out.print("실수 출력 : ");
		e = scanner.nextDouble();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

}

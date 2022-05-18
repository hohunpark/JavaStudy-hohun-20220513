package j05_조건;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		
		System.out.println("숫자를 입력하세요 : ");
		
		x = scanner.nextInt();
		y = scanner.nextInt();
		 
		// 조건문으로 풀이하기
		if (x == 0 && y == 0) {
			System.out.println("원점");
		} else if(x == 0 || y == 0 || x > 1000 || x < -1000 || y > 1000 || y < -1000) {
			System.out.println("계산 불가");
		} else if(x > 0 && y > 0) {
			System.out.println("1사 분면 입니다.");
		} else if(x > 0 && y < 0) {
			System.out.println("2사 분면 입니다.");
		} else if(x < 0 && y < 0) {
			System.out.println("3사 분면 입니다.");
		} else if(x < 0 && y > 0) {
			System.out.println("4사 분면 입니다.");
		}
		
		/* 삼항 연산자로 풀이하기
		 * 
		String result = (x == 0 && y == 0) ? "원점" 
				: (x == 0 || y == 0 || x > 1000 || x < -1000 || y > 1000 || y < -1000) ? "계산 불가"
						: (x > 0 && y > 0) ? "1사 분면 입니다."
								: x > 0 && y < 0 ? "2사 분면 입니다."
										: (x < 0 && y < 0) ? "3사 분면 입니다." : "4사 분면 입니다.";
		System.out.println(result);
		*/
	}
		
}
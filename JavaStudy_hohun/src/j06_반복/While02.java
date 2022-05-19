package j06_반복;

public class While02 {

	public static void main(String[] args) {
		/*
		 * 구구단 2단 출력
		 * 
		 * 2 x 1 = 2
		 * 2 x 2 = 4
		 * 2 x 3 = 6
		 * . . .
		 * 2 x 9 = 18
		 * 
		 */

		int dan = 2;
		int num = 0;
		int result = 0; 

		/* 내가 푼거
		while(num < 9) {
			result = dan * (num + 1);
			System.out.println(dan + " X " + (num + 1) +" = " + result);
			num++;
		}
		*/
		
		// 풀이
		while(num < 9) {
			System.out.println(dan + " X " + (num + 1) + " = " + dan * (num + 1));
			num++;
		}
		
		
	}

}

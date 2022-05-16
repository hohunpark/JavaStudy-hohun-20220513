package j03_연산;

public class Operation03 {

	public static void main(String[] args) {
		
		/*
		 * 1.
		 * year = 1999
		 * 변수 result 
		 * 년도가 4의 배수이면 True 아니면 False 
		 * 
		 * 2.
		 * 윤년이면 true 아니면 false
		 * 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때 윤년.
		 */
		
		int year = 2000;
		
		boolean result1 = year % 4 == 0;  
		System.out.println(result1);
		
		boolean result2 = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;  
		System.out.println(result2);

	}

}

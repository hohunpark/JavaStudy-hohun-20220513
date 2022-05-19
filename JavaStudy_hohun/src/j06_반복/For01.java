package j06_반복;

public class For01 {

	public static void main(String[] args) {
		
		// for(선언; 조건; 조건변화)
		
		for(int i = 0; i < 5; i++) {
			System.out.println(i + 1);
		}
		
		// while 과 형태는 비슷함. 위치만 다름.
		
		/*
		int i = 0;
		while(i < 5) {
			System.out.println(i + 1);
			i++;
		}
		*/
		
		// while 은 조건(i < 5)이 자유롭다.
		// for문은 규칙적인 반복을 사용한다.
		
		for(int i = 0; i < 5; i++) {
			System.out.println(5 - i);
		}
		
	}

}

package j06_반복;

public class Continue {

	public static void main(String[] args) {
		
		// continue : countinue를 만나게되면 멈추지말고(braek) 다음 반복으로 넘어가라.(=컨티뉴는 반복중 해당되는 조건을 제외시키는개념)
		
		
		for(int i = 0; i < 10; i++) {
			if(i%2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		

	}

}


package j08_클래스;

/*
 * 1. Car 클래스를 만든다.
 * 2. Car 클래스의 속성(변수) 제조사(company), 모델(model), color(색상)
 * 3. Car 클래스의 기능(메소드) showCompanyInfo(
 * showCompanyInfo() -> 000회사에서 제조된 차량입니다.
 * showInfoAll() -> 
 * 제조사 : KIA
 * 모델 : k5
 * 색상 : 화이트
 * getCar() -> return "KIA_K5_화이트"
 * setColor() -> 매개변수에 색상을 받아서 color 변수의 값을 변경
 * 
 * KIA, K7, 블랙 - setColor(블루)
 * 현대자동차, 소나타, 화이트 - setColor(그레이)
 * Tesla, model13, 레드 - setColor(그린)
 * 
 */
// 
// 클래스명이랑 이름이 같다.
// 


public class CarMain {

	public static void main(String[] args) {
		
		Car kcar = new Car();
		kcar.company = "KIA";
		kcar.model = "K7";
		kcar.color = "블랙";
		
		Car hcar = new Car();
		hcar.company = "현대";
		hcar.model = "소나타";
		hcar.color = "화이트";
		
		Car tcar = new Car();
		tcar.company = "Tesla";
		tcar.model = "model13";
		tcar.color = "레드";
		
		
		
		kcar.showCompanyInfo();
		hcar.showCompanyInfo();
		tcar.showCompanyInfo();
		
		kcar.showInfoAll();
		hcar.showInfoAll();
		tcar.showInfoAll();
		
		System.out.println();
		
		System.out.println(kcar.getCar());
		System.out.println(hcar.getCar());
		System.out.println(tcar.getCar());
		
		System.out.println();
		
		kcar.setColor("블루");
		hcar.setColor("그레이");
		tcar.setColor("그린");
		
		kcar.showInfoAll();
		hcar.showInfoAll();
		tcar.showInfoAll();
		
	}

}

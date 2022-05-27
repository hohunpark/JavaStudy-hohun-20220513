package j13_다형성;

// * 업캐스팅을 한것만 다운캐스팅 가능하다
// * 다른클래스로 업캐스팅은 불가능하다.
// * 

public class FactoryMain2 {

	public static void main(String[] args) {
		Factory[] factorys = new Factory[100];
		
//		factorys[0] = new SmartPhoneFactory();
//		factorys[1] = new ComputerFactory();
		
		for(int i = 0; i < factorys.length; i++) {
			//삼항연산자, 조건연산자
			factorys[i] = i % 2 == 0 ? new SmartPhoneFactory() : new ComputerFactory();
		}
		
		for(Factory factory : factorys) {
			factory.start();
		}
		
		int i = 10;
		double d = i;
		int ii = (int) d;
		
		System.out.println();
		
		for(Factory factory : factorys) {
			if(factory instanceof SmartPhoneFactory) {
				SmartPhoneFactory spf = (SmartPhoneFactory) factory;
				spf.showSmartPhone();
				
			} else if(factory instanceof ComputerFactory) {
				ComputerFactory cf = (ComputerFactory) factory;
				cf.showComputer();
			}
			
		}
		
		
	}

}

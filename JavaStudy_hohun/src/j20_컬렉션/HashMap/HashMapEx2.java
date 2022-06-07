package j20_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String value = null;
		
		System.out.print("찾으실 값을 입력하세요 : ");
		value = scanner.nextLine();
		
		/*
		 * 자동차 -> car
		 * 자전거 -> bicycle
		 * 기차 -> train
		 * 비행기 -> airplane
		 * 
		 * 지원하지 않는 단어입니다.
		 */
		
		if(value.equals("자동차")) {
			System.out.println("car");
		} else if(value.equals("자전거")) {
			System.out.println("bicycle");
		} else if(value.equals("기차")) {
			System.out.println("train");
		} else if(value.equals("비행기")) {
			System.out.println("airplane");
		} else {
			System.out.println("지원하지 않는 단어입니다.");
		}

		
		// 해쉬맵으로 사용하게되면 if조건이 추가될필요없이 키값과 벨류값만 추가하면 된다. (더 사용이 편함)
		HashMap<String, String> words = new HashMap<String, String>();
		words.put("자동차", "car");
		words.put("자전거", "bicycle");
		words.put("기차", "train");
		words.put("비행기", "airplane");
		
		if(words.containsValue(value)) {
			System.out.println(words.get(value));
		} else {
			System.out.println("지원하지 않는 단어입니다.");
		}
		
	}

}

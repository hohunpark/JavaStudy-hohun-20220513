package j18_최상위클래스.entity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@RequiredArgsConstructor // = 기본생성자
@AllArgsConstructor // = 전체생성자
@Getter // = 게터
@Setter // = 세터
@EqualsAndHashCode // = 이퀄스 & 해쉬코드 
@ToString // = toString 

public class Product2 {
	@NonNull
	private int productCode;
	private String productName;
	private int category;
	private LocalDate productionDate;
	
}
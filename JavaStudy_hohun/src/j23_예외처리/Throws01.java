package j23_예외처리;

public class Throws01 {
	
	public void printArray(int[] arrays) throws Exception{	//throws : 에러난걸 다음으로 미루는거
		
		for(int i = 0; i < arrays.length + 1; i++) {
			System.out.println("index" + i + " : " + arrays[i]);
		}
		
	}
}

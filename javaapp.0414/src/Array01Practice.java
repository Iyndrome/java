
public class Array01Practice {

	public static void main(String[] args) {
		//사람이름(String) 배열을 생성
		//초기값을 가지고 생성
		String [] Music = 
			{"발라드", "트로트", "알앤비", "힙합"};
		//배열이름을 출력 - 해시코드 출력
		System.out.println("Music:" + Music);
			
	
	    //첫번째 요소를 출력
	   System.out.println(Music[0]);
	   //배열 요소 전체를 출력
	   for(int i = 0; i<4; i=i+1) {
		System.out.println(Music[i]);
	   }
	
	}
	
} 
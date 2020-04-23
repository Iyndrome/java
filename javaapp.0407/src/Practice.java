
public class Practice {

	public static void main(String[] args) {
		double d1 = 10.476;
		//위의 숫자를 소수 첫쨰 자리에서 반올림해서 저장
		System.out.println("result:" + result);

		//<게시판 페이지수>
		int result = (int)(d1+0.5);
		//소수 첫째자리 올림
		//페이지 당 데이터 개수-1 / 페이지 당 데이터 개수
		//예시 (아래)
		//int count = 110	
		//result = (int)(count/10 + 10.0 + 9.0/10);
		//System.out.println("result:" + result);
		
		//연습 (변수를 이용해 간략하게 세군데를 고치지 않아도 pageCnt 값만 고치면 된다. 
		//반올림하려는 자리를 소수 첫째자리로 옮기는게 중요->
		//옮기려면 ex) 10을 더 곱해서 값을 내주고 원하는값을 얻은뒤는 다시 10을 나눠준다.
		int count = 110;
		double pageCnt = 20.0;
		result = (int)(count/pageCnt +(pageCnt-1)/pageCnt);
		System.out.println("result:" + result);
		
		//short는 -32768 ~ 32767까지 저장가능
		//overflow 발생 - -32768
		short s1 = (short)32768;
		System.out.println("s1:" + s1);
		

		
	}

}

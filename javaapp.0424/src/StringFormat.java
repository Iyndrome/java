
public class StringFormat {

	public static void main(String[] args) {
		Integer x = 100;
		Integer y = 300;
		
		//인스턴스를 문자열로 변환 - toString 호출
		String msg = x.toString();
		
		//문자열과 문자열 결합 
		msg = x.toString() + y.toString();
		System.out.println(msg);
		//출력값은 10300으로 붙어서 나오기 때문에 콤마라던지 띄어쓰기라던지 작업은 원하는경우 따로 해줘야 한다.
		
		//x:100 y:200 와 같은 형태로 출력하고자 할때
		//숫자는 5자리로 표현
		//되도록이면 변수에 저장하고 출력
		//지금은 콘솔에 출력하기 때문에 printf를 이용하지만 
		//GUI 프로그램에서는 뷰에 텍스트를 설정하기 때문에 
		//문자열 데이터를 대입하는 구조로 출력을 합니다.
		msg = String.format("x:%5d y:%5d", x, y);
		System.out.println(msg);
		//이 값만 출력할 경우 값을 그대로 넣어도 출력은 동일하게 나온다.
		System.out.printf("x:%5d y:%5d", x, y);
	}

}

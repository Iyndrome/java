
public class Typecasting {

	public static void main(String[] args) {
		//byte 변수 2개 생성
        byte b1 = 10;
        byte b2 = 13;
        
        //위 문장은 에러가 남 
        //int보다 작은 데이터는 int로 변환해서 연산
        //b1과 b2를 int로 변환해서 연산했기 때문에 결과도 int가 됩니다.
        //int는 byte에 저장 못합니다.
        //byte result = b1 + b2;
       
		int result = b1 + b2;
		//int / int -> int
        result = 10 / 3;
        System.out.println("result:" + result);
		//double / int 는 int를 double로 변경해서 실행 -> 결과는 3.33333...
        //이와 같은 모습들을 자동 형 변환 이라고 한다.
        System.out.println("result:" + (10.0/3));
        
        //<강제 형 변환>
        //int x = 20.4; -> 지금은 double이기 떄문에 안됨
        //20.7을 강제로 정수로 변환해서 x에 저장->소수가 버려지므로 20이 저장
        //확인해볼땐 System.out.println("x:" + x); 이런 식으로 입력하여 확인가능
        int x = (int)20.7;
        System.out.println("x:" + x);
        
        byte b5 = 10;
        byte b6 = 13;
        //덧셈한 결과를 byte에 저장 ->강제 형 변환을 이용해서 해결
        //byte b7 = b5 + b6; 이 값을 
        //아래와 같이 결과값과 자료값을 따로 구분해서 계산해서 강제 형 변환을 완성한다
        byte b7 = (byte)(b5 + b6);
                      
        
        double d = 10 / 3;
        System.out.println("d:" + d);
        //결과값이 정수인 상태에서 double에 저장했기 때문에 정수가 나옴
        //정수끼리 산술연산은 최종값이 항상 정수가 나옴
        
        double d = (double)10 / 3;
        System.out.println("d:" + d);
        //정수와 실수간에 산술연산을 했기때문에 값은 실수인 3.0이 나온다 
        
        
        
	}

}

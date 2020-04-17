
public class MethodMain {

	public static void main(String[] args) {
		//MethodClass의 static void callByvalue(int) 메소드를 호출해서 사용할 것
		//static이 붙어서 인스턴스 생성 필요 없음
		//매개변수는 정수 1개 
		//리턴타입은 void
		//n은 정수
		//변수는 등호 왼쪽에 있거나 만들어진 직후에만 변수이다(긴가민가). 여기서 n은 변수가 아니다
		int n = 10;
		MethodClass.callByvalue(n);
		System.out.println("n:" + n);

	

	//매개변수가 참조형인 메소드 : call by reference
	//callbyreference를 띄어쓰기 하면 아래 구간처럼 오류가 남 (유의바람)
	
		int [] ar = {30, 20, 25};
		System.out.println ("ar[0]:" + ar[0]);
		ar[0] = ar[0] + 1;
		System.out.println ("ar[0]:" + ar[0]);	
		
		int [] xr = {30, 20, 25};
		MethodClass.callByReference(xr);
		System.out.println("xr[0]:" + xr[0]);
		
	
	
	//methodClass의 int sum1(int) 메소드 호출
	//static이 없으므로 인스턴스를 이용해서 호출
	MethodClass obj = new MethodClass();
	//리턴 타입이 정수이므로 결과를 정수 변수에 저장
			int result = obj.sum1(100);
			//결과를 출력
			System.out.println("합계:" + obj.sum1(1000000));
			
			//result = obj.sum2(10000000);
			//재귀는 메소드의 수행이 종료되기 전에 다시 메소드로 호출하기 때문에
			//메모리를 많이 사용해서 오류가 난다.			
			result = obj.sum2(100);
			System.out.println("합계:" + obj.sum2(1000));		
			

	

		
		}
}
	
	



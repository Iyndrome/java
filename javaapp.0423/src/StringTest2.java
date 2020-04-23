
public class StringTest2 {

	public static void main(String[] args) {
		// 문자열 분할
		String msg = "Helloworld";
		//4번쨰부터  끝까지 문자열을 분할
		System.out.println(msg.substring(4));
		//4번째부터 6번쨰까지 문자열을 분할
		System.out.println(msg.substring(4, 7));
				
		
		String contextPath = "http://localhost:9000";
		String uriString = "http://localhost:9000/index.jsp";
		//uriString에서 contextPath를 제외한 부분을 출력
		//잘라낼 글자수를 만들기
		int len = contextPath.length();
		//잘라내기
		String result = uriString.substring(len);
		System.out.println(result);
		
		//split은 패턴을 가지고 분할
		
		String data = "10000, -, 5600, 4300, 3700";
		//위의 문자열을 ,로 분할해서 출력하기
		String [] ar = data.split(",");
		//배열의 데이터 출력
		//빠른 열거를 이용한 접근
		//ar의 데이터를 순서대로 temp에 하나씩 대입
		
		//ar에 있는 데이터는 숫자로 된 문자열
		//숫자를 정수로 변환해서 합계 구하기
		//문자열 -> 정수 : Integer.parseInt
		// for(String temp : ar) { 
			//System.out.println(temp); 
			
		/* for(int i=0; i<ar.length; i=i+1) {
		  System.out.println(ar[i]); */   //이 방법 말고 위의 식으로 하는 법도 있다.
			
			int sum = 0;
			for(String temp : ar) {
				try {
				sum = sum + Integer.parseInt(temp);
			}catch(Exception e) {}
			}
			System.out.println("합계:" + sum);
			
			
			String temp = "Hello Java Hello Java Hi";
			System.out.println(temp.indexOf("Java"));
			System.out.println(temp.indexOf("Python"));
			

		
		
			
		}
	
		}
		
		
		
		


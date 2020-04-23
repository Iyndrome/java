
public class StringTest1 {

	public static void main(String[] args) {
		//문자열 인스턴스를 생성 - 리터럴을 이용해서 생성
		String str = "h123HAHAH$@A";
		
		//문자열의 길이를 출력 int length()
		int len = str.length();
		System.out.println("길이는:" + len);
		
		//문자열 안에서 특정한 위치의 문자를 출력
		//char charAt(int idx) 
		char imsi = str.charAt(4);
		System.out.println("4번째 문자:" + imsi); //0부터 시작이란걸 잊지말기. 그러므로 ~ 가 출력
		
		//str에 있는 모든 문자를 순서대로 출력
		//charAt 과 length를 이용
		//대문자 개수를 저장할 변수 생성
		int big = 0;
		//소문자, 숫자, 기타문자의 개수 구하기
		int small = 0;
		int num = 0;
		int etc = 0;
		for(int i=0; i<str.length(); i=i+1) {
			char ch = str.charAt(i);
			//System.out.println(ch);
			//대문자 확인 
			if(ch>= 'A' && ch<= 'Z') {
				big = big + 1;				
			}		
			else if(ch>= 'a' && ch<= 'z') {
				small = small + 1;
			}
			else if(ch >= '0' && ch<= '9') {
				//위의 식처럼 숫자 찾기 할때는 ch>=0이 아니라 ch>='0'으로 표시해줘야 한다.
				num = num + 1 ;
			}
			else {
				etc = etc + 1;
			}
		}
		System.out.println("대문자 개수:" + big);
		System.out.println("소문자 개수:" + small);
		System.out.println("숫자 개수:" + num);
		System.out.println("특수문자 개수:" + etc);
		
		
		//영문 대문자, 소문자, 숫자, 특수문자가 1개 이상 있으면 사용 가능한 비밀번호 
		//4가지 중에 한 가지라도 없으면 사용 불가능한 비밀번호 라고 출력
		if(big * small * num * etc != 0) {
		//if(big > 0 && small > 0 && num > 0 && etc > 0 ) { 도 되지만 위와 같이 식을 해도 된다. 
			//위의 식이 나올수 있는건 곱했을때 0이 안나오면 0 이 아니다 라는 식의 생각
			System.out.println("사용 가능한 비밀번호");
		}else { 
			System.out.println("사용불가능한 비밀번호");
		}
	
		String os1 = "iOS";
		String os2 = "ioS";
		String os3 = "Windows";
		//위 3개의 문자열이 ios인지 확인
		System.out.println(os1.toUpperCase().equals("IOS"));
		System.out.println(os2.toUpperCase().equals("IOS"));
		System.out.println(os3.toUpperCase().equals("IOS"));
	}
	


}

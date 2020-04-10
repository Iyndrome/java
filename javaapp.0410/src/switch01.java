
public class switch01 {

	public static void main(String[] args) {
		final String KOREA = "a"; final String CHINA = "b"; final String JAPAN = "c";
        //프로그램을 읽기 좋게 하기위해서 상수 선언
		//결과값에 숫자가 아닌 문자를 넣으면 오류가 발생함, 그러므로 문자로 바꿔주는것이 오류를 줄여줄 수 있다.
		//프로그램 읽기 좋게 final int의 int를 String으로 바꿔주고 아래 조건식도 바꿔주면 된다.
		//상수는 (위에서 KOREA, CHINA, JAPAN 같은) 가급적 대문자로 써주는게 좋습니다.
		//a, b, c는 문자이기 때문에 a가 아닌  "a"로 입력해줘야 한다.
		java.util.Scanner sc =
				new java.util.Scanner(System.in);
		

		//메뉴 입력 받기
		System.out.print(
				"메뉴입력(a.한식  b.중식  c.일식):");
		String menu = sc.nextLine();
		//switch를 이용한 처리
		switch(menu) {
			case KOREA : System.out.println("한식"); break;
			case CHINA : System.out.println("중식"); break;
			case JAPAN : System.out.println("일식"); break;
			default: System.out.println("잘못된 메뉴"); break;
		}
		//스캐너 닫기
		sc.close();
		
		
		

	}

}

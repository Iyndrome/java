import java.math.BigDecimal;
import java.util.Scanner;

public class WrapperMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		try {
		System.out.println("정수 입력:");
		String input = sc.nextLine();
		//문자열을 정수로 변환
		int num = Integer.parseInt(input);
		//int num = sc.nextInt(); 로 입력 후 출력하면 문자로 입력시 무한반복하여 정수를 입력하라는 값이 더는 안나오기 때문에
		//위에 String input = sc.nextLine();을 넣어주고 본 구문 =뒤에 Integer.parseInt(input);으로 바꿔줍니다.
		
		System.out.println("num:" + num);
		break;
		}catch(Exception e) {
			System.out.println("숫자로 입력하세요!");
		}
		}
		sc.close();
		//위와 같이 할 경우 숫자가 아닌 문자를 입력시 에러가 발생합니다.
		//첫문장 밑에 try와 아래 catch로 에러가 생길만한 구간에 예외처리구문을 해주면 문제가 해결된다.
		
		
		//숫자로 된 문자열을 생성자에 대입해서 Bigdecimal
		//인스턴스 2개 만들기
		
		BigDecimal b1 = new BigDecimal("10");
		BigDecimal b2 = new BigDecimal("20");
		//더하기
		BigDecimal result = b1.add(b2);
		//정수로 저장하기
		int n = result.intValue();
		System.out.println("n:"+ n);
		
		
		

	}

}

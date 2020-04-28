import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
		//Random 인스턴스 만들기 - seed를 동적으로 설정
		Random r = new Random();
		System.out.println(r.nextInt());
		System.out.println(r.nextInt());
		//seed를 1로 설정
		Random r1 = new Random(1);
		System.out.println(r1.nextInt());
		System.out.println(r1.nextInt());
		//0~44 사이의 숫자를 랜덤하게 리턴
		System.out.println(r1.nextInt(45));
		System.out.println(r1.nextInt(45));
		//주사위 게임하기
		System.out.println(r1.nextInt(6)+1);
		

		
		
	
	}
		
		
	}



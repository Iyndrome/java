import java.util.Scanner;

public class cb02practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int idx = 0; idx < 6; idx = idx + 1) {
			//idx < 6 이기 때문에 5번까지 검색 입력을 할 수 있다. 
			System.out.println("1~45 숫자 입력:");
			int su = sc.nextInt();
			//1보다 작거나 45보다 큰 경우
			if(su < 1 || su > 45) {
				System.out.println("1~45 사이의 숫자를 입력하세요!!");
				idx = idx - 1;
				//idx = idx - 1; => 위의 식에 idx + 1 과 연관되어 결과값에 변화가 없기 때문에 틀린 값을 검색 해도 검색값에 변화가 없어  
				//틀린 숫자를 제외한 1~45 입력한 범위 내에 값만 5회 검색으로 바꿀 수 있다
				continue;		
			}		
			System.out.println(idx + "번째" + su);
		}
		System.out.println("종료");
		
		
		
	}

}


public class cb01 {

	public static void main(String[] args) {
		for(int i = 1; i<10; i=i+1) {
			if(i % 3 == 0) {
				//break;일때 3의배수를 만나면 반복문이 종료
				//continue;일때 3의 배수가 되면 아래로 내려가지 않고 다음 반복을 수행 
				continue;
			}
			System.out.println(i);
		}

	}

}

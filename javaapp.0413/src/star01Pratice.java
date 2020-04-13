
public class star01Pratice {

	public static void main(String[] args) {
		for(int i = 0; i<=4; i=i+1) {
			for (int j = 0; j<=8-2*i; j=j+1) {
			           System.out.print("*");
			  }
			           System.out.print("\n");
			           //print으로 안쓰고 println으로 쓰면 줄바꿈
			           //수가 줄어드는것은 -을 넣어주는것이 아니라 음수를 만드는것
			           //위와 같은 -2*i+8

			  }
	
	}
	
}


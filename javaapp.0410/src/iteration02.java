
public class iteration02 {

	public static void main(String[] args) {
		// image1.png, image2.png, image3.png를 번갈아가면서 3번씩 출력
		//출발점은 0으로 한다 하면
		//int idx = 0;
		//while(idx < 9) { 
			//System.out.println(
					//"image" + idx + ".png");		
			//idx = idx + 1;
			
			
			int idx = 0;
			while(idx < 9) { 
				System.out.println(
						"image" + (idx % 3 + 1 )+ ".png");
				// idx % 3 + 1에서 1을 더해준건 image 값이 0으로 시작하기 때문에 1로 시작하게 만들어주기 위함
				// ( )를 넣어주면 괄호 식을 먼저 계산해준다는 의미
				idx = idx + 1;
		}
		

	}

}

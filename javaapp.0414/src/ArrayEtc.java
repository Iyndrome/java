
public class ArrayEtc {

	public static void main(String[] args) {
		int [] ar = new int[20];
		//1부터 20까지 숫자로 배열의 값을 대입
		for(int i = 0; i<20; i=i+1) {
			ar[i] = i+1;
		}
		//데이터 출력
		//System.out.println(ar[i]); 하면 아래로 기본적으로 나오는 형식이고
		//한 줄에 5개 씩 출력은 아래와 같이
		for(int i = 0; i<20; i=i+1) {
			//println에서 ln을 지우지 않으면 변화가 없으니 ln 지우는거 잊지 말기! println => print
			System.out.printf("%3d\t", ar[i]);
			//System.out.print(ar[i] + \"\\t\");
			//5개 출력할 때 마다 줄 바꿈해줘야 함
			if(i % 5 == 4) {
				System.out.print("\n");
			}
		}
	}
}
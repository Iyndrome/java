
public class Star {

	public static void main(String[] args) {
		for(int i = 0; i<5; i=i+1) {
			for (int j = 0; j<5; j=j+1) {
			           System.out.print("*");
			  }
			           System.out.print("\n");

			  }
	
	}
	
}

          //아래 내용들을 /*로 가려놔서 결과누를시 오류가 생기니 지우면 정상 작동하니 오해하지말길
	      /*for(int i = 0; i<5; i=i+1) {
		  for (int j = 0; j<=i; j=j+1) {
		           System.out.print("*");
		  }
		           System.out.print("\n");

              //두번째 줄에 j<5; => j<=i;로 바꾸면 결과가 별이 하나씩 늘어나는 모양으로 변한다.

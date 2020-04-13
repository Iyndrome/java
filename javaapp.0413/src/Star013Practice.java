
public class Star013Practice {

	public static void main(String[] args) {
		for(int i = 0; i<=4; i=i+1) {
			for (int j = 0; j<3-i; j=j+1) {
			System.out.print(" ");
		        //공백 출력
					  }
		 for(int j=0; j<=i; j=j+1){
			System.out.print("*");
		        //별 출력
		  }
		    System.out.print("\n");
		  }
	}
}




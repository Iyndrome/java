
public class Star011Practice {

	public static void main(String[] args) {
		for (int i = 0; i <= 4; i = i + 1) {

			for (int j = 0; j <= i; j = j + 1) {
				//for (int j = 0; j <= -1*i+4; j = j + 1) {                
				
				System.out.print("*");
			}
			//중괄호가 제대로 안되어있으면 줄바꿈이 안되거나 오류가 날수있으니 중괄호는 항상 잘 배치할것

			System.out.print("\n");
		}

	}
}
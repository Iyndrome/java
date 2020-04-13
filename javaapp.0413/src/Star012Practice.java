
public class Star012Practice {

	public static void main(String[] args) {
		for (int i = 0; i <= 4; i = i + 1) {

			if (i <= 2) {
				for (int j = 0; j <= i; j = j + 1)
					// 위에 까지 구조가 3번째 줄까지 적용되는 식					
					System.out.print("*");
			} else {
				for (int j = 0; j <= 4 - i; j = j + 1) {
					System.out.print("*");
					// 여기 식이 나머지 4,5번째 줄에 등장할 식 

				}
			}
			System.out.print("\n");
		}
		// 중괄호가 제대로 안되어있으면 줄바꿈이 안되거나 오류가 날수있으니 중괄호는 항상 잘 배치할것

	}
}
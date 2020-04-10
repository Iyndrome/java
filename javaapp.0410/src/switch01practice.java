
public class switch01practice {

	public static void main(String[] args) {
		final int NIKE = 1; final int ADIDAS = 2; final int JORDAN = 3;
		java.util.Scanner sc =
				new java.util.Scanner(System.in);
		System.out.print("브랜드 입력(1.나이키 2.아디다스 3.조던):");
		int menu = sc.nextInt();
		
		switch(menu) {
			case NIKE : System.out.println("나이키"); break;
			case ADIDAS : System.out.println("아디다스"); break;
			case JORDAN : System.out.println("조던"); break;
			default: System.out.println("잘못된 상표"); break;
		}
		sc.close();

	}

}

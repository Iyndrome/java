
public class switch01practice {

	public static void main(String[] args) {
		final int NIKE = 1; final int ADIDAS = 2; final int JORDAN = 3;
		java.util.Scanner sc =
				new java.util.Scanner(System.in);
		System.out.print("�귣�� �Է�(1.����Ű 2.�Ƶ�ٽ� 3.����):");
		int menu = sc.nextInt();
		
		switch(menu) {
			case NIKE : System.out.println("����Ű"); break;
			case ADIDAS : System.out.println("�Ƶ�ٽ�"); break;
			case JORDAN : System.out.println("����"); break;
			default: System.out.println("�߸��� ��ǥ"); break;
		}
		sc.close();

	}

}

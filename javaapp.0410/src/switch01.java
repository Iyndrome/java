
public class switch01 {

	public static void main(String[] args) {
		final String KOREA = "a"; final String CHINA = "b"; final String JAPAN = "c";
        //���α׷��� �б� ���� �ϱ����ؼ� ��� ����
		//������� ���ڰ� �ƴ� ���ڸ� ������ ������ �߻���, �׷��Ƿ� ���ڷ� �ٲ��ִ°��� ������ �ٿ��� �� �ִ�.
		//���α׷� �б� ���� final int�� int�� String���� �ٲ��ְ� �Ʒ� ���ǽĵ� �ٲ��ָ� �ȴ�.
		//����� (������ KOREA, CHINA, JAPAN ����) ������ �빮�ڷ� ���ִ°� �����ϴ�.
		//a, b, c�� �����̱� ������ a�� �ƴ�  "a"�� �Է������ �Ѵ�.
		java.util.Scanner sc =
				new java.util.Scanner(System.in);
		

		//�޴� �Է� �ޱ�
		System.out.print(
				"�޴��Է�(a.�ѽ�  b.�߽�  c.�Ͻ�):");
		String menu = sc.nextLine();
		//switch�� �̿��� ó��
		switch(menu) {
			case KOREA : System.out.println("�ѽ�"); break;
			case CHINA : System.out.println("�߽�"); break;
			case JAPAN : System.out.println("�Ͻ�"); break;
			default: System.out.println("�߸��� �޴�"); break;
		}
		//��ĳ�� �ݱ�
		sc.close();
		
		
		

	}

}

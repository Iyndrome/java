
public class iteration02 {

	public static void main(String[] args) {
		// image1.png, image2.png, image3.png�� �����ư��鼭 3���� ���
		//������� 0���� �Ѵ� �ϸ�
		//int idx = 0;
		//while(idx < 9) { 
			//System.out.println(
					//"image" + idx + ".png");		
			//idx = idx + 1;
			
			
			int idx = 0;
			while(idx < 9) { 
				System.out.println(
						"image" + (idx % 3 + 1 )+ ".png");
				// idx % 3 + 1���� 1�� �����ذ� image ���� 0���� �����ϱ� ������ 1�� �����ϰ� ������ֱ� ����
				// ( )�� �־��ָ� ��ȣ ���� ���� ������شٴ� �ǹ�
				idx = idx + 1;
		}
		

	}

}


public class op2 {

	public static void main(String[] args) {
		int idx = 0;
		while(true) {
			//mod�� idx�� 2�� ���� ������
			int mod = idx % 5;
			if(mod==0)
				System.out.println("ġŲ");
			else if(mod==1)
				System.out.println("����");
			else if(mod==1)
				System.out.println("¥��");
			else if(mod==1)
				System.out.println("������");
			
			try {
				//2�ʴ��
				Thread.sleep(2000);
			}catch(Exception e) {}
			
			idx++;
		}

	}

}

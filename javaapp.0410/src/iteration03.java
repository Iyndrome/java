
public class iteration03 {
	
	public static void main(String[] args) {
		int [] ar = {30, 40, 20, 17, 76, 65};
		//30 -> ar[0], 40 -> ar[1], 20-> ar[2], 17 -> ar[3], 76 -> ar[4], 65 -> ar[5]
		int idx = 0;
		int sum = 0;
		do {
			sum = sum + ar[idx];
			idx = idx + 1;
			//�����Ͱ� 6�� �̱� ������ �߰�ȣ���� �ϸ� �����̱� ������ �ٱ����� �ϴ°� ����.			
		} while (idx < 6);
		System.out.println("�հ�:" + sum);
		//��� ���ϱ� 
		double avg = sum / 6.0;
		//double avg = sum / 6.0;
		
		//sum�� 6���� �������� 41(����-����)�� �������µ� 6.0(����-�Ǽ�)���� ������ �Ҽ��� ���� ���� �Ǽ��� ������ְ� �ȴ�.
		//�Ҽ��� ���ϰ������ ���� �ϳ��� �Ǽ����� �Ѵ�
		System.out.println("���:"+avg);
		avg = avg *10 + 0.5;
		//������ ��ȯ�ؼ� �Ҽ��� ����
		avg = (int)avg;
		//�ݴ� �۾� ����
		//�Ҽ��� ���� ������ ���� ���� �� ������
		avg = avg / 10;
		System.out.println("���:" + avg);
		}

	}



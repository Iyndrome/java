
public class iteration03practice {

	public static void main(String[] args) {
		int [] ar = {700, 600, 500, 430} ;
		//�����Ͱ� 4���ϱ� �ݺ����� ����ؾ��Ѵ�. 700-> ar[0] ������. 
		//�ݺ����� ����� �ε��� ����
		int idx = 0;
		//�ݺ����� ����� sum
		int sum = 0;
		//�ݺ��� ����� : 0 - 3 ���� ���� 
		do {
			sum = sum + ar [idx];
			//�����Ͱ� ar�� �ֱ� ������ sum + ar[idx]�� �Ѵ�
			//ar�� �����Ͱ� ������� sum�� �߰�
			idx = idx + 1;
		} while (idx < 4);
		System.out.println("�հ�:" + sum);
		
		// ��� ���ϱ� = �հ� ������ ���
		double avg = sum /4;
		//int avg = sum / 4;
		System.out.println("���:"+avg);
		// ������� �ϸ� �հ� 557 ������ ���� �� �� �ִ�
		
		//10�� �ڸ� �ݿø�
		//1)�ݿø��� ��ġ�� �Ҽ� ù�� �ڸ��� �̵�
		//double avg �� ������ 100�� �ص� �ǰ�, int�� ���� ��� 100.0���� ���ش�		
		//Double imis = avg / 100.0;
		//0.5�� ���ؼ� �Ҽ��� ����
		//6.0
		avg = avg / 100 + 0.5;
		//imsi = (int)(imsi + 0.5);
		
		avg = (int)avg;
	
		//avg= (int)imsi * 100;		
		avg = avg * 100; 
		System.out.println("���:" + avg);
		
		
		}

	}

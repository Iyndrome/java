
public class Practice {

	public static void main(String[] args) {
		double d1 = 10.476;
		//���� ���ڸ� �Ҽ� ù�� �ڸ����� �ݿø��ؼ� ����
		System.out.println("result:" + result);

		//<�Խ��� ��������>
		int result = (int)(d1+0.5);
		//�Ҽ� ù°�ڸ� �ø�
		//������ �� ������ ����-1 / ������ �� ������ ����
		//���� (�Ʒ�)
		//int count = 110	
		//result = (int)(count/10 + 10.0 + 9.0/10);
		//System.out.println("result:" + result);
		
		//���� (������ �̿��� �����ϰ� �������� ��ġ�� �ʾƵ� pageCnt ���� ��ġ�� �ȴ�. 
		//�ݿø��Ϸ��� �ڸ��� �Ҽ� ù°�ڸ��� �ű�°� �߿�->
		//�ű���� ex) 10�� �� ���ؼ� ���� ���ְ� ���ϴ°��� �����ڴ� �ٽ� 10�� �����ش�.
		int count = 110;
		double pageCnt = 20.0;
		result = (int)(count/pageCnt +(pageCnt-1)/pageCnt);
		System.out.println("result:" + result);
		
		//short�� -32768 ~ 32767���� ���尡��
		//overflow �߻� - -32768
		short s1 = (short)32768;
		System.out.println("s1:" + s1);
		

		
	}

}

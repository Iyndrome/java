
public class op5 {

	public static void main(String[] args) {
		// &&:and �Ӥ� :or ||:or
		int score = 78;
		//���� ������ 60���� 100�������� Ȯ��
		System.out.println(score >= 60 && score <= 100);
		//score�� 0���� �۰ų� 100���� ū �� Ȯ��
		//~�ϰų��� ||�� ������
		System.out.println(score < 0 || score > 100);
		//&&�� ���� ����� false�̸� ���� ���Ȯ�� ����
		//||�� ���� ����� true�̸� ���� ���Ȯ�� ����

		int idx = 0;
		boolean result = 10 > 5 && (idx++) > 0;
		//false -> false idx -> 1 
		//++�� �ڿ� �ձ⶧���� ���� ����Ŀ��� ��ȭ�� ���� ���� 0�̱⿡ 0>0�� false�� �ȴ�. 
		System.out.println("result:" + result);
		System.out.println("idx:" + idx);
		//�Ŀ� 1�� �������⋚���� idx���� 1�� �ȴ�.

		idx = 0;
		result = 10 > 5 || (idx++) > 0;
		//result -> true, idx -> 0
		System.out.println("result:" + result);
		System.out.println("idx:" + idx);
		
		//���� üũ 
		int year = 2020;
		//year�� �������� �Ǻ�
		if(year%100!=0 || year%400==0){
			System.out.println(year + "����");
		}else 
			System.out.println(year + "�� ������ �ƴ�");
			// �̹� Ŭ���� ������ �ʱ⸦ ����� ���� ����� ��Ŭ���� ���� �����ؼ� ����� �ϸ� �����Ұ�!

	}

}

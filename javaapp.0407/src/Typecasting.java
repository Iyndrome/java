
public class Typecasting {

	public static void main(String[] args) {
		//byte ���� 2�� ����
        byte b1 = 10;
        byte b2 = 13;
        
        //�� ������ ������ �� 
        //int���� ���� �����ʹ� int�� ��ȯ�ؼ� ����
        //b1�� b2�� int�� ��ȯ�ؼ� �����߱� ������ ����� int�� �˴ϴ�.
        //int�� byte�� ���� ���մϴ�.
        //byte result = b1 + b2;
       
		int result = b1 + b2;
		//int / int -> int
        result = 10 / 3;
        System.out.println("result:" + result);
		//double / int �� int�� double�� �����ؼ� ���� -> ����� 3.33333...
        //�̿� ���� ������� �ڵ� �� ��ȯ �̶�� �Ѵ�.
        System.out.println("result:" + (10.0/3));
        
        //<���� �� ��ȯ>
        //int x = 20.4; -> ������ double�̱� ������ �ȵ�
        //20.7�� ������ ������ ��ȯ�ؼ� x�� ����->�Ҽ��� �������Ƿ� 20�� ����
        //Ȯ���غ��� System.out.println("x:" + x); �̷� ������ �Է��Ͽ� Ȯ�ΰ���
        int x = (int)20.7;
        System.out.println("x:" + x);
        
        byte b5 = 10;
        byte b6 = 13;
        //������ ����� byte�� ���� ->���� �� ��ȯ�� �̿��ؼ� �ذ�
        //byte b7 = b5 + b6; �� ���� 
        //�Ʒ��� ���� ������� �ڷᰪ�� ���� �����ؼ� ����ؼ� ���� �� ��ȯ�� �ϼ��Ѵ�
        byte b7 = (byte)(b5 + b6);
                      
        
        double d = 10 / 3;
        System.out.println("d:" + d);
        //������� ������ ���¿��� double�� �����߱� ������ ������ ����
        //�������� ��������� �������� �׻� ������ ����
        
        double d = (double)10 / 3;
        System.out.println("d:" + d);
        //������ �Ǽ����� ��������� �߱⶧���� ���� �Ǽ��� 3.0�� ���´� 
        
        
        
	}

}

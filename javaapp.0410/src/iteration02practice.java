
public class iteration02practice {
	
	public static void main(String[] args) {
		int idx = 0;
		while(idx < 12){
			System.out.println("image" + (idx % 3 * 2 + 1) + ".png");
			//%3�� 1,2,3 �̴ϱ� 3,2,1 ������ �ٲٰ� ������ 4�� ���� �ȴ�. (4-(idx % 3 + 1)) �� �ϸ� �ȴ�.
			idx = idx + 1;
	}
	

}

}


public class operator {

	public static void main(String[] args) {
		//int a= 0;
		//int result = ++a + ++a;
		//System.out.println("result:" + result);
		//결과는 3
		//a의 값을 먼저 증가시켜서 1 + 
		//하나를 증가시켜서 1 + 2
		
		//다르게 풀이해보면
		int a= 0;
		int temp1 = ++a;
		int temp2 = a++;
		int result = temp1 + temp2;
		System.out.println("result:" + result);
		

	}

}

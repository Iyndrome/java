
public class MethodClass {
    //call By value 메소드
	//매개변수가 기본형인 메소드
	//static이 붙어있으면 instance를 만들 필요가 없다.
	public static void callByvalue(int value) {
		System.out.println(
		"메소드 내의 value 초기값:" + value );
		value = value + 1;
		System.out.println(
		"메소드 내의 value 변화:" + value );
	}
	public static void callByReference(int []ar) {
		System.out.println("ar[0]:" + ar[0]);
        ar[0] += 1;
        System.out.println("ar[0]:" + ar[0]);

	
	}
	//1부터 n까지의 합계를 구해서 리턴해주는 메소드
	//정수 1개를 매개변수로 받고 정수를 리턴
	public int sum1(int n)  {
		//재귀를 이용하지 않고 구현
		int tot = 0;
		for(int i = 1; i<=n; i=i+1) {
			tot = tot + i;
		}
		return tot;
		
}   
	//재귀를 이용한 1-n까지(1부터n까지) 합계
	public int sum2(int n) {
		//종료 시점을 생성
		//1까지의 합계는 1
		if(n == 1) {
			return 1;
		}
		return n + sum2(n-1);
	}
	
}
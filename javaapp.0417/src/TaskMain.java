
public class TaskMain {

	public static void main(String[] args) {
		//TaskClass 클래스에 존재하는 static in noRecuresionFibo(int n) 사용
		int result = TaskClass.noRecuresionFibo(9);
		System.out.println("9번쨰 숫자:" + result);
		
		result = TaskClass.noRecuresionFibo(10);
		System.out.println("10번쨰 숫자:" + result);
		
		TaskClass obj = new TaskClass();
		result = obj.recursiveFibo(9);
		System.out.println("9번쨰 숫자:" + result);
		result = obj.recursiveFibo(100);
		System.out.println("10번쨰 숫자:" + result);

	}

}

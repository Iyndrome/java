
public class testfor01 {

	public static void main(String[] args) {
		// 1부터 10까지 반복문을 이용해서 출력
		//1~5까지 반복
		//0, 2, 4, 6, 8을 출력
		for(int idx = 1; idx < 11; idx = idx + 1) {
			//idx + 2를 idx -2로 바꾸면 idx < 10의 부등호를 반대로 바꿔줘야 의도한 값이 나온다. ( idx < 10  --->  idx > 10; ) 
			System.out.println(idx);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			}
		}

	}
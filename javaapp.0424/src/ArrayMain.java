
public class ArrayMain {

	public static void main(String[] args) {
		String [] data = 
			{"3000","4000", "asd", "4500"};
			
		//위의 4개를 정수로 변환해서 합계를 구하기
		//합계를 저장할 변수
		int sum = 0;
		for(String temp : data) {		
			try { 
			//문자열을 정수로 변환해서 sum에 더하기
			sum = sum + Integer.parseInt(temp);
			//중괄호 안에서 출력하면 더하는 과정값이 같이 나오고, 중괄호 바깥에서 하면 최종 더한값만 보인다.
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		//출력할 메시지를 만들어서 출력
		String msg = String.format("합계:%d", sum);
		System.out.println(msg);

	}

}

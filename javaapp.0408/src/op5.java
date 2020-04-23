
public class op5 {

	public static void main(String[] args) {
		// &&:and ㅣㅣ :or ||:or
		int score = 78;
		//위의 점수가 60에서 100사이인지 확인
		System.out.println(score >= 60 && score <= 100);
		//score가 0보다 작거나 100보다 큰 지 확인
		//~하거나는 ||을 써주자
		System.out.println(score < 0 || score > 100);
		//&&는 앞의 결과가 false이면 뒤의 결과확인 안함
		//||는 앞의 결과가 true이면 뒤의 결과확인 안함

		int idx = 0;
		boolean result = 10 > 5 && (idx++) > 0;
		//false -> false idx -> 1 
		//++이 뒤에 잇기때문에 위에 연산식에선 변화가 없어 값이 0이기에 0>0은 false가 된다. 
		System.out.println("result:" + result);
		System.out.println("idx:" + idx);
		//후에 1이 더해지기떄문에 idx값은 1이 된다.

		idx = 0;
		result = 10 > 5 || (idx++) > 0;
		//result -> true, idx -> 0
		System.out.println("result:" + result);
		System.out.println("idx:" + idx);
		
		//윤년 체크 
		int year = 2020;
		//year가 윤년인지 판별
		if(year%100!=0 || year%400==0){
			System.out.println(year + "윤년");
		}else 
			System.out.println(year + "는 윤년이 아님");
			// 이번 클래스 내용은 필기를 제대로 못해 강사님 이클립스 내용 참고해서 재수정 하며 복습할것!

	}

}

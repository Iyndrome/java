import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		// 문자열을 저장할 ArrayList를 생성
		ArrayList<String> list = new ArrayList<>();
		//데이터 추가
		list.add("사나");
		list.add("유인나");
		list.add("인수정");
		list.add("아이린");
		list.add("신세경");
		list.add(2, "황우슬혜"); //2번째 데이터 추가
		
		//사나라는 데이터를 삭제
		list.remove("사나");
		//위치를 가지고 삭제
		list.remove(1);
		//데이터 전체를 확인 - toString을 이용해서 확인 
		System.out.println(list);
		
		//데이터 전체를 순회(순서대로 하나씩 접근)
		
		//빠른 열거를 이용 - 전체 데이터를 순서대로 접근할 때는 간결 
		for(String temp : list) {
			System.out.println(temp + "\t");
		}
		System.out.printf("\n");
		//인덱스를 이용한 접근 - 짝수번째나 홀수번째 같은 특정 데이터를 골라내서 접근 가능 
		int size = list.size();
		for(int i = 0; i<size; i=i+1) {
			System.out.printf(list.get(i) + "\t");
		}
		System.out.printf("\n");

	}

}

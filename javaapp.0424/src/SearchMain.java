import java.util.Arrays;

public class SearchMain {

	public static void main(String[] args) {
		String [] singers = {"크러쉬", "딘", "환희", "검정치마", "혁오", "인수정", "이유진"};
		//데이터 정렬
		Arrays.sort(singers);		
		//인수정이 있는지 검색
		System.out.println(Arrays.binarySearch(singers, "인수정"));
		System.out.println(Arrays.binarySearch(singers, "이유진"));
		
		String [] alphabets = { "Insujeong", "Leeyoojin","Dean"};
		String [] imsi = new String[alphabets.length];
		//데이터 복사
		for(int i=0; i<imsi.length; i=i+1) {
			//원본의 데이터를 대문자로 변경해서 복사본 배열에 저장
			imsi[i] = alphabets[i].toUpperCase();
		}
		//복사본 배열을 정렬해서 출력
		Arrays.sort(imsi);
		for(String singer : imsi) {
			System.out.println(singer);
		}
		
		

	}

}

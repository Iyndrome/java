import java.util.Arrays;

//index 사이트에서 검색해보면 Comparable이 있는지 확인가능하다. 
//Comparable : 크기 비교가 가능한 메소드를 소유한 인터페이스
public class ArraySorting {

	public static void main(String[] args) {
		//정수 배열
		//정수는 java.lang.Integer 클래스로 표현 가능
		int [] ar = {30, 60, 90, 20};
		
		//Arrays 의 sort 메소드가 정렬을 해줌
		//배열만 대입하는 경우에는 데이터가 Comparable
		//인터페이스를 implements 한 경우만 가능
		Arrays.sort(ar);
		//결과 확인
		for(int temp : ar) {
			System.out.println(temp + "\t");
		}
		System.out.println("\n");
		
		String [] br = {"태진아", "설운도", "송대관", "빈지노", "조관우", "하후돈", "동장군"};
		Arrays.sort(br);
		for(String temp : br) {
			System.out.printf(temp, "\t");
		}
		System.out.printf("\n");
		
		

	}

}

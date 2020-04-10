
public class iteration01 {

	public static void main(String[] args) {
		System.out.println("java");
		System.out.println("java");
		System.out.println("java");
		System.out.println("===========");
		
		//출발점
		//출발점을 0,1,2로 한경우 아래와 같이 한다. (1,2,3 이나 7,8,9 등 출발점 3개로 잡았기에 원하는 숫자 구성은 아무거나 정하면 된다. 원리 이해!) 
		int idx = 0;
		//while(종료점) {
		while(idx < 3); {
			//while(idx <= 2); 이렇게 적는것보다 while(idx < 3); 으로 적는걸 프로그래머들은 좋아한다.
			System.out.println("java");
			//중간에 수행할 내용
			idx = idx + 1;
		}
		System.out.println(idx);

	}

}

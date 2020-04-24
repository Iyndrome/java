import java.util.Arrays;
import java.util.Comparator;

public class UserDataMain {

	public static void main(String[] args) {
		//UserData 3개를 저장
		UserData [] ar = new UserData[3];
		
		UserData user1 = new UserData();
		user1.setName("토레스");
		user1.setAge(34);
		user1.setSalary(199408040);
		ar[0] = user1;
		
		ar[1] = new UserData();
		ar[1].setName("그리즈만");
		ar[1].setAge(31);
		ar[1].setSalary(29295959);

		ar[2] = new UserData();
		ar[2].setName("손흥민");
		ar[2].setAge(29);
		ar[2].setSalary(7777777);
		
		//정렬
		//Arrays.sort(ar); 로 하면 에러가 뜨는 이유
		//ar은 UserData의 배열이고 UserData는 Comparable 인터페이스가 implements 되지 않아서
		//크기 비교하는 방법을 알지 못하기 때문입니다.
		
		Comparator<UserData> comp1 = new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				UserData o3 = (UserData)o1;
				UserData o4 = (UserData)o2;
				return o4.getName().compareTo(o3.getName());
			}
			
		};
		
		
		
		
		//배열의 데이터 전부 출력
		for(UserData temp : ar) {
			System.out.println(temp);
		}
		
		
		
		

	}

}

import java.util.ArrayList;
import java.util.Comparator;

//공부할때 보기좋게 하려구 일부러 자체적으로 같은내용을 필요 부분만 수정해서 보려고 만든것(선생님이 한건 아님 나 스스로)
//연습용으로 만든 클래스임. 오해 금물 
public class UserDefineClassListSortMain2 {

	public static void main(String[] args) {
		//Data 여러 개 저장하는 ArrayList를 생성
		ArrayList<Data> list = new ArrayList<>();
		//데이터 추가
		list.add(new Data(1, "인수정", "010", "파주", "is","940804"));
		list.add(new Data(2, "이유진", "010", "포항", "ly","920813"));
		list.add(new Data(3, "브래드피트", "010", "창원", "br","960104"));
		list.add(new Data(4, "안젤리나졸리", "010", "마산", "an","981105"));
		//아래 모양만드는 법은 Comparator 쪽에 에러가 떳을때 임포트를 눌러주고 다시 한번 밑줄 그인곳을 눌러
		//add~~~을 눌러 아래와 같은 양식을 만들어주자
		list.sort(new Comparator<Data>() {

			@Override
			//Phone의 오름차순으로 정렬
			//Phone이 같으면 이름의 오름차순 정렬
			public int compare(Data o1, Data o2) {
				if(o1.getBirthday().compareTo(o2.getBirthday()) == 0) {
				return o1.getAddress().compareTo(o2.getAddress());
			}else {
				return o1.getBirthday().compareTo(o2.getBirthday());
			}
			}
				
				
			
		
		
		//데이터 출력
		for(Data data : list) {
			System.out.println(data);
		}
			}
		}
			
		

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

public class StoreMain {

	public static void main(String[] args) {
		//테이블 형태의 데이터 생성
		ArrayList<Store> list = new ArrayList<>();
		list.add(new Store("1", "화선", 4.4, 10000, "짬뽕"));
		list.add(new Store("2", "할매순대", 4.8, 7000, "순대국"));
		list.add(new Store("3", "이대앞", 4.1, 8000, "갈비탕"));
		
		//데이터 출력하기
		System.out.println("코드\t이름\t평점\t최소주문금액\t메뉴");
		for(Store store : list) {
			System.out.println(
					store.getCode()+"\t"+ 
					store.getName()+"\t"+ 
					store.getAverage()+"\t"+
					store.getMinOrederMoney()+ "\t" +
					store.getMenu());
		}
		
		ArrayList<LinkedHashMap<String,Object>>
		stores = new ArrayList<>();
		
		LinkedHashMap<String, Object> store1 = new LinkedHashMap<>();
		store1.put("code", "1");
		store1.put("name", "화선");
		store1.put("average", "4.4");
		store1.put("minordermoney", "10000");
		store1.put("menu", "짬뽕");
		stores.add(store1);
		
		//데이터클래스안의 코드를 바꾸면 출력하는 클래스에 있는 코드도 바꿔야하니 MVC가 아니다.
		//아래의 식이 MVC이다
		for(LinkedHashMap<String, Object> map : stores) {
			Set<String>keys = map.keySet();
			for(String key : keys) {
				System.out.println(map.get(key) + "\t");
			}
		}

	}

}

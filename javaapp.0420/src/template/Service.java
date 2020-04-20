package template;

public interface Service {
	//티켓팅 하는 메소드
	//모양이 2개이면 boolean, 3개이면 int 2개일떄 int해도 상관없음
	//public 리턴타입 ticketing(String id, String pw);
	public boolean ticketing(String id, String pw);

}

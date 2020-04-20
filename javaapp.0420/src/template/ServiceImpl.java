package template;

public class ServiceImpl implements Service {

	//문자열은 비교할때 equlas 사용
	@Override
	public boolean ticketing(String id, String pw) {
		if("root".equals(id) && "1234".equals(pw)) {
			return true;
		}else {
			return false;
		}		

	}

}

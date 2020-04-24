import java.io.UnsupportedEncodingException;

public class StringEncoding {

	public static void main(String[] args) {
		//한글을 저장한 문자열 인스턴스
		String hangeul = "한글 문자열";
		
		//바이트 배열로 변환 
		try {
			//아래 hangeul.getBytes("UTF-8");가 오류가 나므로 Surround with try/catch을 눌러주면 이와 같은 식이 생긴다.
			//바이트 배열로 변환
			byte [] bytes = hangeul.getBytes("UTF-8");
			//바이트 배열을 문자열로 변환
			String str = new String(bytes, "UTF-8");
			//UTF-8이 아닌 EUCKR 이나 MS949 등 다른 인코딩 코드로 하면 깨지게 된다.
			System.out.println(str);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

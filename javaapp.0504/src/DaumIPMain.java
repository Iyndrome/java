import java.net.InetAddress;
import java.net.UnknownHostException;

public class DaumIPMain {

	public static void main(String[] args) {
		try {
			//hostName에는 프로토콜이 포함되지 않습니다. http://
			InetAddress [] daum = InetAddress.getAllByName("www.daum.net");
		for(InetAddress imsi : daum) {
			System.out.println(imsi);
		}
			System.out.println(daum);
		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}

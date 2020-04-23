import java.io.IOException;

public class SystemMain {

	public static void main(String[] args) {
		//Hello Jave를 10만 번 출력하는데 걸리는 시간
		//Hello Java를 10만 번 출력
		//시간을 측정 - 테스트를 해주는 프로그램을 이용하기도 함
		
		//현재 시간을 가져오는 메소드를 호출해서 저장
		long start = System.nanoTime();		
		for(int i=0; i<100000; i=i+1) {
			System.out.println("Hello Java");
		}
		//현재 시간을 가져오는 메소드를 호출
		long end = System.nanoTime();
		System.out.println("걸린시간 :" + (end-start));
		//이렇게 했을때 나온 값은 나노초 단위
		
		String javaVersion = System.getProperty("java.version");
		//자바버전 확인
		System.out.println(javaVersion);
		
		//프로세스 실행과 관련된 클래스의 인스턴스 생성
		Runtime r = Runtime.getRuntime();
		//MAC일 경우 아래 식을  r.exec("open / System/Applications/Textdit.app");으로 쓴다.
		try {
			r.exec("notepad.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

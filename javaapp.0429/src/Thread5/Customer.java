package Thread5;

//이번 패키지는 선생님께서 코드 작성 간 잘 못 작성하셨다고 나중에 수정해주신다 하셨으니 
//★★★★수정을 하고 나면 0429 프로젝트를 다시 깃허브로 보내자!!★★★★
public class Customer extends Thread {
	//공유자원을 소비하는 메소드
	public synchronized void get() {
		if(ShareData.list.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//첫번째 데이터를 삭제
		String msg = ShareData.list.remove(0);
		System.out.println(msg + "소비");
	}
	
	//스레드로 동작할 메소드
	public void run() { 
		try {
			for(int i=0; i<10; i=i+1) { 
				Thread.sleep(1000);
				get();
				System.out.println("Data" + i + "소비");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}

package Thread2;

import java.util.Random;

public class ThreadMain {

	public static void main(String[] args) {
		//Thread 클래스를 상속받은 클래스를 이용해서 스레드 시작
		ThreadEx th1 = new ThreadEx();
		th1.start();
		
		//Anonymous를 이용한 스레드 생성과 시작
		Thread th2 = new Thread() { 
			//스레드로 동작할 메소드
			public void run() {
				//0.3초 마다 문자열을 10번 출력
				try { 
					for(int i =0; i<10; i=i+1) {
						Thread.sleep(300);
						System.out.println("푸시업");
					}
					System.out.println("푸시업 종료");					
				}catch(Exception e) {}
				
			}
		};
		th2.start();
		
		//Runnable 인터페이스를 구현한 클래스를 이용한 스레드 생성과 시작
		RunnableImpl runnable1 = new RunnableImpl();
		Thread th3 = new Thread(runnable1);
		th3.start();
		
		//new Thread(new RunnableImpl()).start();
		//위와 3줄과 같은 결과값이 나온다. 		
		//이름이 들어가는 자리에 내용이 들어가도 아무 상관없다.
		
		
		
		//Runnable 인터페이스를 이용한 스레드 생성과 시작
		//anonymous를 이용하고 변수를 생성하지 않고 작성
		new Thread(new Runnable() {
			@Override
			public void run() {
				//1초마다 demage를 랜덤하게 10번 출력
				int [] demage = {30, 20, 50, 30, 20};
				try {
					Random r = new Random();
					for(int i=0; i<10; i=i+1) {
						Thread.sleep(1000);
						int offence = demage[r.nextInt(demage.length)];
						if(offence == 50) {
							System.out.println("Critical");
						}
						System.out.println("데미지:" + offence);
					}     
				}catch(Exception e) {}
								
			} 
		});		

	
		

	}

}

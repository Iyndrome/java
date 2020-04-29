package Thread4;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadEx implements Runnable{
	public int result = 0;
	public int idx = 0;
	
	static ReentrantLock Lock = new ReentrantLock();
	//한번에 계산되어야하는것을 잘 생각하고 synchronized로 잘 처리해줘야 출력값이 정확하게 나온다. 
	//idx를 10000번 증가시키면서 result에 더하는 메소드
	public synchronized void sum() {
	//public synchronized void sum() {
		for(int i=0; i<10000; i=i+1) {
			Lock.lock();
		//synchronized(this) {
			idx = idx + 1;
			try {
			Thread.sleep(1);
			}catch(InterruptedException e) {}
			result = result + idx;
			Lock.unlock();
			//for에서 result까지 값은 매번 달라지는데 idx가 1더하기 1이아니라 2더하기1이나 2더하기 2등 스레드로 인해 순서대로 처리되는게 아니라 1초의 시간동안 넘어가기 때문에
		     //출력값이 매번 달라지는 일이 벌어진다 이때 synchronized을 이용해서 처리해주면 일정한 값을 출력할 수 있다. 
	}
}
	@Override
	public void run() {
		sum();
		
	}
	}



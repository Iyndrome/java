
public class testfor01practce {

	public static void main(String[] args) {
		/*
		//1부터 10까지 반복문을 이용해서 출력
		//1~5까지 반복
		//0, 2, 4, 6, 8을 출력 (0부터 시작이므로 idx값은 아래와 같이 0으로 해줘야 한다)
		for(int idx = 0; idx < 10; idx = idx + 2) {
			//idx + 2를 idx -2로 바꾸면 idx < 10의 부등호를 반대로 바꿔줘야 의도한 값이 나온다. ( idx < 10  --->  idx > 10; ) 
			System.out.println(idx);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			}
		}   
	}     
            
            //9,8,7...0 으로 해보자
		    
	for(int idx = 1; idx < 11; idx = idx + 1) {
			//idx + 2를 idx -2로 바꾸면 idx < 10의 부등호를 반대로 바꿔줘야 의도한 값이 나온다. ( idx < 10  --->  idx > 10; ) 
			System.out.println(10-idx);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			
		
		//0, 1 반복
		for(int idx = 1; idx < 10; idx = idx + 1) {
			//나머지를 구하면 값이 제한이 됩니다. 
		}
			int nmg = idx % 2;		
			System.out.println(nmg);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			
			
			
			
			//0,0,1,1 반복
			for(int idx = 0; idx < 10; idx = idx + 1) {
				int mok = idx / 2;
			}
				int nmg = mok % 2;		
				System.out.println(nmg);
					Thread.sleep(1000);
	}catch(Exception e) {}
	
}   
			
			 
}
}

			
			
			
			


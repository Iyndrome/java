
public class op2 {

	public static void main(String[] args) {
		int idx = 0;
		while(true) {
			//mod는 idx를 2로 나눈 나머지
			int mod = idx % 5;
			if(mod==0)
				System.out.println("치킨");
			else if(mod==1)
				System.out.println("피자");
			else if(mod==1)
				System.out.println("짜장");
			else if(mod==1)
				System.out.println("탕수육");
			
			try {
				//2초대기
				Thread.sleep(2000);
			}catch(Exception e) {}
			
			idx++;
		}

	}

}

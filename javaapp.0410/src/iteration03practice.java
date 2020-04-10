
public class iteration03practice {

	public static void main(String[] args) {
		int [] ar = {700, 600, 500, 430} ;
		//데이터가 4개니까 반복문을 사용해야한다. 700-> ar[0] 같은것. 
		//반복문에 사용할 인덱스 변수
		int idx = 0;
		//반복문에 사용할 sum
		int sum = 0;
		//반복문 만들기 : 0 - 3 까지 진행 
		do {
			sum = sum + ar [idx];
			//데이터가 ar에 있기 때문에 sum + ar[idx]를 한다
			//ar의 데이터가 순서대로 sum에 추가
			idx = idx + 1;
		} while (idx < 4);
		System.out.println("합계:" + sum);
		
		// 평균 구하기 = 합계 나누기 계수
		double avg = sum /4;
		//int avg = sum / 4;
		System.out.println("평균:"+avg);
		// 여기까지 하면 합계 557 까지의 답을 알 수 있다
		
		//10의 자리 반올림
		//1)반올림할 위치를 소수 첫쨰 자리로 이동
		//double avg 로 했으면 100로 해도 되고, int로 했을 경우 100.0으로 해준다		
		//Double imis = avg / 100.0;
		//0.5를 더해서 소수를 버림
		//6.0
		avg = avg / 100 + 0.5;
		//imsi = (int)(imsi + 0.5);
		
		avg = (int)avg;
	
		//avg= (int)imsi * 100;		
		avg = avg * 100; 
		System.out.println("평균:" + avg);
		
		
		}

	}

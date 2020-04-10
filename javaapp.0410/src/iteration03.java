
public class iteration03 {
	
	public static void main(String[] args) {
		int [] ar = {30, 40, 20, 17, 76, 65};
		//30 -> ar[0], 40 -> ar[1], 20-> ar[2], 17 -> ar[3], 76 -> ar[4], 65 -> ar[5]
		int idx = 0;
		int sum = 0;
		do {
			sum = sum + ar[idx];
			idx = idx + 1;
			//데이터가 6개 이기 때문에 중괄호에서 하면 낭비이기 때문에 바깥에서 하는게 좋다.			
		} while (idx < 6);
		System.out.println("합계:" + sum);
		//평균 구하기 
		double avg = sum / 6.0;
		//double avg = sum / 6.0;
		
		//sum을 6으로 나눴을떈 41(정수-정수)로 떨어지는데 6.0(정수-실수)으로 나누면 소수점 까지 나와 실수로 만들수있게 된다.
		//소수가 구하고싶을땐 둘중 하나가 실수여야 한다
		System.out.println("평균:"+avg);
		avg = avg *10 + 0.5;
		//정수로 변환해서 소수를 버림
		avg = (int)avg;
		//반대 작업 수행
		//소수를 먼저 버리지 말고 연산 후 버리자
		avg = avg / 10;
		System.out.println("평균:" + avg);
		}

	}



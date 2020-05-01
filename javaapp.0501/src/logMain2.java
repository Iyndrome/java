import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

//순서
//1. 출력이 잘되는지 try(BufferedReader br = new BufferedReader(new In..... 의 식을 입력
//2. 그 후 출력코드를 작성하여 출력이 정상적으로 되는지 확인
//3. 무한반복문을 만들어 출력 하여 다시 확인 
public class logMain2 {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\30415\\Desktop\\인\\log.txt")))){
			//System.out.println(br); 출력이 잘 되는지 위에 식을 작성 후 출력 코드로 확인해준 다음 진행한다.
			
			//무한 반복문을 만들고
			//합계는 반복문 밖에서 식을 작성
			int total = 0;
			while(true) { 
				String line = br.readLine();
				if(line == null) {
					break;
				}
				//System.out.println(line); 출력이 잘 되고있는지 중간중간 확인용
				String [] data = line.split(" ");
				//System.out.println(data[9]);
				//정수로 변환이 안되는 데이터가 있는 경우
				//계속 작업을 수행하기 위해서 예외처리
				try {
				total = total + Integer.parseInt(data[9]);
				}catch(Exception e) {}
			}
			
			System.out.println("트래픽 합계:" + total);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

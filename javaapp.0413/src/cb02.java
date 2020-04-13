import java.util.Scanner;

public class cb02 {

	public static void main(String[] args) {
		// root가 아닌 데이터를 입력할 때 까지
		// 계속 입력받기
		Scanner sc = new Scanner(System.in);
		
		//무한반복
		while(true) {
			System.out.println("아이디 입력:");
			String id = sc.nextLine();
			//if(중단조건) { 
			//id가 root가 아니면 종료 
			//이해하기 쉽게 false부분을 true로 바꿔도 보면서 공부하자  
			if(id.equals("root") == false) {			
				break;
			}
			System.out.println("존재하는 아이디");
		}
		
		System.out.println("사용가능한 아이디");
	}
		
		
		
		//sc.close(); 스캐너 사용종료
		//sc.close(); 종료할때 쓰이므로, 항상 맨 마지막에 있어야 한다.
	}





                 //둘중 어느것을 사용해도 상관없다. 

            /* 		Scanner sc = new Scanner(System.in);
                        idx idx = 0;
                        ]while(idx < 6) {
	
	                     idx = idx + 1 ;}
-----------------------------------------------------------------------------------------


 	                   for(int idx = 0l idx < 6; idx = idx + 1) {

}

}


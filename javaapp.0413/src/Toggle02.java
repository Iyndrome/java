import java.util.Scanner;

public class Toggle02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flag = 1;
		while(true) { 
		System.out.print("Enter를 누르세요:");
			sc.nextLine();
		//System.out.println("Enter 누름");
			if(flag > 0) { 
			//if(idx % 2 == 0) { 
				System.out.println("ON");
			}else {
				System.out.println("OFF");
			}
			flag = -flag;
			//flag 값이 1일떄 1>0 으로 on, flag = -flag --> 1을 너으면 off
			//flag = -(1) = -1로 off가 되고, -1을 넣으면 flag = -(-1) = 1로 다시 on 이런 식의 개념
		}
	}
}


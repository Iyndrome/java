
public class Datapyte {

	public static void main(String[] args) {
		//나이를 Main Memorry에 저장 
		int age = 49;
		//키를 저장 - 키는 소수 첫째자리까지 저장
		double heigt = 190.0;
		//어떤 변수에 true를 저장
		//boolean은 다른 것과 구분하기 위해서
		//이름 앞에 is를 붙이는 것을 권장
		boolean isPass = true;
        
		//하나의 영역({})안에서 동일한 이름의 
		//변수를 2번 만들면 안됩니다.
		//int age = 49; 
		age = 49; //age에 49를 대입하게 된 것
		
		//age에 저장한 값을 출력
		System.out.println("나이는" + age + "세");
		
		//char는 숫자를 저장하고 있다가 출력할때만 숫자에 해당하는 문자를 출력
	    char ch = 65;
	    int i = 65;
	    System.out.println(ch);
	    System.out.println(i);
	    
	    //22억 이상의 정수는 long 형으로 표현
	    long n = 2200000000L;
	    
	    //final이 붙은 변수는 데이터를 수정할 수 없습니다.
	    //이름은 모두 대문자로 만드는것을 권장
	    final int AGE = 49;
	    //아래 AGE = 49; 문장은 에러
	    //AGE = 49;
	    	  
	    int balance = 1000;
	    //수정 가능한 데이터
	    final int readOnly = balance;
	    //수정 불가능한 데이터  
	    
	    //작은 크기의 자료형 데이터는 큰 자료형에 대입 가능
	    double d = readOnly;
	    
	    //큰 크기의 자료형 데이터를 작은 자료형에 대입하는 것은 안됨
	    //실수는 정수변수에 대입안됨 int i = 3.14;
	    
	    
	    
	}

}

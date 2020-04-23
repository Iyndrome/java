
public class InstenceMain {
             //이곳에 static 이라는 키워드 없이 선언된 변수를 인스턴스 변수라고 한다.
	         //int n; systemprintln(n); 식의 방식으로 작성해도 인스턴스 변수는 0값이기에 출력 오류가 생기지 않는다. (괄호 요약)
	public static void main(String[] args) {
		//Student 클래스의 인스턴스 만들기 
		//new를 이용해서 생성자를 호출하면 인스턴스가 생성 
		//인스턴스를 다른 곳에서 사용하기 위해서 참조를 obj에 대입합니다.
		Student obj = new Student();
		//위의 식이 오류가 난건 system 구조식이 없어서 오류가 난것이므로 오해 금물
		

	}

}

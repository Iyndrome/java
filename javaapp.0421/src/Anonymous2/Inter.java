package Anonymous2;

//인터페이스
//final상수와 추상 메소드를 소유한 개체 
//변수는 만들면 상수가 되고 메소드는 모양만 만들어야 합니다.
//default를 붙이면 내용이 있는 메소드를 만들 수 있고 이 메소드는 필요에 따라 재정의를 합니다.
//하나의 클래스에 여러 개의 인터페이스를 implements 할 수 있습니다.
//사용하는 이유는 템플릿 메소드 패턴이나 다형성 구현
//템플릿 메소드 패턴은 모양을 만들고 내용을 구현하는 것이고 
//Starcraft -> StarcraftImpl

//다형성은 동일한 코드가 대입된 인스턴스에 따라 다르게 반응하는 것
//ㄴ(하위 클래스가 2개 이상, 실제 사용은 하나만 사용한다 => 예시:설정에 언어가 여러 개 있지만 실제 사용은 한글, 또는 영어 등 하나만 사용)
//Starcraft -> Zerg
//Starcraft -> Protoss
//Starcraft -> Terran
public interface Inter {
	public void method();

}

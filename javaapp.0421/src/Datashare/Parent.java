package Datashare;

public class Parent {
	public String parentVar;
	
	//Parent 클래스 안에서 Child 클래스의 인스턴스를 생성
	//이런 경우를 has a 관계라고 하고 
	//포함관계라고 합니다.
	public Child child;
	
	//외부에서 데이터를 받고자 하는 경우에는 데이터를 대입받을 변수를 생성

	
	public Parent() {
		parentVar = "부모의 데이터";
		//포함하고 있는 인스턴스의 데이터를 포함된 인스턴스에 사용하고자 할 때는
		//포함된 인스턴스를 만들 때 생성자에 데이터를 넘겨주면 됩니다.
		//child = new Child();
		child = new Child(parentVar);
		child.childVar = "부모에서 자식을 설정";
		child.disp();
	}
	
	

}

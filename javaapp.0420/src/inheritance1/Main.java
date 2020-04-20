package inheritance1;

public class Main {

	public static void main(String[] args) {
		//Employee 인스턴스 생성
		//어떤 클래스의 인스턴스를 1개만 만드는경우
		//이름의 규칙이 중복이 생겨 클래스 이름을 대문자로 시작해야 변수명과 클래스명이 같아지는 일들이 생길수잇음
		//인스턴스의 참조를 저장할 변수를 클래스의 이름과 동일하게 하고 첫글자만 소문자로 하는 경우가 많음  
		Employee employee = new Employee();
		employee.setEmpName("아이린");
		employee.setEmpPart("가수");
		System.out.println(employee.resultStr());		
		//Manager 클래스의 인스턴스를 생성하고 값을 대입
		Manager manager = new Manager();
		manager.setEmpName("이수만");
		manager.setEmpPart("가수");
		manager.setRank("대표이사");
		System.out.println(manager.managerStr());
		
		//Employee 인스턴스를 1개 더 생성하고 값을 대입
		//첫번째와 다른 생성자를 이용
		Employee emp1 = new Employee("조이", "가수");
		System.out.println(emp1.resultStr());
		
		

	}

}

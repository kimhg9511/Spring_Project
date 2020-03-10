package chap06;

class OverridingParent {
	int money = 20;

	void parentMethod() {
		System.out.println("parent method");
	}

	public OverridingParent() {

	}

	public OverridingParent(int money) {
		this.money = money;
	}
}

class OverridingChild extends OverridingParent {
	// 변수 재정의 - 자료형은 다르게 해도 됨. (변수명만 일치)
	String money = "20원";
	
//	public OverridingChild() {
//		super(100);
//	}
	// 메소드 재정의 - 리턴 타입과 메소드명을 일치시켜야 한다.
	@Override
	void parentMethod() {
		System.out.println("overriding method");
	}
}

public class OverridingTest {
	/**
	 * 변수,메소드 재정의 테스트
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		OverridingChild oc = new OverridingChild();
		oc.parentMethod();

		OverridingParent op = new OverridingParent(100);
		oc.money = "30원";
		System.out.println("oc.money = " + oc.money);
		// System.out.println(".......");
	}

}

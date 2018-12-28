package chapter02;

public class StaticMethod {
	//instance variable
	private int n;
	//class variable
	private static int m;
	
	public void f1() {
		n=10;
		//원칙적으로는 클래스 이름(name space)로 접근해야 한다.
		//but, 같은 클래스인 경우, 생략 가능
		//StaticMethod.m=20;	
		m=20;
	}
	
	public static void f2() {
		//error
		//n=10;
		m=20;
	}
	
	public void f3() {
		f1();
		f2();
	}
	
	public static void f4() {
		//error
		//f1();
		f2();
	}
	
	public static void main(String []args) {
		f2();
		f4();
	}
}

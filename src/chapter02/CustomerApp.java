package chapter02;

public class CustomerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer();
		
		//protected - 같은 패키지에서 접근 o
		c.name="둘리";
		
		//private - 외부에서 접근 x
		//c.age=10;
		c.setAge(10);
		
	}

}

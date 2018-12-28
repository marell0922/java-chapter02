package customer;

import chapter02.Customer;

public class VIPCustomer extends Customer {
	public void showInfo() {
		//protected - 같은 패키지 + 자식  접근 가능 o
		System.out.println(name);
		//System.out.println(age);
		System.out.println(getAge());
	}
}

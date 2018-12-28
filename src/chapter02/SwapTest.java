package chapter02;

public class SwapTest {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println(a+":"+b);
		
		//
		// call by value
		//
		
		//swap
		/*int temp=a;
		a=b;
		b=temp;*/
		swap(a,b);
		System.out.println("--------Afer swap-----------");
		System.out.println(a+":"+b);
		
		//
		// call by reference
		//
		
		Value m=new Value();
		m.value=10;
		//m.setValue(10);
		
		Value n=new Value();
		n.value=20;
		//n.setValue(20);
		
		System.out.println(m.value+":"+n.value);
		//System.out.println(m.getValue()+":"+n.getValue());
		
		swap(m, n);
		System.out.println("--------Afer swap-----------");
		System.out.println(m.value+":"+n.value);
		//System.out.println(m.getValue()+":"+n.getValue());
	}
	
	/* Overloading */
	public static void swap(int i, int j) {//method - stack
		int temp=i;
		i=j;
		j=temp;
	}
	
	public static void swap(Value i, Value j) {
		int temp=i.value;
		i.value=j.value;
		j.value=temp;
		/*int temp=i.getValue();
		i.setValue(j.getValue());
		j.setValue(temp);*/
	
		//Integer 객체는 불변객체 = String class
		Integer i2=new Integer(10);
	}
	
	/*
	 * call by value
	 *  : local variable
	 * call by reference
	 *  : class
	 *  c, c++ - address
	 *  java - reference value of object
	 * */
}

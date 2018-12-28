package chapter02;

public class ArrayUtilTest {
	public static void main(String[] args) {
		 int []a1= {10, 11, 12, 13};
		 double []d1 = ArrayUtils.intToDouble(a1);
		 for(double d:d1) {
			 System.out.print(d+ " ");
		 }
		 
		 System.out.println();
		 
		 double []d2= {10., 11.1, 12.2, 13.2};
		 int []a2=ArrayUtils.doubleToInt(d2);
		 for(int a: a2) {
			 System.out.print(a+" ");
		 }
		 
		 System.out.println();
		 
		 int []a3=ArrayUtils.concat(a1, a2);
		 for(int a:a3) {
			 System.out.print(a+" ");
		 }
		 System.out.println();
	}
}

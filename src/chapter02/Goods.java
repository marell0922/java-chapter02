package chapter02;

public class Goods { //-javabean rules
					 // : field is only private/ it requires the setter and getter of field
	//field
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	public static int countOfGoods;
	
	//constructor
	public Goods() {
		countOfGoods++;
	}
	
	/*
	 * factoroy pattern
	 * public static Goods initInstance() {
		return new Goods();
	}
	private Goods() {
		countOfGoods++;
	}*/
	
	//method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price < 0)
			price=0;
		
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	
	public void showInfo() {
		System.out.println("상품 이름 : "+name);
		System.out.println("가격 : "+price);
		System.out.println("재고량 : "+countStock);
		System.out.println("판매량 : "+countSold);
	}
	
	public int calcDiscountPrice(float discountRate) {
		return price - (int)(price*discountRate);
	}
	
}

package chapter02;

public class GoodsApp {
	public static void main(String[] args) {
		Goods goods=new Goods();
		goods.setName("nikon");
		goods.setPrice(50);
		goods.setCountStock(30);
		goods.setCountSold(50);
		
		System.out.println(goods.getName() + ":" +
							goods.getPrice() + ":" + 
							goods.getCountStock() + ":" + 
							goods.getCountSold());
		
		goods.showInfo();
		System.out.println(goods.calcDiscountPrice(0.3f));
		
		Goods goods2=new Goods(); // class loader에 존재하기에, loading x
		Goods goods3=new Goods();
		
		System.out.println(Goods.countOfGoods);
	}
}

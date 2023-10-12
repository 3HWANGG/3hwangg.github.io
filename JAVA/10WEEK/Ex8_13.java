package org.javaro.lecture;
public class Ex8_13 {
	public static void main(String[] args) {
		Beverage coke = new Beverage("콜라", 2000, 15);
		// Beverage coke = new Beverage();
		// coke.setProduct("콜라");
		// coke.setPrice(2000);
		// coke.setQuantity(15);
		coke.printTitle();
		coke.printData();
		// Beverage tea = new Beverage();
		// tea.setProduct("녹차");
		// tea.setPrice(3000);
		// tea.setQuantity(20);
		Beverage tea = new Beverage("녹차", 3000, 20);
		tea.printData();
	}
	}
class Beverage{	// 클래스 선언
	String product; int price; int quantity;
	public Beverage(String product, int price, int quantity) {
		this.product = product;
		this.price = price;
		this.quantity = quantity;
	}
	public String getProduct() {
		return this.product;
	}
	public int getPrice() {
		return this.price;
	}
	public int getQuantity(){
		return this.quantity;
	}
	public int getTotal() {
		return this.price*this.quantity;
	}
	void printTitle() {
		System.out.println("제품명\t단가\t수량\t금액");
	}
	void printData() {
		System.out.println(this.product+"\t"+this.price+"\t"+this.quantity+"\t"+this.getTotal());
	}
}

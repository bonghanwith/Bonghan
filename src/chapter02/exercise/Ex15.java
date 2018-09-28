package chapter02.exercise;

import java.util.ArrayList;

/**
 * 2.6.1정적 중첩 클래스의 Invoice 클래스를 완전히 구현하라. 
 * 청구서를 출력하는 메서드와 샘플 청구서를 만들어 출력하는 데모 프로그램을 제공하라.
 * @param args
 */
public class Ex15 {
	
	public static class Invoice {
		private ArrayList<Item> items = new ArrayList<>();
		
	    public void addItem(Item item) {
	        items.add(item);
	    }
	    
	    public void print() {
	        double total = 0;
	        for (Item item : items) {
	            System.out.println(item);
	            total += item.price();
	        }
	        System.out.println(total);
	    }
	    
	    public static class Item { // Item is nested inside Invoice
	        private String description;
	        private int quantity;
	        private double unitPrice;
	        
	        public Item(String description, int quantity, double unitPrice) {
		        this.description = description;
		        this.quantity = quantity;
		        this.unitPrice = unitPrice;
	        }

	        public double price() { return quantity * unitPrice; }
	        
	        @Override
	        public String toString() { 
	            return quantity + " x " + description + " @ $" + unitPrice + " each";
	        }
	    }
	}

	public static void main(String[] args) {
		Invoice invoice = new Invoice();
        invoice.addItem(new Invoice.Item("Blackwell Toaster", 2, 24.95));
        invoice.addItem(new Invoice.Item("ZapXpress Microwave Oven", 1, 49.95));
        invoice.print();

	}

}

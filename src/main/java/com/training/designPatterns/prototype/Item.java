package com.training.designPatterns.prototype;

public abstract class Item implements Cloneable{
	
	private String title;
	private double price;

	public Item clone() {
		Item clonedItem = null;
		try { 
			clonedItem = (Item) super.clone();
			clonedItem.setPrice(price);
			clonedItem.setTitle(title);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clonedItem ;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [title=" + title + ", price=" + price + "]";
	}
}
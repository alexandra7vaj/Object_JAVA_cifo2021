package progect_5;

import java.util.ArrayList;

public class Pant {
	// Fields from Person Class _ atribute
	public String brand;
	public String color;
	public String sizePants;
	public int price;
	

	// Constructor from Person Class
	public Pant(String brand, String color, String sizePants, int price) {
		
		this.brand = brand;
		this.color = color;
		this.sizePants = sizePants;
		this.price = price;
	} //ArrayList<Pant>clothes = new arrayList<Pant>

	// Getters and Setters 
	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getSizePants() {
		return sizePants;
	}


	public void setSizePants(String sizePants) {
		this.sizePants = sizePants;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	

	

	
	// Methods from Person Class_Available brand, depending on size
	
	
	// toString
	@Override
	public String toString() {
		return "(brand=" + brand + ", color=" + color + ", sizePants=" + sizePants + ", price=" + price + ")";
	}
	
	
}

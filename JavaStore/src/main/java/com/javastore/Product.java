package javastore;
public class Product {
	private String name;
	private double price;
	private int quant;
	//constructor
	public Product(String name,double price,int quant){
		this.name = name;
		this.price = price;
		this.quant = quant;
	}
	//Getters
	public String getName(){
		return name;
	}
	public double getPrice(){
		return price;
	}
	public int getQuant(){
		return quant;
	}
	// Setters
	public void setName(String name){
		this.name = name;
	}
	public void setPrice(double price){
		this.price = price;
	}

	public void setQuant(int quant){
		this.quant = quant;
	}

}

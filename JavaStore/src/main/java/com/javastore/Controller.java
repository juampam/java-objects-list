package javastore;
import java.util.ArrayList;
import java.util.List;

public class Controller{
	public static void main(String args[]){
		List<Product> productList = new ArrayList<>();
		// Fill the inventory with 10 products
		String[] types = {"Classic","Cheese","Veggy","Fish","Double","Wild West","Gourmet","Mushroom","Super","Premium"};
		String fullname;
		double price = 20.00;
		for(int i= 0;i<types.length;i++){
			fullname = types[i] + " Burger";
			price = price + 10.00;
//			System.out.println(fullname);
			productList.add(new Product(fullname,price,10));
		//	System.out.println("Name: " + product.getName() + ", Price: " + product.getPrice() + ", Available Quantity: " + product.getQuant());
		}
		for (Product product : productList) {
			System.out.println("Name: " + product.getName() + ", Price: " + product.getPrice());
		}
	}
}

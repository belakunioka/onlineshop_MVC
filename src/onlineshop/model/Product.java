/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineshop.model;

/**
 *
 * @author bellakunioka
 */
public class Product {
   private int id_product;
	private String name_product;
	private String description;
	private double price;
	
	public Product(int id_product, String name_product, String description, double price) {
		this.id_product = id_product;
		this.name_product = name_product;
		this.description = description;
		this.price = price;
	}
	
	public int getId_product() {
		return id_product;
	}
	public String getName_product() {
		return name_product;
	}
	public void setName_product(String name_product) {
		this.name_product = name_product;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

    public int getId_produto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

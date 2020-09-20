/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineshop.controller;

import onlineshop.model.Product;
import onlineshop.view.ProductView;

/**
 *
 * @author bellakunioka
 */
public class ProductController {
    private final Product model;
	private ProductView view;
	
	public ProductController (Product model, ProductView view) {
		this.model = model;
		this.view = view;
	}
	
	public int getProductId() {
		return model.getId_product();
	}
	public String getProductName() {
		return model.getName_product();
	}
	public void setProductName(String name_product) {
		model.setName_product(name_product);
	}
	public String getProductDescription() {
		return model.getDescription();
	}
	public void setProductDescription(String description) {
		model.setDescription(description);
	}
	public double getProductPrice() {
		return model.getPrice();
	}
	public void setProductPrice(double price) {
		model.setPrice(price);
	}
	
	public void updateView() {
		view.printProductDetails(model.getId_product(), model.getName_product(), model.getDescription(), model.getPrice());
	}
}

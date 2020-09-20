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
public class Product_Order {
    private Product product;
	final private int fk_product = product.getId_product();
	
	private Order order;
	final private int fk_order = order.getId_order();
	
	private int quantity_product;
	
	public Product_Order(Product product, Order order, int quantity_product) {
		this.product = product;
		this.order = order;
		this.quantity_product = quantity_product;
	}
	
	public int getQuantity_product() {
		return quantity_product;
	}
	public void setQuantity_product(int quantity_product) {
		this.quantity_product = quantity_product;
	}
	public int getFk_product() {
		return fk_product;
	}
	public int getFk_order() {
		return fk_order;
	}

    public void setquantity_order(int order_quantity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getquantity_order() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

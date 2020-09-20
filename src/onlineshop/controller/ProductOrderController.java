/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineshop.controller;

import onlineshop.model.Product_Order;
import onlineshop.view.Product_Order_View;

/**
 *
 * @author bellakunioka
 */
public class ProductOrderController {
    private final Product_Order model;
	private final Product_Order_View view;
	
	public ProductOrderController(Product_Order model, Product_Order_View view) {
		this.model = model;
		this.view = view;
	}
	
	public int getOrder_OrderQuantity() {
		return model.getquantity_order();
	}
	public void setOrder_OrderQuantity(int order_quantity) {
		model.setquantity_order(order_quantity);
	}
	public int getProduct_OrderFk_product() {
		return model.getFk_product();
	}
	public int getProduct_OrderFk_order() {
		return model.getFk_order();
	}
	
	public void updadeView() {
		view.printOrderDetails(model.getFk_order(), model.getFk_order(), model.getQuantity_product());
	}
}

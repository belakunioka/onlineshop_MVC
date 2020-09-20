/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineshop.controller;

import java.time.LocalDate;
import onlineshop.model.Order;
import onlineshop.view.OrderView;

/**
 *
 * @author bellakunioka
 */
public class OrderController {
    private final Order model;
	private OrderView view;
	
	public OrderController (Order model,OrderView view) {
		this.model = model;
		this.view = view;
	}
	
	public String getOrderNfe() {
		return model.getNfe();
	}
	public void setOrderNfe(String nfe) {
		model.setNfe(nfe);
	}
	public LocalDate getOrderDate_emission() {
		return model.getDate_emission();
	}
	public void setOrderDate_emission(LocalDate date_emission) {
		model.setDate_emission(date_emission);
	}
	public double getOrderValue_total() {
		return model.getValue_total();
	}
	public void setOrderValue_total(double value_total) {
		model.setValue_total(value_total);
	}
	public String getOrderStatus() {
		return model.getStatus_order();
	}
	public void setOrderStatus(String status_order) {
		model.setStatus_order(status_order);
	}
	public int getOrderId() {
		return model.getOrderId();
	}
	public int getOrderFk_costumer() {
		return model.getFk_costumer();
	}
	
	public void updateView() {
		view.printOrderDetails(model.getNfe(), model.getDate_emission(), model.getValue_total(), model.getStatus_order());
	}
}

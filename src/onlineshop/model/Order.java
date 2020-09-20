/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineshop.model;

import java.time.LocalDate;

/**
 *
 * @author bellakunioka
 */
public class Order {
     private String nfe;
	private int id_order;
	private LocalDate date_emission;
	private double value_total;
	private String status_order;
	
	private Costumer costumer;
	final private int fk_costumer = costumer.getId_costumer();
	
	
	public Order(String nfe, int id_order, LocalDate data_emission, double valor_total, String status_order,
			Costumer costumer) {
		this.nfe = nfe;
		this.id_order = id_order;
		this.date_emission = date_emission;
		this.value_total = value_total;
		this.status_order = status_order;
		this.costumer = costumer;
	}
	public String getNfe() {
		return nfe;
	}
	public void setNfe(String nfe) {
		this.nfe = nfe;
	}
	public LocalDate getDate_emission() {
		return date_emission;
	}
	public void setDate_emission(LocalDate date_emission) {
		this.date_emission = date_emission;
	}
	public double getValue_total() {
		return value_total;
	}
	public void setValue_total(double value_total) {
		this.value_total = value_total;
	}
	public String getStatus_order() {
		return status_order;
	}
	public void setStatus_order(String status_order) {
		this.status_order = status_order;
	}
	public int getId_order() {
		return id_order;
	}
	public int getFk_costumer() {
		return fk_costumer;
	}

    public void setstatus(String status_order) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getstatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getOrderId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

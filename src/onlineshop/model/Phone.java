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
public class Phone {
    
	private String ddd;
	private String number;
	
	private Costumer costumer;
	final private int fk_costumer = costumer.getId_costumer();
	
	public Phone(String ddd, String number, Costumer costumer) {
		this.ddd = ddd;
		this.number = number;
		this.costumer = costumer;
	}
	
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getFk_costumer() {
		return fk_costumer;
	}
}

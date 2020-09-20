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
public class Adress {
    private int number;
	private String street;
	private String neighborhood;
	private String city;
	private String state;
	private String complement;
	
	private Costumer costumer;
	final private int fk_costumer = costumer.getId_costumer();
	
	public Adress(int number, String street, String neighborhood, String city, String state, String complement,
			Costumer costumer) {
		this.number = number;
		this.street = street;
		this.neighborhood = neighborhood;
		this.city = city;
		this.state = state;
		this.complement = complement;
		this.costumer = costumer;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getNeighborhood() {
		return neighborhood;
	}
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	
	public int getFk_costumer() {
		return fk_costumer;
	}	

}

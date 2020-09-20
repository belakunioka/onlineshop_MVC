/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineshop.controller;

import onlineshop.model.Adress;
import onlineshop.view.AdressView;

/**
 *
 * @author bellakunioka
 */
public class AdressController {
    
	private final Adress model;
	private final AdressView view;
	
	public AdressController (Adress model, AdressView view) {
		this.model = model;
		this.view = view;
	}
	
	public int getAdressNumber() {
		return model.getNumber();
	}
	public void setAdressNumber(int number) {
		model.setNumber(number);
	}
	public String getAdressStreet() {
		return model.getStreet();
	}
	public void setAdressStreet(String street) {
		model.setStreet(street);
	}
	public String getAdressNeighborhood() {
		return model.getNeighborhood();
	}
	public void setAdressNeighborhood(String neighborhood) {
		model.setNeighborhood(neighborhood);
	}
	public String getAdressCity() {
		return model.getCity();
	}
	public void setAdressCity(String city) {
		model.setCity(city);;
	}
	public String getAdressState() {
		return model.getState();
	}
	public void setAdressState(String state) {
		model.setState(state);
	}
	public String getAdressComplement() {
		return model.getComplement();
	}
	public void setAdressComplement(String complement) {
		model.setComplement(complement);
	}
	public int getAdressFk_costumer() {
		return model.getFk_costumer();
	}
	public void updateView() {
		view.printAdressDetails(model.getNumber(), model.getStreet(), model.getNeighborhood(), model.getCity(), model.getState(), model.getComplement());
}
}

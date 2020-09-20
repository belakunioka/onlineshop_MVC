/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineshop.controller;

import onlineshop.model.Phone;
import onlineshop.view.PhoneView;

/**
 *
 * @author bellakunioka
 */
public class PhoneController {
    private final Phone model;
	private final PhoneView view;
	
	public PhoneController (Phone model, PhoneView view) {
		this.model = model;
		this.view = view;
	}
	
	public String getPhoneDdd() {
		return model.getDdd();
	}
	public void setPhoneDdd(String ddd) {
		model.setDdd(ddd);
	}
	public String getPhoneNumber() {
		return model.getNumber();
	}
	public void setPhoneNumero(String number) {
		model.setNumber(number);
	}
	public int getPhoneFk_cliente() {
		return model.getFk_costumer();
	}
	
	public void updateView() {
		view.printPhoneDetails(model.getDdd(), model.getNumber());
	}
}

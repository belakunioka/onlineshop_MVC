/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineshop.controller;

import java.time.LocalDate;
import onlineshop.model.Costumer;
import onlineshop.view.CostumerView;

/**
 *
 * @author bellakunioka
 */
public class CostumerController {
	private Costumer model;
	private CostumerView view;
	
	public CostumerController(Costumer model, CostumerView view) {
		this.model = model;
		this.view = view;
	}
	
	public int getCostumerId_costumer() {
		return model.getId_costumer();
	}
	public String getCostumerName() {
		return model.getName();
	}
	public void setCostumerName(String name) {
		model.setName(name);
	}
	public String getCostumerCpf() {
		return model.getCpf();
	}
	public void setCostumerCpf(String cpf) {
		model.setCpf(cpf);
	}
	public String getCostumereRg() {
		return model.getRg();
	}
	public void setCostumerRg(String rg) {
		model.setRg(rg);
	}
	public String getCostumerEmail() {
		return model.getEmail();
	}
	public void setCostumerEmail(String email) {
		model.setEmail(email);
	}
	public LocalDate getCostumerBirthDate() {
		return model.getBirthDate();
	}
	public void setClienteNascimento(LocalDate BirthDate) {
		model.setBirthDate(BirthDate);
	}
	public void updateView() {
		view.printCostumerDetails (model.getId_costumer(), model.getName(), model.getBirthDate(), model.getCpf(), model.getRg(), model.getEmail());
	}
}

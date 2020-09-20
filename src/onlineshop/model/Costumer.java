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
public class Costumer {
    private static int id_costumer;
	private LocalDate BirthDate;
	private String name;
	private String cpf;
	private String rg;
	private String email;
	
	public Costumer(String name, LocalDate BirthDate, String cpf, String rg, String email) {
		this.BirthDate = BirthDate;
		this.name = name;
		this.cpf = cpf;
		this.rg = rg;
		this.email = email;
	}
	
	public int getId_costumer() {
		return id_costumer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getBirthDate() {
		return BirthDate;
	}
	public void setBirthDate(LocalDate BirthDate) {
		this.BirthDate = BirthDate;
	}
}

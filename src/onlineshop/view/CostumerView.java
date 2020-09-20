/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineshop.view;

import java.time.LocalDate;

/**
 *
 * @author bellakunioka
 */
public class CostumerView {
    public void printCostumerDetails (int id_costumer, String name, LocalDate BirthDate, String cpf, String rg, String email) {
		
		System.out.println("\tCostumer ");
		System.out.println("Nome: " + name);
		System.out.println("Data de nascimento: " + BirthDate);
		System.out.println("CPF: " + cpf);
		System.out.println("RG: " + rg);
		System.out.println("E-mail: " + email);}
    
}

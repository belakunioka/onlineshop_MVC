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
public class OrderView {
    public void printOrderDetails (String nfe, LocalDate date_emission, double value_total, String status_order) {
		
		System.out.println("Pedido: ");
		System.out.println("NFE: " + nfe);
		System.out.println("Data de Emissão: " + date_emission);
		System.out.println("Valor Total: " + value_total);
		System.out.println("Status do Pedido: " + status_order);
		
	}
}

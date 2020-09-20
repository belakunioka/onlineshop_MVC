/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineshop.view;

/**
 *
 * @author bellakunioka
 */
public class ProductView {
    public void printProductDetails (int id_product, String name_product, String description, double price) {
		
		System.out.println("Produto: ");
		System.out.println("ID Produto: " + id_product);
		System.out.println("Nome Produto: " + name_product);
		System.out.println("Descriçăo: " + description);
		System.out.println("Preço: R$ " + price);
		
	}
}

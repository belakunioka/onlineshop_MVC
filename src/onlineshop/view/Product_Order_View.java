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
public class Product_Order_View {
    public void printOrderDetails (int fk_order, int fk_product, int quantity_product) {
		
		System.out.println("Produto_Pedido: ");
		System.out.println("FK Pedido: " + fk_order);
		System.out.println("FK Produto: " + fk_product);
		System.out.println("Quantidade produto: " + quantity_product);
		
	}
}

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
public class AdressView {
    public void printAdressDetails (int number, String street, String neighborhood, String city, String state, String complement) {
		
		System.out.println("Endereço: ");
		System.out.println("Rua: " + street);
		System.out.println("Numero: " + number);
		System.out.println("Complemento: " + complement);
		System.out.println("Bairro: " + neighborhood);
		System.out.println("Cidade: " + city);
		System.out.println("Estado: " + state);
		
	}

    public void printoAdressDetails(int number, String street, String neighborhood, String city, String state, String complement) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

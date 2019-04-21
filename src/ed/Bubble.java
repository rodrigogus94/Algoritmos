/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed;

/**
 *
 * @author Rodri
 */
public class Bubble {

   
	public int[] ordenar(int[] elementos) {
		for (int i = elementos.length; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                if (elementos[j - 1] > elementos[j]) {
                    int aux = elementos[j];
                    elementos[j] = elementos[j - 1];
                    elementos[j - 1] = aux;
                }
            }
        }
		
		return elementos;
	}
	
    
    

}


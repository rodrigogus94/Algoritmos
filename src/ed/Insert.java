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
public class Insert {
    
    public int[] ordedar(int[] elemento){
        int aux, r;
        
        for(int i =1; i< elemento.length; i++){
            aux = elemento[i];
            r = i-1;
            while((r >= 0) && elemento[r] > aux){
                elemento[r+1] = elemento[r];
                r = r -1;
            }
            
            elemento[r+1] = aux;
            
        }
        return elemento;
        
    }
    
}

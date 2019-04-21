/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed;

import com.redhunter.ed.base.EstruturaEstatica;

/**
 *
 * @author Rodri
 */
public class Pilha<T> extends EstruturaEstatica<T>{

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public Pilha() {
    }
    
    public void empilha(T elemento){
        super.adiciona(elemento);
    }
    
    public boolean estaVazia() {
        return super.estaVazia();
    }
    
    public T top(){
        
        if(estaVazia()){
            return null;
        }
        
        return elementos[tamanho-1];
    }

    @Override
    public void inverter() {
        super.inverter();
    }
    
    
    
    
}

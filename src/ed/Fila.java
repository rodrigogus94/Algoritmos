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
public class Fila <T> extends EstruturaEstatica<T>{

    public Fila(int capacidade) {
        super(capacidade);
    }

    public Fila() {
    }


    protected boolean enfileirar(T elemento) {
        return super.adiciona(elemento);
    }

    @Override
    public boolean estaVazia() {
        return super.estaVazia();
    } 
    
    
    public T desenfileirar(){
        
        final int pos =0;
        
        if(estaVazia()){
            return null;
        }
        
        T elementoAserRemovido = elementos[pos];
        
        remover(pos);
        
        return elementoAserRemovido;
    }
}

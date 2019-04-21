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
public class LIsta2<T> extends EstruturaEstatica<T> {

    public LIsta2() {
    }

    public LIsta2(int capacidade) {
        super(capacidade);
    }

    public boolean adiciona(T elemento) {

      return super.adiciona(elemento);
    }


    public boolean adiciona(int posicao, T elemento) {
        return super.adiciona(posicao ,elemento); 
    }

}

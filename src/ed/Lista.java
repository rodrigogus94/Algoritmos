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
public class Lista <T> {
    
    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }
    
    public Lista() {
        this(10);
    }
    
    public boolean adiciona(T elemento) {

        aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;

    }

    public boolean adiciona(int posicao, T elemento) {
        aumentaCapacidade();
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = tamanho - 1; i >= posicao; i--) {

            this.elementos[i + 1] = this.elementos[i];
        }
        elementos[posicao] = elemento;
        tamanho++;
        return true;

    }

    private void aumentaCapacidade() {

        if (tamanho == elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                elementosNovos[i] = elementos[i];
            }
            elementos = elementosNovos;
        }
    }

    
    
}

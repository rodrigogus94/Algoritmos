/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed;

import java.util.Arrays;

/**
 *
 * @author Rodri
 */
public class VetorObjeto {

    private Object[] elementos;
    private int tamanho;

    public VetorObjeto(int capacidade) {

        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    /*public void adiciona(String elemento) {
        for (int i = 0; i < this.elementos.length; i++) {
            if(this.elementos[i] == null){
                this.elementos[i] = elemento;
                break;
            }
        }
    }*/
 /*public void adiciona(String elemento) throws Exception {

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }else{
            throw new Exception("Vetor já está cheio ");
        }
   
    }*/
    public boolean adiciona(Object elemento) {

        aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;

    }

    public boolean adiciona(int posicao, Object elemento) {
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
            Object[] elementosNovos = new Object[this.elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                elementosNovos[i] = elementos[i];
            }
            elementos = elementosNovos;
        }
    }

    public void remover(int posicao) {

        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
    }

    public Object busca(int posicao) {

        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return elementos[posicao];
    }

    public int busca(Object elemento) {

        for (int i = 0; i < tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public int tamanho() {
        return tamanho;
    }

    public String imprimir() {

        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (tamanho > 0) {
            s.append(elementos[tamanho - 1]);
        }

        s.append("]\n");

        return s.toString();
    }

    public void inverter() {
      
        Object aux;
        int j = tamanho-1;
        for (int i = 0; i < tamanho - 1; i++) {
            if(i==0){
                aux = elementos[i];
                elementos[i] = elementos[tamanho-1];
                elementos[tamanho-1] = aux;
                j--;
            }else if(j > i ){
                 aux = elementos[i];
                elementos[i] = elementos[j];
                elementos[j] = aux;
                j--;
            }
          
           
        }
        
      
    }

}

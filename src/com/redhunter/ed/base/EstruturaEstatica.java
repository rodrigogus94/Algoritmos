/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redhunter.ed.base;

/**
 *
 * @author Rodri
 */
public class EstruturaEstatica<T> {

    protected T[] elementos;
    protected int tamanho;

    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public EstruturaEstatica() {
        this(10);
    }

    protected boolean adiciona(T elemento) {

        aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;

    }

    protected boolean adiciona(int posicao, T elemento) {
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

    public boolean estaVazia() {
        return this.tamanho == 0;

    }

    public T desempilha() {
        if (estaVazia()) {
            return null;
        }

        T elemento = elementos[tamanho - 1];
        tamanho--;
        return elemento;
    }

    public int tamanho() {
        return tamanho;
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

    public String imprimir( ) {

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

        T aux;
        int j = tamanho - 1;
        for (int i = 0; i < tamanho - 1; i++) {
            if (i == 0) {
                aux = elementos[i];
                elementos[i] = elementos[tamanho - 1];
                elementos[tamanho - 1] = aux;
                j--;
            } else if (j > i) {
                aux = elementos[i];
                elementos[i] = elementos[j];
                elementos[j] = aux;
                j--;
            }

        }

    }

}

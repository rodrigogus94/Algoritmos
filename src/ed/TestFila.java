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
public class TestFila {

    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<>();

        System.out.println(fila.estaVazia());
        System.out.println(fila.tamanho());

        for (int i = 1; i <= 10; i++) {
            fila.enfileirar(i);
        }
        System.out.println(fila.imprimir());

        fila.enfileirar(50);
        System.out.println(fila.imprimir());

        
        System.out.println(fila.imprimir());
        System.out.println(fila.desenfileirar());
        System.out.println(fila.imprimir());

    }
}

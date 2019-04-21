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
public class TestPilha {

    public static void main(String[] RedHunter) {

        Pilha<Integer> pilha = new Pilha<Integer>();

        System.out.println(pilha.imprimir());
        System.out.println(pilha.tamanho());
        
        System.out.println(pilha.estaVazia());

        for (int i = 1; i <= 10; i++) {
            pilha.empilha(i);
        }

        System.out.println(pilha.imprimir());

        System.out.println(pilha.top());

        pilha.desempilha();
        System.out.println(pilha.imprimir());

        System.out.println(pilha.top());
        
        pilha.inverter();
        System.out.println(pilha.imprimir());
    }

}

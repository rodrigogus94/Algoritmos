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
public class Test {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(2);
        VetorObjeto vetorObjeto = new VetorObjeto(2);

        vetor.adiciona("8");
        vetor.adiciona("3");
        vetor.adiciona("1");
        vetor.adiciona("6");
        vetor.adiciona("9");

        vetorObjeto.adiciona(8);
        vetorObjeto.adiciona(3);
        vetorObjeto.adiciona(1);
        vetorObjeto.adiciona(6);
        vetorObjeto.adiciona(9);

        System.out.println(vetor.imprimir());
         vetor.adiciona(0, "A");
         System.out.println(vetor.imprimir());
         vetor.adiciona(3, "D");
        System.out.println(vetor.imprimir());
        System.out.println(vetorObjeto.imprimir());
        
        vetor.inverter();
        vetorObjeto.inverter();

        System.out.println(vetor.imprimir());
        System.out.println(vetorObjeto.imprimir());
    }

}

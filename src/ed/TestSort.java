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
public class TestSort {

    public static void main(String[] args) {

     /* MergeSort mergeSort = new MergeSort();

        int[] elementos = {10, 9, 8, 7, 5, 3, 2, 1, 6};
        int[] aux = new int[elementos.length];

        mergeSort.ordenar(elementos, aux, 0, elementos.length);
        mergeSort.toString();
         */
 /*  Bubble bubble = new Bubble();
        
        int[] elementos = {10, 9, 8, 7, 5, 3, 2, 1, 6};
        
        bubble.ordenar(elementos);
        System.out.println(Arrays.toString(elementos));*/
       
         Insert insert = new Insert();

        int[] elementos = {10, 9, 8, 7, 5, 3, 2, 1, 6};

        insert.ordedar(elementos);
        System.out.println(Arrays.toString(elementos));
    }

}

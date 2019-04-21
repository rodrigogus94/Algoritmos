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
public class MergeSort{

    private int[] elementos;
    private int tamanho;



    public void ordenar(int[] elementos, int[] aux, int inicio, int fim) {

        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            ordenar(elementos, aux, inicio, meio);
            ordenar(elementos, aux, meio + 1, fim);
            unir(elementos, aux, inicio, meio, fim);

        }

    }
    
    public void unir(int[] elementos, int[] aux, int inicio, int meio, int fim){
        for(int a=inicio; a <=fim; a++){
            aux[a] = elementos[a];
        }
        
        int i=0, j=0;
        
        for(int a=inicio; a <= fim; a++){
            if(i > meio){
                elementos[a] = aux[j++];
            }else if(j > fim){
                elementos[a] = aux[i++]; 
            }else if(aux[i] < aux[j]){
                elementos[a] = aux[i++];
            }else{
                elementos[a] = aux[j++];
            }
        }
    }

    
   
   
}

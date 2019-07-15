/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoconcorrentes_sequencial;

public class ProjetoConcorrentes_sequencial {
    public static void main(String[] args) {
        
        sequencial thread = new sequencial("vet#1",1);
        sequencial thread2 = new sequencial("vet#2",2);
        sequencial thread3 = new sequencial("vet#3",3);
        sequencial thread4 = new sequencial("vet#4",4);
        sequencial thread5 = new sequencial("vet#5",5);
        sequencial thread6 = new sequencial("vet#6",6);
        
        thread.chamar();
        thread2.chamar();
        thread3.chamar();
        thread4.chamar();
        thread5.chamar();
        thread6.chamar();
        
        
    }
    
}

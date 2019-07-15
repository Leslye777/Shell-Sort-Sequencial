package projetoconcorrentes_sequencial;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class gravarArquivo {
    
    public void gravar(int semente, int[] vet, String nome)throws IOException{
        
        FileWriter arq = new FileWriter("C:\\Users\\lesli\\Desktop\\SEQUENCIALvet"+semente+nome);
        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.println("vet#"+semente);
        for (int i = 0; i < 100; i++) {
            gravarArq.println(" "+vet[i]);
        }
        
        arq.close();
        
    }
}

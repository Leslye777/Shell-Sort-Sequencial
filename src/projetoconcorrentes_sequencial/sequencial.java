package projetoconcorrentes_sequencial;

public class sequencial{
    
    public String nome;
    public int semente;
    public int[] vet=new int[100];
    Numeros gera = new Numeros();
    ordena shell = new ordena();
    gravarArquivo arquivo = new gravarArquivo();
    
    public sequencial(String nome, int semente) {
        this.nome = nome;
        this.semente = semente;
    }
  
    public void chamar(){
        
        String nomeArq = "1a.txt";
        try{
            gera.gerador(semente, vet);
            shell.Shell_sort(vet,100);  
            for(int i=0;i<100;i++){
                System.out.println(nome+" "+vet[i]);
            }
            arquivo.gravar(semente, vet, nomeArq);
        }catch(Exception e){
            
        }           
    }
}


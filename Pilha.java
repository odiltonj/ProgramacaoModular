public class Pilha {

    //vetor que armazena a quantidade de elementos , topo = indice , capacidade...
    public int[] elementos;
    public int topo;
    public int capacidade;

    //Construtor: cria a pilha com a capacidade informada
    public Pilha (int capacidade){
        this.capacidade = capacidade;
        elementos = new int[capacidade];
        topo = -1;
    }

    //Método Inserir: Insere elemento no topo da pilha
    public void inserir(int valor){
        if(topo < capacidade - 1){
            elementos[++topo] = valor;
        }
        else{
            System.out.println("Pilha cheia.");
        }
    }

    //Método Remover: Remove elemento do topo da pilha
    public int remover(){
        if(topo >= 0){
            return elementos[topo--];
        }
        else{
            System.out.println("Pilha vazia.");
            return -1;
        }
        
    }

    // Exemplo de método na classe Pilha
    public void mostrar() {
        for (int i = topo; i >= 0; i--) {
            System.out.println(elementos[i]);
        }
    }
    

}

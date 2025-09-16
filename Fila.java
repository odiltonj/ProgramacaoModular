public class Fila {
    public int[] elementos; //vetor para armazenar os elementos da fila
    public int frente;      //índice do elemento da frente
    public int atras;       //índice do elemento de trás
    public int tamanho;     //número atual de elementos na fila
    public int capacidade;  //capacidade máxima da fila

    //Construtor da fila.
    public Fila(int capacidade) {
        this.capacidade = capacidade;
        elementos = new int[capacidade];
        frente = 0;
        atras = -1;
        tamanho = 0;
    }

    //Método de inserção - Enfileirar
    public void enfileirar(int valor) {
        if (tamanho < capacidade){
            atras = (atras + 1) % capacidade; //atualiza o índice de trás
            elementos[atras] = valor; //adiciona o novo elemento
            tamanho++;                 //incrementa o tamanho da fila
        } else {
            System.out.println("Fila cheia!.");
        }
    }

    //metodo de remoção - Desenfileirar
    public int desenfileirar(){
        if(tamanho > 0){
            int valor = elementos[frente]; //pega o elemento da frente
            frente = (frente + 1) % capacidade; //atualiza o índice
            tamanho--; //decrementa o tamanho da fila
            System.out.println("Elemento removido: " + valor);
            return valor;
        }
        else{
            System.out.println("Fila vazia!.");
            return -1;
        }
    }

    public void mostrarFila(){
        if(tamanho > 0){
            System.out.print("Fila: ");
            for(int i = 0; i < tamanho; i++){
                System.out.print(elementos[(frente + i) % capacidade] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Fila vazia!.");
        }
    }   

}

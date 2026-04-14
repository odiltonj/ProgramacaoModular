public class PilhaModular {
    private int tamanhoMaximo;
    private int[] vetor;
    private int topo;

    // Construtor: Módulo para inicializar a pilha
    public PilhaModular(int tamanho) {
        this.tamanhoMaximo = tamanho;
        this.vetor = new int[tamanhoMaximo];
        this.topo = -1; // Pilha vazia
    }

    // Módulo adicionar elementos ao topo: Adiciona elemento ao topo
    public void adicionar(int valor) {
        if (cheia()) {
            System.out.println("Erro: Pilha cheia");
            return;
        }
        vetor[++topo] = valor;
        System.out.println("Empilhado: " + valor);
    }

    // Módulo Remove e retorna o elemento do topo
    public int remover() {
        if (vazia()) {
            System.out.println("Erro: Pilha vazia");
            return -1;
        }
        return vetor[topo--];
    }

    // Módulo Ver: Espia o topo sem remover
    public int ver() {
        if (vazia()) {
            return -1;
        }
        return vetor[topo];
    }

    // Módulo Vazio: Verifica se a pilha está vazia
    public boolean vazia() {
        return (topo == -1);
    }

    // Módulo Cheio: Verifica se a pilha está cheia
    public boolean cheia() {
        return (topo == tamanhoMaximo - 1);
    }
}

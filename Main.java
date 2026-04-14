public class Main {
    public static void main(String[] args) {
        PilhaModular minhaPilha = new PilhaModular(5); // Cria pilha com tamanho 5

        minhaPilha.adicionar(10);
        minhaPilha.adicionar(20);
        minhaPilha.adicionar(30);
        minhaPilha.adicionar(40);
        minhaPilha.adicionar(50);
        minhaPilha.adicionar(60);

        System.out.println("Topo da pilha: " + minhaPilha.ver());

        System.out.println("Desempilhado: " + minhaPilha.remover());
        //System.out.println("Desempilhado: " + minhaPilha.remover());
        //System.out.println("Desempilhado: " + minhaPilha.remover());
        //System.out.println("Desempilhado: " + minhaPilha.remover());

        System.out.println("Nova Pilha:" + minhaPilha.ver());


        if (!minhaPilha.vazia()) {
            System.out.println("A pilha ainda tem elementos.");
        }
        else{
            System.out.println("A pilha está vazia!");
        }
    }
}

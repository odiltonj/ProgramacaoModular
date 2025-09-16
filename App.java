
public class App {
    public static void main(String[] args) throws Exception {
        Pilha p = new Pilha(3);
        p.inserir(1);
        p.inserir(2);
        p.inserir(3);

        p.mostrar();
        p.remover();
        System.out.println("Após remover o elemento do topo:");
        p.mostrar();
    }
}

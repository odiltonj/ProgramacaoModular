public class App {
    public static void main(String[] args) throws Exception {
        Fila f = new Fila(5); //cria uma fila com capacidade para 5 elementos.
        f.enfileirar(10);
        f.enfileirar(20);
        f.enfileirar(30);
        f.mostrarFila();
        f.desenfileirar();
        System.out.println("Após desenfileirar:");
        f.mostrarFila();  
    }
}

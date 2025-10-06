public class App {
    public static void main(String[] args) throws Exception {
        
        Funcionario f = new Funcionario();
        f.trabalhar();

        Professor p = new Professor();
        p.trabalhar();
        p.nome = "João";
        p.cpf = "123.456.789-00";

        Cientista c = new Cientista();
        c.trabalhar();
    }
}

public class Pessoa {

    private String nome;
    private int idade;
    public int setIdade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public int getIdade() {return idade;}

    public void setIdade(int idade) {this.idade = idade;}

    // nao iremos declarar os getters e setters

    public void andar() {
        System.out.println(this.nome + " está andando.");
    }

    public void falar() {
        System.out.println(this.nome + " está falando.");
    }

}

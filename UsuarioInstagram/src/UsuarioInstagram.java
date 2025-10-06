public class UsuarioInstagram {
    // Atributos privados — protegidos por encapsulamento
    private String nomeUsuario;
    private String senha;
    private int seguidores;
    private int curtidasTotais;

    // Construtor
    public UsuarioInstagram(String nomeUsuario, String senha) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.seguidores = 0;
        this.curtidasTotais = 0;
    }

    // Método para exibir o perfil (sem mostrar a senha!)
    public void exibirPerfil() {
        System.out.println("Usuário: @" + nomeUsuario);
        System.out.println("Seguidores: " + seguidores);
        System.out.println("Curtidas totais: " + curtidasTotais);
    }

    // Método para seguir alguém — aumenta o contador de seguidores
    public void ganharSeguidor() {
        seguidores++;
    }

    // Método para receber curtidas — controla o incremento
    public void receberCurtida() {
        curtidasTotais++;
    }

    // Método para trocar senha de forma segura
    public void alterarSenha(String senhaAntiga, String novaSenha) {
        if (this.senha.equals(senhaAntiga)) {
            this.senha = novaSenha;
            System.out.println("Senha alterada com sucesso!");
        } else {
            System.out.println("Senha incorreta. Acesso negado!");
        }
    }

    // Método para autenticar login (simulação)
    public boolean autenticar(String senhaDigitada) {
        return this.senha.equals(senhaDigitada);
    }

}

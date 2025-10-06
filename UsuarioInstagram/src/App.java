public class App {
    public static void main(String[] args) throws Exception {
         UsuarioInstagram usuario = new UsuarioInstagram("odiltonjr", "abc123");

        //Acesso direto proibido:
        // usuario.senha = "novaSenha";       // Erro de compilação
        // usuario.seguidores = 9999;         // Erro de compilação
        // usuario.curtidasTotais += 1000;    // Erro de compilação

        //Interações controladas pelos métodos
        usuario.ganharSeguidor();
        usuario.ganharSeguidor();
        usuario.receberCurtida();
        usuario.receberCurtida();
        usuario.receberCurtida();

        usuario.exibirPerfil();

        // Tentando trocar senha
        usuario.alterarSenha("errada", "novaSenha"); //não permite
        usuario.alterarSenha("abc123", "novaSenha"); //permitido

        // Autenticação segura
        if (usuario.autenticar("novaSenha")) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Falha no login.");
        }
    }
}
 

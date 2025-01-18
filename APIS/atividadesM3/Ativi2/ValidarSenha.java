package atividadesM3.Ativi2;

public class ValidarSenha {
    String senha;

    public ValidarSenha(String senha) {
        this.senha = senha;
        if (senha.length() < 10){
            throw new SenhaInvalidaException("A senha deve ter pelo menos 10 caracteres!");
        }
    }

}

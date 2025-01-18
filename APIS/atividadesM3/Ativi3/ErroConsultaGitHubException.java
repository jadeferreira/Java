package atividadesM3.Ativi3;

public class ErroConsultaGitHubException extends RuntimeException {
    public String mensagem;

    public ErroConsultaGitHubException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}

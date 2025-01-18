package atividadesM3.Ativi2;

public class SenhaInvalidaException extends RuntimeException {
    public String mensagem;

    public SenhaInvalidaException(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMessage() {
        return this.mensagem;
    }

}

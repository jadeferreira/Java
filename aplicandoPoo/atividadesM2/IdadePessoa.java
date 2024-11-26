package atividadesM2;

public class IdadePessoa {
    private String nome;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void verificarIdade(int idade) {
        if (idade >= 18) {
            System.out.println("Maior de idade!");
        }else{
            System.out.println("Menor de idade!");
        }
    }
}

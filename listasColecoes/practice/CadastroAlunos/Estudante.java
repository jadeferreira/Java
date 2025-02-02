package practice.CadastroAlunos;

public class Estudante {
    private String nome;
    private double nota;
    private int idade;

    public Estudante(String nome, double nota, int idade) {
        this.nome = nome;
        this.nota = nota;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    

}

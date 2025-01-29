package practice.GerenciadorDeTarefas;

public class Tarefa {
    private String nome;
    private boolean concluido;

    public Tarefa(String nome) {
        this.nome = nome;
        this.concluido = false;
    }

    public String getNome() {
        return nome;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void marcarComoConcluido(){
        this.concluido = true;
    }

    public void mostrarStatus() {
        System.out.println(nome + " - " + (concluido ? "Concluída" : "Pendente"));

    }
}

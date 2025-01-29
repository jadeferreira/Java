package practice.GerenciadorDeTarefas;

public class TarefaUrgente extends Tarefa {
    private int prioridade;

    public TarefaUrgente(String nome, int prioridade) {
        super (nome);
        this.prioridade = prioridade;
    }

    public void mostrarStatus(){
        System.out.println(getNome() + " (Urgente, Prioridade: " + prioridade + ") - " + (isConcluido() ? "Concluída" : "Pendente"));
    }
}

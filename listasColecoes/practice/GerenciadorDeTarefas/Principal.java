package practice.GerenciadorDeTarefas;

public class Principal {
    public static void main(String[] args) {

        GerenciadorDeTarefas gerenciador  = new GerenciadorDeTarefas();

        Tarefa tarefaNormal = new Tarefa("Estudar Java");
        Tarefa tarefaUrgente = new TarefaUrgente("Estudar inglês", 8);

        gerenciador.AdicionarTarefa(tarefaNormal);
        gerenciador.AdicionarTarefa(tarefaUrgente);

        tarefaUrgente.marcarComoConcluido();

        System.out.println("Todas as tarefas: ");
        gerenciador.listarTarefas();

        System.out.println();

        System.out.println("Tarefas concluídas: ");
        gerenciador.listarTarefasConcluidas();


    }
}

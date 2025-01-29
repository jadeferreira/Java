package practice.GerenciadorDeTarefas;

import java.util.ArrayList;

public class GerenciadorDeTarefas{
    private ArrayList<Tarefa> tarefas;

    public GerenciadorDeTarefas(){
        tarefas = new ArrayList<>();
    }

    public void AdicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void listarTarefas() {
        for (Tarefa tarefa : tarefas) {
            tarefa.mostrarStatus();
        }
    }

    public void listarTarefasConcluidas(){
        for (Tarefa tarefa : tarefas) {
            if(tarefa.isConcluido()){
                tarefa.mostrarStatus();
            }
        }

    }

}

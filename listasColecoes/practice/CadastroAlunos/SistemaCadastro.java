package practice.CadastroAlunos;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class SistemaCadastro {
    private ArrayList<Estudante> estudantes;
    private Scanner entrada = new Scanner(System.in);

    public SistemaCadastro() {
        estudantes = new ArrayList<>();
    }

    public void adicionarEstudante(Estudante estudante) {
        estudantes.add(estudante);
        System.out.println("Estudante adicionado com sucesso!");
    }

    public void listarEstudantes() {
        for (Estudante estudante : estudantes) {
            System.out.println("Nome: " + estudante.getNome() + ", Nota: " + estudante.getNota() + ", Idade: " + estudante.getIdade());
        }
    }

    public void ordernarEstudanteNome() {
        Collections.sort(estudantes, (Comparator.comparing(Estudante::getNome)));
        System.out.println("Estudantes ordenados: ");
        for (Estudante estudante : estudantes) {
            System.out.println(estudante.getNome());
        }
    }

    public void buscarEstudanteNome() {
        System.out.println("Qual estudante gostaria de procurar por nome: ");
        String nome2 = entrada.nextLine();
        for (Estudante estudantebusca : estudantes) {
            if (estudantebusca.getNome().equals(nome2)) {
                System.out.println("Estudante encontrado, Nome: " + estudantebusca.getNome() + ", Idade: " + estudantebusca.getIdade() + ", Nota: " + estudantebusca.getNota());
                return;
            }
        }
        System.out.println("Estudante nao encontrado");
    }


}

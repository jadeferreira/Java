package practice.CadastroAlunos;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaCadastro sistemaCadastro = new SistemaCadastro();

        int opcao = 0;

        while(opcao != 5) {
            System.out.println("===== Sistema de Cadastro de Estudantes =====");
            System.out.println("1 - Adicionar Estudante");
            System.out.println("2 - Listar Estudantes");
            System.out.println("3 - Ordenar Estudantes por Nome");
            System.out.println("4 - Buscar Estudante pelo Nome");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Nome: ");
                    String name = sc.next();
                    System.out.println("Nota: ");
                    double nota = sc.nextDouble();
                    System.out.println("Idade: ");
                    int idade = sc.nextInt();

                    Estudante estudante = new Estudante(name, nota, idade);
                    sistemaCadastro.adicionarEstudante(estudante);
                    System.out.println();
                    break;
                case 2:
                    sistemaCadastro.listarEstudantes();
                    System.out.println();
                    break;
                case 3:
                    sistemaCadastro.ordernarEstudanteNome();
                    System.out.println();
                    break;
                case 4:
                    sistemaCadastro.buscarEstudanteNome();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Sistema encerrado!");
                    break;
                default:
                    System.out.println("Opcao invalida, tente novamente");
                    break;
            }




        }


    }

}

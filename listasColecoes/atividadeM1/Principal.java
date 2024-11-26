package atividadeM1;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        Pessoa pessoa1 = new Pessoa("Jade", 20);
        Pessoa pessoa2 = new Pessoa("Lucas", 25);
        Pessoa pessoa3 = new Pessoa("Alfredo", 54);
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa: " + listaDePessoas.get(0));
        System.out.println("Lista de Pessoas:");
        for (Pessoa pessoa : listaDePessoas) { /*Operador dois pontos quer dizer: A variavel a esquerda (pessoa), deve assumir cada valor da coleção a direita (listaDePessoas)*/
            System.out.println(pessoa);
        }

    }

    public static class Pessoa {
        private String nome;
        private int idade;

        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        @Override
        public String toString() {
            return "Pessoa: " + nome + " (Idade: " + idade + ")\n";
        }
    }
}


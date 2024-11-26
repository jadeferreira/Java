package atividadesM2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        conta.titular = "Jade Ferreira";
        conta.setNumeroConta(65458763);
        conta.setSaldo(500.00);
        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.println("Saldo da conta: " + conta.getSaldo());
        System.out.println("Nome do titular: " + conta.titular);

        IdadePessoa id = new IdadePessoa();
        id.setNome("Lucas Almeida");
        id.setIdade(15);
        id.verificarIdade(id.getIdade());

        Produto produto = new Produto();
        produto.setNome("Roupa");
        produto.setPreco(100.00);
        System.out.println("Produto com desconto: " + produto.aplicarDesconto(10));

        Aluno aluno1 = new Aluno("Lulu", 7.5, 8.0, 9.2);
        Aluno aluno2 = new Aluno("Karina", 6.8, 7.3, 8.5);

        System.out.println("Aluno 1:");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Nota 1: " + aluno1.getNota1());
        System.out.println("Nota 2: " + aluno1.getNota2());
        System.out.println("Nota 3: " + aluno1.getNota3());
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println();

        System.out.println("Aluno 2:");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Nota 1: " + aluno2.getNota1());
        System.out.println("Nota 2: " + aluno2.getNota2());
        System.out.println("Nota 3: " + aluno2.getNota3());
        System.out.println("Média: " + aluno2.calcularMedia());

        Livro livro = new Livro();
        livro.setAutor("Anne Frank");
        livro.setTitulo("Diário de Anne Frank");
        livro.exibirDetalhes();
    }
}

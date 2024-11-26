package atividadesM1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        int num = 10;
        System.out.println(calc.retornaDobro(num));

        Musica musica = new Musica();
        musica.avaliarMusica(10);
        musica.avaliarMusica(20);
        System.out.println(musica.calcMedia());

        Carro carro = new Carro();
        carro.modelo = "Carro";
        carro.ano = 2015;
        carro.cor = "Vermelho";
        carro.imprimir();
        carro.calcIdade(2024);

        Aluno aluno = new Aluno();
        aluno.nome = "Berto";
        aluno.idade = 20;
        aluno.imprimir();
    }
}

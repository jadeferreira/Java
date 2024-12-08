package atividadeM3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        // 1)
        ArrayList<String> listaNomes = new ArrayList<>();
        listaNomes.add("Jade");
        listaNomes.add("Jeremias");
        listaNomes.add("Jose");

        for(String nome : listaNomes){
            System.out.println(nome);
        }

        // 2) e 3)
        Animal animal = new Cachorro();

        if(animal instanceof Cachorro){
            Cachorro cachorro = (Cachorro) animal;
        }else{
            System.out.println("O obejto não é um cachorro!");
        }

        // 4)
        Produto produto1 = new Produto("Tv", 900);
        Produto produto2 = new Produto("Fogao", 1200);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);

        double soma = 0.0;

        for(Produto produto : produtos){
            System.out.println(produto.toString());
            soma += produto.getPreco();
        }

        double media = soma/produtos.size();
        System.out.println("Média dos produtos: " + media);

        // 5)
        Circulo circ = new Circulo(7);
        Quadrado quad = new Quadrado(5);

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(circ);
        formas.add(quad);

        for (Forma forma : formas){
            System.out.println("Área: " + forma.calcularArea());
        }

        // 6)
        ContaBancaria contaBancaria1 = new ContaBancaria(1550, 600.00);
        ContaBancaria contaBancaria2 = new ContaBancaria(1546, 1200.00);
        ContaBancaria contaBancaria3 = new ContaBancaria(1600, 750.00);

        ArrayList<ContaBancaria> contasBanc = new ArrayList<>();
        contasBanc.add(contaBancaria1);
        contasBanc.add(contaBancaria2);
        contasBanc.add(contaBancaria3);

        ContaBancaria maiorSaldo = contasBanc.get(0);
        for(ContaBancaria conta : contasBanc){
            if(conta.getSaldoConta() > maiorSaldo.getSaldoConta()){
                maiorSaldo = conta;
            }
        }

        System.out.println("Conta com maior saldo, Número: " + maiorSaldo.getNumConta() + "\nSaldo: " + maiorSaldo.getSaldoConta());


    }
}

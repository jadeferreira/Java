package atividadeM2;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto("Ferrari", 1, 250000);

        Produto produto2 = new Produto("Brasilia", 20, 50000);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produto);
        produtos.add(produto2);
        System.out.println(produtos.size());
        System.out.println(produtos.get(1).getNome());
        System.out.println(produtos.get(0).toString());
        System.out.println(produtos);
        //  Outra Opção:    for (Produto produto : listaProdutos) {
        //                System.out.println(produto);
        //               }

        System.out.println();

        ProdutoPerecivel produtoP = new ProdutoPerecivel("Sorvete", 30, 20, "10 de Dezembro");
        System.out.println(produtoP);
    }
}

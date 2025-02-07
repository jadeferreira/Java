package practice.ProdutoComparacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Tv", 900));
        produtos.add(new Produto("Micro-ondas", 100));
        produtos.add(new Produto("Mesa", 200));
        Collections.sort(produtos);

        System.out.println("Lista ordenada: ");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

    }
}

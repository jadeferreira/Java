package atividadeM4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        // 1)
        List<Integer> listaNum = new LinkedList<>();
        listaNum.add(54);
        listaNum.add(68);
        listaNum.add(37);
        Collections.sort(listaNum);
        System.out.println("Lista de números inteiros ordenada: " + listaNum);

        System.out.println();

        // 2) e 3)
        List<Titulo> listaTitulo = new LinkedList<>();
        listaTitulo.add(new Titulo("Os Incriveis"));
        listaTitulo.add(new Titulo("Rei Leão"));
        listaTitulo.add(new Titulo("Moana"));

        Collections.sort(listaTitulo);
        System.out.println("Lista de titulos ordenada: ");
        for (Titulo titulo : listaTitulo) {
            System.out.println(titulo.getNome());
        }

        System.out.println();

        // 4)
        List<String> listaNomesArray = new ArrayList<>();
        listaNomesArray.add("Lucas");
        listaNomesArray.add("Pedro");
        listaNomesArray.add("Maria");

        List<String>  listaNomesLinked = new LinkedList<>();
        listaNomesLinked.add("Mark");
        listaNomesLinked.add("Derek");
        listaNomesLinked.add("Maggie");

        System.out.println("Lista Array: " + listaNomesArray);
        System.out.println("Lista Linked: " + listaNomesLinked);

        System.out.println();

        // 5)
        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Lucas");
        listaPolimorfica.add("Pedro");
        listaPolimorfica.add("Maria");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Mark");
        listaPolimorfica.add("Derek");
        listaPolimorfica.add("Maggie");
        System.out.println("LinkedList: " + listaPolimorfica);


    }
}

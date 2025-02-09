package practice.AtiviVariados;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AdcElementos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> listaString = new LinkedList<>();
        listaString.add("Jonas");
        listaString.add("Michael");
        listaString.add("Richard");
        listaString.add("Augustus");
        System.out.println(listaString);

        System.out.println("Para qual índice gostaria de adicionar um novo elemento: ");
        int indice = sc.nextInt();

        if(indice >=0 && indice < listaString.size()){
            System.out.println("E qual elemento seria esse: ");
            String elemento = sc.next();
            listaString.set(indice, elemento);

            System.out.println("Lista após o elemento " + elemento + " adicionado ao índice " + indice);
            System.out.println(listaString);

        }else {
            System.out.println("Índice inválido!");
        }

    }
}

package practice;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MoverItem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        System.out.println(list);

        System.out.println("Escolha um índice, o número escolhido irá para o final da lista: ");
        int indice = sc.nextInt();

        if(indice >=0 && indice < list.size()){
            Integer numero = list.remove(indice);
            list.add(numero);

            System.out.println("Lista após o número ser movido: ");
            System.out.println(list);
        }else{
            System.out.println("Indice inválido!");
        }

    }
}

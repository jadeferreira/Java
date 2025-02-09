package practice.AtiviVariados;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RemoverItem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);

        System.out.println("Qual número gostaria de remover da lista: ");
        int number = sc.nextInt();

        list.removeIf(item -> item == number);

        System.out.println("Lista após o número removido: ");
        System.out.println(list);
    }
}

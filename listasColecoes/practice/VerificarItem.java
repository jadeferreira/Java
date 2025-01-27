package practice;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class VerificarItem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> items = new LinkedList<>();
        items.add(59);
        items.add(28);
        items.add(31);
        items.add(65);
        items.add(13);
        System.out.println(items);

        System.out.println("Qual número gostaria de verificar nesta lista: ");
        int number = sc.nextInt();

        if (items.contains(number)) {
            System.out.println("Número " + number + " foi encontrado na lista!");
        } else {
            System.out.println("Número " + number + " não foi encontrado na lista!");
        }
    }
}

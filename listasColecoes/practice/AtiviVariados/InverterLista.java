package practice.AtiviVariados;

import java.util.ArrayList;
import java.util.List;

public class InverterLista {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Lisa");
        list.add("Ana");
        list.add("Lucas");
        list.add("Bob");
        list.add("Jack");
        System.out.println(list);

        System.out.println("Lista após inversão: ");
        System.out.println(list.reversed());

    }
}

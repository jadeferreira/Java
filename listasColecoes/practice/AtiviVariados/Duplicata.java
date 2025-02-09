package practice.AtiviVariados;

import java.util.ArrayList;
import java.util.List;

public class Duplicata {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Ana");
        list.add("Bob");
        list.add("Carlos");
        list.add("Luis");
        list.add("Pedro");

        List<String> duplicata = new ArrayList<>(list);

        System.out.println("Lista original: " + list);
        System.out.println("Duplicata: " + duplicata);

    }
}

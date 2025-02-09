package practice.AtiviVariados;

import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

public class ExcluirNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> nums = new LinkedList<>();
        nums.add(9);
        nums.add(13);
        nums.add(8);
        nums.add(15);
        nums.add(7);
        System.out.println(nums);
        System.out.println();

        nums.removeIf(item -> item < 10);

        System.out.println("Lista após números menores que 10 serem removidos: ");
        System.out.println(nums);

    }
}

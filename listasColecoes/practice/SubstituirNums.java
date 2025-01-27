package practice;

import java.util.ArrayList;
import java.util.List;

public class SubstituirNums {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(10);
        nums.add(20);
        nums.add(40);
        nums.add(50);
        nums.add(70);
        System.out.println(nums);
        System.out.println();

        for (Integer num : nums) {
            if(num > 20){
                nums.set(nums.indexOf(num), 0);
            }
        }

        System.out.println("Lista após substituir números maiores que 20 por 0: ");
        System.out.println(nums);

    }
}

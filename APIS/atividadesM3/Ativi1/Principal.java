package atividadesM3.Ativi1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para ser o dividendo: ");
        int dividendo = sc.nextInt();
        System.out.println("Digite um número para ser o divisor: ");
        int divisor = sc.nextInt();

        try{
            int total = dividendo/divisor;
            System.out.println("Resultado: " + total);
        }catch (ArithmeticException e){
            System.out.println("Divisão por zero não permitida!");
        }

    }
}

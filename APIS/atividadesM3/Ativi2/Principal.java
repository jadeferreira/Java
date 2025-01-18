package atividadesM3.Ativi2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma senha: ");
        String senha = sc.next();

        try {
            new ValidarSenha(senha);
            System.out.println("Senha válida!");
        } catch (SenhaInvalidaException e) {
            System.out.println(e.getMessage());
        }

    }
}

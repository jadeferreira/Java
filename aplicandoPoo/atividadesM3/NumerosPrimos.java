package atividadesM3;

public class NumerosPrimos {
    public boolean primo = true;

    public boolean verificarPrimalidade(int num) {
        if(num <= 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void listarPrimos(int limiteSuperior){
        System.out.println("Números primos até " + limiteSuperior + ": ");
        for (int i = 2; i <= limiteSuperior; i++) {
            if(verificarPrimalidade(i)){
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }

}

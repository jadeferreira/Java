package atividadesM3;

public class VerificadorPrimo extends NumerosPrimos{

    public void verificarPrimo(int num){
        if(verificarPrimalidade(num)){
            System.out.println(num + "\nPrimo válido");
        }else{
            System.out.println(num + "\nPrimo inválido");
        }
    }

}

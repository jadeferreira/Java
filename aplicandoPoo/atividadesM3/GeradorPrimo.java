package atividadesM3;

public class GeradorPrimo extends NumerosPrimos{

    public int gerarProximoPrimo(int ultimoPrimo){
        int proximoNum = ultimoPrimo + 1;

        while(!verificarPrimalidade(proximoNum)){
            proximoNum++;
        }
        return proximoNum;
    }
}

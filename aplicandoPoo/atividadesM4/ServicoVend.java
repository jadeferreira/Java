package atividadesM4;

public class ServicoVend extends Item implements Vendavel{

    public double calcPrecoTotal(int quant){
        System.out.println("Serviço: " + getNome());
        System.out.println("Horas de serviço: " + quant);
        double precoTotalServ = quant * getPreco();
        System.out.println("Preço das horas de serviço: " + precoTotalServ);
        return precoTotalServ;
    }

}

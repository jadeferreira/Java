package atividadesM1;

public class Carro {
    public String modelo;
    public int ano;
    public String cor;
    public int idade;

    public void imprimir(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    public int calcIdade(int anoAtual){
        idade = anoAtual - ano;
        System.out.println("Idade do carro: " + idade);
        return idade;
    }

}

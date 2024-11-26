package atividadesM4;

public class TabuadaMultiplicacao implements Tabuada{

    @Override
    public void mostrarTabuada(int numero) {
        System.out.println("Tabuada: ");
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}

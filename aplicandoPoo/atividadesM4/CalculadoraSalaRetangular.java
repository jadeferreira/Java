package atividadesM4;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    public void calcularArea(double altura, double largura) {
        double area = largura * altura;
        System.out.println("Area: " + area);
    }

    public void calcularPerimetro(double altura, double largura) {
        double perimetro = 2 * (largura + altura);
        System.out.println("Perimetro: " + perimetro);
    }
}

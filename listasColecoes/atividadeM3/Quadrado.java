package atividadeM3;

public class Quadrado implements Forma{
    public int lado;
    public double area;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return area = Math.pow(lado, 2);
    }


}

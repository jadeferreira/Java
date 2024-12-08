package atividadeM3;

public class Circulo implements Forma {
    public int raio;
    public double area;

    public Circulo(int raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return area = Math.PI * Math.pow(raio, 2);
    }

}

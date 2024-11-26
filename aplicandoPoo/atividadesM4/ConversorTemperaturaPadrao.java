package atividadesM4;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    @Override
    public double celsiusParaFahrenheit(double grausCelsius) {
        double fahrenheit = (grausCelsius * 9/5) + 32;
        System.out.println(grausCelsius + "° celsius para fahrenheit: " + fahrenheit + "°");
        return fahrenheit;
    }

    public double fahrenheitParaCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println(fahrenheit + "° fahrenheit para celsius: " + celsius + "°");
        return celsius;
    }
}

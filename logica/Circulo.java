package logica;

public class Circulo extends Figura {

    private double pi = Math.PI;

    @Override
    public String calcularArea() {
        double areaCirculo;
        areaCirculo = (pi * Math.pow(super.getRadioOaltura(), 2));

        return "El Area del circulo es de: " + areaCirculo + " cm2";
    }

    @Override
    public String calcularPerimetro() {
        double perimetroCirculo;
        perimetroCirculo = (2 * pi * super.getRadioOaltura());
        return "El Perimetro del circulo es de: " + perimetroCirculo + " cm";
    }

    @Override
    public String mostrar() {
        return calcularArea() + "\n " + calcularPerimetro();

    }

}

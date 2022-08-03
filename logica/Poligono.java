package logica;

public class Poligono extends Figura {

    private double radioOaltura;
    private double perimetroPoligono;

    @Override
    public String calcularArea() {
        double areaPoligono;
        areaPoligono = ((perimetroPoligono + super.getRadioOaltura()) / 2);

        return "El Area del Poligono es de: " + areaPoligono + " cm2";
    }

    @Override
    public String calcularPerimetro() {

        perimetroPoligono = super.getLongitudLados() * super.getNumeroLados();
        return "El Perimetro del Poligono es de: " + perimetroPoligono + " cm";
    }

    @Override
    public String mostrar() {
        return calcularArea() + "\n " + calcularPerimetro();

    }

}

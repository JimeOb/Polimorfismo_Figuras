package logica;

public abstract class Figura {

    private double radioOaltura;
    private double longitudLados;
    private double numeroLados;

    //Metodos abstractos 
    public abstract String calcularArea();

    public abstract String calcularPerimetro();

    public abstract String mostrar();

    public double getRadioOaltura() {
        return radioOaltura;
    }

    public double getLongitudLados() {
        return longitudLados;
    }

    public double getNumeroLados() {
        return numeroLados;
    }

    public void setRadioOaltura(double radioOaltura) {
        this.radioOaltura = radioOaltura;
    }

    public void setLongitudLados(double longitudLados) {
        this.longitudLados = longitudLados;
    }

    public void setNumeroLados(double numeroLados) {
        this.numeroLados = numeroLados;
    }

}

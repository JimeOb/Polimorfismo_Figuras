package presentacion;

import logica.*;
import java.util.Arrays;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class Modelo {

    private Adapter adaptador;
    private Scanner entradaEscaner;
    private double radioOaltura;
    private double longitudLados;
    private double numeroLados;
    private String figuraDeseada;
    private DateTimeFormatter dtf;
    private Ventana ventana;

    private Figura figuraGeneral;

    public Ventana getVentana() {
        if (ventana == null) {
            ventana = new Ventana(this);
        }
        return ventana;
    }

    public Adapter getAdapter() {
        if (adaptador == null) {
            adaptador = new Adapter();
        }
        return adaptador;
    }

    public void iniciar() {
        getVentana().setVisible(true);
        getVentana().setSize(689, 526);
        getVentana().getLbArea().setVisible(false);
        getVentana().getLbPerimetro().setVisible(false);
        getVentana().getJtxAltura().setVisible(false);
        getVentana().getJtxLados().setVisible(false);
        getVentana().getJtxLongitud().setVisible(false);
        getVentana().getJtxRadcir().setVisible(false);
        getVentana().getjLabel10().setVisible(false);
        getVentana().getjLabel7().setVisible(false);
        getVentana().getjLabel8().setVisible(false);
        getVentana().getjLabel9().setVisible(false);
    }

    public void leerDatosUsuario() {

        dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("...Fecha y Hora de ingreso: " + dtf.format(LocalDateTime.now()) + "...\n\n\n");
        entradaEscaner = new Scanner(System.in);
        System.out.print("     BIENVENIDO A LA CALCULADORA DE AREA Y PERIMETRO   \n\n");
        System.out.print("\nPor favor ingrese la figura geometrica de la que desea calcular las operaciones  ( 1 => Circulo)(2 => Poligono) ");
        figuraDeseada = entradaEscaner.nextLine();

        if (figuraDeseada.equals("1")) {
            System.out.println("\n << Por favor ingrese el Radio del circulo en cm >>");
            radioOaltura = Double.parseDouble(entradaEscaner.nextLine());
        } else {
            System.out.println("\n << Por favor ingrese la altura del poligono ( Línea que va del centro del polígono a cualquiera de sus vértices ) >>");
            radioOaltura = Double.parseDouble(entradaEscaner.nextLine());
            System.out.println("\n << Ingrese el numero de lados del poligono en cm: >>");
            numeroLados = Double.parseDouble(entradaEscaner.nextLine());
            System.out.println("\n << Ingrese la longitud de un lado del poligono en cm: >>");
            longitudLados = Double.parseDouble(entradaEscaner.nextLine());
        }

    }

    public void llamarAdapter_Polimorfismo() {

        figuraGeneral = getAdapter().elegirFigura(figuraDeseada);
        figuraGeneral.setRadioOaltura(radioOaltura);
        figuraGeneral.setNumeroLados(numeroLados);
        figuraGeneral.setLongitudLados(longitudLados);

    }

    public void mostrarConsulta() {

        System.out.println(" >> RESULTADO DEL CALCULO <<");

        System.out.print(figuraGeneral.mostrar() + "\n");
    }

    public void circulo() {
        if (getVentana().getBtnGraficar().isSelected()) {
        }
    }

    public void poligono() {

    }

    public void Seleccion() {

        if (getVentana().getRbtCirculo().isSelected() && getVentana().getRbtPoligono().isSelected()) {
            JOptionPane.showMessageDialog(null, "Seleciona solo uno");
            System.exit(0);
        } else if (getVentana().getRbtCirculo().isSelected()) {
            getVentana().getjLabel10().setVisible(true);
            getVentana().getJtxRadcir().setVisible(true);
            circulo();

        } else if (getVentana().getRbtPoligono().isSelected()) {
            getVentana().getjLabel7().setVisible(true);
            getVentana().getjLabel8().setVisible(true);
            getVentana().getjLabel9().setVisible(true);
            getVentana().getJtxAltura().setVisible(true);
            getVentana().getJtxLados().setVisible(true);
            getVentana().getJtxLongitud().setVisible(true);
            poligono();
        }

    }

}

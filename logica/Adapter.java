package logica;

public class Adapter {

    public Figura elegirFigura(String opcion) {

        if (opcion.equals("1")) {

            return new Circulo();

        } else if (opcion.equals("2")) {

            return new Poligono();

        }else
          throw new UnsupportedOperationException("Solo hay dos opciones"); 
    }

}

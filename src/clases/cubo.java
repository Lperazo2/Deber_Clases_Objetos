package clases;

public class cubo {

    int ancho;
    int alto;
    int profundo;

    public void volumen() {
        int respuesta = ancho * alto * profundo;
        System.out.println("El cubo a calcular tiene los siguientes datos ");
        System.out.println("Altura = " + alto);
        System.out.println("Ancho = " + ancho);
        System.out.println("Profundidad = " + profundo);
        System.out.println("El volumen del cubo es igual a " + respuesta);
    }

}

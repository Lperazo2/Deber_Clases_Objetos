package clases;

public class matematicas {

    public static void main(String[] args) {
        cubo ob1;
        ob1 = new cubo();
        ob1.alto=2;
        ob1.ancho=3;
        ob1.profundo=6;
        ob1.volumen();
        
        cuadrilatero ob2;
        ob2 = new cuadrilatero ();
        ob2.lado=12;
        ob2.area();
    }
   
}

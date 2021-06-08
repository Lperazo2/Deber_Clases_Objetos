package clases;    
public class cuadrilatero {
    int lado;
    public void area(){
        int r1 = lado*4;
        int r2 = lado*lado;
        System.out.println(" ");
        System.out.println("--------------------------------");
        System.out.println(" ");
        System.out.println("El cuadrilatero tiene como lado el valor de "+lado);
        System.out.println("El prerimetro del cuadrilatero es "+r1);
        System.out.println("El area del duadrilatero es "+r2);    
    }
}
package Figuras;

import java.util.Scanner;

public class PruebaFiguras {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int radio, baseRectangulo, alturaRectangulo, lado, baseTriangulo, alturaTriangulo;
        
        System.out.print("Ingrese el valor del radio del círculo ");
        radio = entrada.nextInt();
        Circulo figura1 = new Circulo(radio);
        
        System.out.print("Ingrese el valor de la base del rectángulo ");
        baseRectangulo = entrada.nextInt();
        System.out.print("Ingrese el valor de la altura del rectángulo ");
        alturaRectangulo = entrada.nextInt();
        Rectangulo figura2 = new Rectangulo(baseRectangulo, alturaRectangulo);
        
        System.out.print("Ingrese el valor del lado del cuadrado ");
        lado = entrada.nextInt();
        Cuadrado figura3 = new Cuadrado(lado);
        
        System.out.print("Ingrese el valor de la base del triángulo ");
        baseTriangulo = entrada.nextInt();
        System.out.print("Ingrese el valor de la altura del triángulo ");
        alturaTriangulo = entrada.nextInt();
        TrianguloRectangulo figura4 = new TrianguloRectangulo(baseTriangulo,alturaTriangulo);
        
        System.out.println("El área del círculo es = " + figura1.calcularArea());
        System.out.println("El perímetro del círculo es = " + figura1.calcularPerimetro());
        System.out.println();
        System.out.println("El área del rectángulo es = " + figura2.calcularArea());
        System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerimetro());
        System.out.println();
        System.out.println("El área del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerimetro());
        System.out.println();
        System.out.println("El área del triángulo es = " + figura4.calcularArea());
        System.out.println("El perímetro del triángulo es = " + figura4.calcularPerimetro());
        figura4.determinarTipoTriangulo();
    }
}

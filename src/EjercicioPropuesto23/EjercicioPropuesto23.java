package EjercicioPropuesto23;
import java.util.Scanner;

public class EjercicioPropuesto23 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double a, b, c, d;
		
		System.out.print("Ingrese la constante de x^2: ");
		a = input.nextDouble();
		
		System.out.print("Ingrese la constante de x: ");
		b = input.nextDouble();
		
		System.out.print("Ingrese la constante independiente: ");
		c = input.nextDouble();
		
		d = Math.pow(b,  2) - (4 * a * c);
		
		if(d < 0) {
			System.out.println("La ecuacion no tiene solucion en los reales");
		}else if(d == 0) {
			double solucion = (-1 * b) / (2 * a);
			
			System.out.println("La ecuacion tiene solucion unica");
			System.out.println("Solucion: " + solucion);
		}else {
			double solucion1, solucion2;
			
			solucion1 = (-1 * b + Math.sqrt(d)) / (2 * a);
			solucion2 = (-1 * b - Math.sqrt(d)) / (2 * a);
			
			System.out.println("La ecuacion tiene 2 soluciones");
			System.out.println("Solucion 1: " + solucion1);
			System.out.println("Solucion 2: " + solucion2);
		}

	}

}

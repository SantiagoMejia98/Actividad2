package EjercicioPropuesto19;
import java.util.Scanner;

public class EjercicioPropuesto19 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double lado, perimetro, altura, area;
		
		System.out.print("Ingrese el valor del lado del triangulo equilatero: ");
		lado = input.nextDouble();
		
		perimetro = 3 * lado;
		altura = lado * Math.sqrt(3) / 2;
		area = lado * altura / 2;
		
		System.out.println("Lado: " + lado);
		System.out.println("Perimetro: " + perimetro);
		System.out.println("Altura: " + altura);
		System.out.println("Area: " + area);

	}

}

package EjercicioPorpuesto21;
import java.util.Scanner;

public class EjercicioPorpuesto21 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double lado1, lado2, lado3, perimetro, semiperimetro, area;
		
		System.out.print("Ingrese el valor del lado 1: ");
		lado1 = input.nextDouble();
		
		System.out.print("Ingrese el valor del lado 2: ");
		lado2 = input.nextDouble();
		
		System.out.print("Ingrese el valor del lado 3: ");
		lado3 = input.nextDouble();
		
		if((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
			
			perimetro = lado1 + lado2 + lado3;
			semiperimetro = perimetro / 2;
			area =  Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
			
			System.out.println("Lados: " + lado1 + " , " + lado2 + " y " + lado3);
			System.out.println("Perimetro: " + perimetro);
			System.out.println("Semiperimetro: " + semiperimetro);
			System.out.println("Area: " + area);
			
		}else {
			System.out.println("Este triangulo no existe");
		}

	}

}

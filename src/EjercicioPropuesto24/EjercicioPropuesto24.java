package EjercicioPropuesto24;
import java.util.Scanner;

public class EjercicioPropuesto24 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double peso1, peso2, peso3, mayor;
		int esfera;
		
		System.out.print("Ingrese el peso de la esfera 1: ");
		peso1 = input.nextDouble();
		
		System.out.print("Ingrese el peso de la esfera 2: ");
		peso2 = input.nextDouble();
		
		System.out.print("Ingrese el peso de la esfera 3: ");
		peso3 = input.nextDouble();
		
		if(peso1 > peso2 && peso1 > peso3) {
			mayor = peso1;
			esfera = 1;
		}else if(peso2 > peso3) {
			mayor = peso2;
			esfera = 2;
		}else {
			mayor = peso3;
			esfera = 3;
		}
		
		System.out.println("La esfera de mayor peso es la esfera " + esfera + " con un peso de: " + mayor);

	}

}

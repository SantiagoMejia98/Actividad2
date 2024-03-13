package EjercicioResuelto11;
import java.util.Scanner;

public class EjercicioResuelto11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double numero1, numero2, numero3, mayor;
		
		System.out.print("Ingrese el numero 1: ");
		numero1 = input.nextDouble();
		
		System.out.print("Ingrese el numero 2: ");
		numero2 = input.nextDouble();
		
		System.out.print("Ingrese el numero 3: ");
		numero3 = input.nextDouble();
		
		if(numero1 > numero2 && numero1 > numero2) {
			mayor = numero1;
		}else if(numero2 > numero3) {
			mayor = numero2;
		}else {
			mayor =  numero3;
		}
		
		System.out.println("El numero mayor es: " + mayor);

	}

}

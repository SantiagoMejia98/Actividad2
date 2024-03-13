package EjercicioResuelto7;
import java.util.Scanner;

public class EjercicioResuelto7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double a, b;
		
		System.out.print("Ingrese el primer valor: ");
		a = input.nextDouble();
		
		System.out.print("Ingrese el segundo valor: ");
		b = input.nextDouble();
		
		if(a > b) {
			System.out.println("A es mayor que B");
		}else if(a == b) {
			System.out.println("A es igual que B");
		}else {
			System.out.println("A es menor que B");
		}

	}

}

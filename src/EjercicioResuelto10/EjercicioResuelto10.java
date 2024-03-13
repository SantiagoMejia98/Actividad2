package EjercicioResuelto10;
import java.util.Scanner;

public class EjercicioResuelto10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String nombre;
		int inscripcion, estrato;
		double patrimonio;
		double matricula = 50000;
		
		System.out.print("Ingrese el nombre: ");
		nombre = input.nextLine();
		
		System.out.print("Ingrese el numero de inscripcion: ");
		inscripcion = input.nextInt();
		
		System.out.print("Ingrese el patrimonio: ");
		patrimonio = input.nextDouble();
		
		System.out.print("Ingrese el estrato social: ");
		estrato = input.nextInt();
		
		if(patrimonio > 2000000 && estrato > 3) {
			matricula += patrimonio * 0.03;
		}
		
		System.out.println("El estudiante con numero de inscripcion " + inscripcion + " y nombre " + nombre + " debe pagar $" + matricula);
		
	}

}
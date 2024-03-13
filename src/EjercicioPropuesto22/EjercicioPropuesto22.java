package EjercicioPropuesto22;
import java.util.Scanner;

public class EjercicioPropuesto22 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double horasTrabajadas, valorHora, salario;
		String nombre;
		
		System.out.print("Ingrese el nombre: ");
		nombre = input.nextLine();
		
		System.out.print("Ingrese las horas trabajadas: ");
		horasTrabajadas = input.nextDouble();
		
		System.out.print("Ingrese el valor por hora: ");
		valorHora = input.nextDouble();
		
		salario = horasTrabajadas * valorHora;
		
		System.out.println("Nombre: " + nombre);
		
		if(salario > 450000) {
			System.out.println("Salario: " + salario);
		}

	}

}

package EjercicioResuelto12;
import java.util.Scanner;

public class EjercicioResuelto12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String nombre;
		double horasTrabajadas, valorHora, salario, horasExtras = 0, horasExcedentes = 0;
		
		
		System.out.print("Ingrese el nombre: ");
		nombre = input.nextLine();
		
		System.out.print("Ingrese las horas trabajadas: ");
		horasTrabajadas = input.nextDouble();
		
		System.out.print("Ingrese valor por hora: ");
		valorHora = input.nextDouble();
		
		if(horasTrabajadas > 40) {
			horasExtras = horasTrabajadas - 40;
			horasTrabajadas = 40;
			
			if(horasExtras > 8) {
				horasExcedentes = horasExtras - 8;
				horasExtras = 8;
			}
		}
		
		salario = horasTrabajadas * valorHora + horasExtras * valorHora * 2 + horasExcedentes * valorHora * 3;
		
		System.out.println("El trabajador " + nombre + " devengo : $" + salario);
		
	}

}

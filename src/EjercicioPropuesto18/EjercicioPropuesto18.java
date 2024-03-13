package EjercicioPropuesto18;
import java.util.Scanner;

public class EjercicioPropuesto18 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String nombre;
		int codigoEmpleado;
		double horasTrabajadas, valorHora, porcentajeRetencion, salarioBruto, salarioNeto;
		
		System.out.print("Ingrese el nombre: ");
		nombre = input.nextLine();
		
		System.out.print("Ingrese el codigo el empleado: ");
		codigoEmpleado = input.nextInt();
		
		System.out.print("Ingrese las horas trabajadas: ");
		horasTrabajadas = input.nextDouble();
		
		System.out.print("Ingrese el valor de la hora trabajada: ");
		valorHora = input.nextDouble();
		
		System.out.print("Ingrese el poircentaje de retencia de la fuente: ");
		porcentajeRetencion = input.nextDouble();
		
		salarioBruto = horasTrabajadas * valorHora;
		salarioNeto = salarioBruto * (1 - porcentajeRetencion / 100);
		
		System.out.println("Codigo del empleado: " + codigoEmpleado);
		System.out.println("Nombre del empleado: " + nombre);
		System.out.println("Salario bruto del empleado: " + salarioBruto);
		System.out.println("salario neto del empleado: " + salarioNeto);
	}

}

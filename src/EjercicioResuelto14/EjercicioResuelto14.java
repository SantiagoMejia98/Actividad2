package EjercicioResuelto14;
import java.util.Scanner;

public class EjercicioResuelto14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double ventas1, ventas2, ventas3, salario, salario1, salario2, salario3, totalVentas, porcentajeVentas;
		
		System.out.print("Ingrese las ventas del departamento 1: ");
		ventas1 = input.nextDouble();
		
		System.out.print("Ingrese las ventas del departamento 2: ");
		ventas2 = input.nextDouble();
		
		System.out.print("Ingrese las ventas del departamento 3: ");
		ventas3 = input.nextDouble();
		
		System.out.print("Ingrese el salario de los trabajadores: ");
		salario = input.nextDouble();
		
		totalVentas = ventas1 + ventas2 + ventas3;
		porcentajeVentas = 0.33 * totalVentas;
		
		if(ventas1 > porcentajeVentas) {
			salario1 = salario * 1.20;
		}else {
			salario1 = salario;
		}
		
		if(ventas2 > porcentajeVentas) {
			salario2 = salario * 1.20;
		}else {
			salario2 = salario;
		}
		
		if(ventas3 > porcentajeVentas) {
			salario3 = salario * 1.20;
		}else {
			salario3 = salario;
		}
		
		System.out.println("Salario de vendedores del departamento 1: $" + salario1);
		System.out.println("Salario de vendedores del departamento 2: $" + salario2);
		System.out.println("Salario de vendedores del departamento 3: $" + salario3);
	}

}

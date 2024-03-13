package EjercicioResuelto13;
import java.util.Scanner;

public class EjercicioResuelto13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String color;
		double valor, pago, descuento;
		
		System.out.print("Ingrese el color: ");
		color = input.nextLine();
		color = color.toLowerCase();
		
		System.out.print("Ingrese el valor de la compra: ");
		valor = input.nextDouble();
		
		if(color.equals("blanco")) {
			descuento = 0;
		}else if(color.equals("verde")) {
			descuento = 10;
		}else if(color.equals("amarillo")) {
			descuento = 25;
		}else if(color.equals("azul")){
			descuento = 50;
		}else {
			descuento = 100;
		}
		
		pago = valor * ( 1 - descuento / 100);
		
		System.out.println("El cliente debe pagar: $" + pago);
		
	}

}
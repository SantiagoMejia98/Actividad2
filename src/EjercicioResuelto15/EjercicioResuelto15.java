package EjercicioResuelto15;
import java.util.Scanner;

public class EjercicioResuelto15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double pesoA, pesoB, pesoC, pesoD;
		
		System.out.print("Ingrese el peso de la esfera A:");
        pesoA = input.nextDouble();
        
        System.out.print("Ingrese el peso de la esfera B:");
        pesoB = input.nextDouble();
        
        System.out.print("Ingrese el peso de la esfera C:");
        pesoC = input.nextDouble();
        
        System.out.print("Ingrese el peso de la esfera D:");
        pesoD = input.nextDouble();

        
        if(pesoA == pesoB && pesoA == pesoC) {
        	
        	if(pesoD > pesoA) {
        		System.out.println("La esfera D es diferente y de mayor peso.");
        	}else {
        		System.out.println("La esfera D es diferente y de menor peso.");
        	}
        	
        }else if(pesoA == pesoB && pesoA == pesoD) {
        	
        	if(pesoC > pesoA) {
        		System.out.println("La esfera C es diferente y de mayor peso.");
        	}else {
        		System.out.println("La esfera C es diferente y de menor peso.");
        	}
        	
        }else if(pesoA == pesoC && pesoA == pesoD) {
        	
        	if(pesoB > pesoA) {
        		System.out.println("La esfera B es diferente y de mayor peso.");
        	}else {
        		System.out.println("La esfera B es diferente y de menor peso.");
        	}
        	
        }else {
        	
        	if(pesoA > pesoB) {
        		System.out.println("La esfera A es diferente y de mayor peso.");
        	}else {
        		System.out.println("La esfera A es diferente y de menor peso.");
        	}
        	
        }

	}

}

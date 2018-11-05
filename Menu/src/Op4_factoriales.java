import java.util.Scanner;

public class Op4_factoriales {

	public static void main(String[] args) {
		
		
		//Calcular el factorial de un número
		// n! = 1 x 2 x 3 x 4 x...x (n-1) x n
		
		
		Scanner usuario = new Scanner(System.in);
		
		double factorial = 1;	//Defino la variable en "double" para que soporte más bytes
		
		System.out.println("Introduzca dato: ");
		double dato = usuario.nextDouble();
		
		
		while (dato!=0) {
			factorial = factorial*dato;
			dato--;
		}
		System.out.println(factorial);
		
	
		
		

	}

}

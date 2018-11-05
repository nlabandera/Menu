import java.util.Scanner;

public class Op5_triangulo {

	public static void main(String[] args) {
		
		Scanner usuario = new Scanner(System.in);
		
		Integer medida;
		int alto;
		int ancho;
		
		
		
		System.out.println("Intruduzca medida: ");
		medida = usuario.nextInt();
		
		
		
		for (alto = 0 ; alto<medida ; alto++) {
			
			
				for(ancho = 1; ancho <= alto ; ancho++) {
					System.out.print("*");
					
					
				}
			
			System.out.println("*");	
		}
		
	}

}

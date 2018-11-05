

//FUNCIONA!

import java.util.Scanner;


public class Op8_tablasmultiplicar {

	public static void main(String[] args) {
		
		Scanner usuario = new Scanner(System.in);
		Integer num;
		int x=0;
		
		do {
			System.out.println("Eliga la tabla de multiplicar: ");
			num = usuario.nextInt();
		
			
			
			if(num<=10){
				for(x=0 ; x<=10 ; x++) {
					System.out.println(num*x);
				}
			}
			
			else {
				System.out.println("Solo del 1 al 10");
						
			}
			
			
		}
		while(num!=x);
		
		
			

	}

}

import java.util.Scanner;

public class Op2_NumerosDigitos {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Integer x;
		String numero;
		
		do {
			
		
			System.out.println("Introduce un número positivo: ");
		
			x = teclado.nextInt();
		
			if (x < 0) 
			
				System.out.println("Por favor, introduce un número positivo.");
		}
		while(x<0);	
		
			
				System.out.println("Introduce un dígito: ");
		
				String digito = teclado.next();
		
				numero = x.toString();
		
				char numbers2[] = numero.toCharArray();
		
				int cont = 0;
		
				for(int j = 0; numero.length() > j; j++ ) {
				
			
					if (numbers2[j]== digito.charAt(0)){
				
						cont++;
				
			}		
		}
		
		 if (cont <= 0) {
				
				System.out.println("Este digito no está en el número.\n");
				
				
			}
			
		else 
				
				System.out.println("Este digito está en el número " + cont + " veces");
			
		
		//break;
		
		
		
		
	}

}

import java.util.Scanner;

public class Op2_NumerosDigitos {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Integer x;
		String numero;
		
		do {
			
		
			System.out.println("Introduce un n�mero positivo: ");
		
			x = teclado.nextInt();
		
			if (x < 0) 
			
				System.out.println("Por favor, introduce un n�mero positivo.");
		}
		while(x<0);	
		
			
				System.out.println("Introduce un d�gito: ");
		
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
				
				System.out.println("Este digito no est� en el n�mero.\n");
				
				
			}
			
		else 
				
				System.out.println("Este digito est� en el n�mero " + cont + " veces");
			
		
		//break;
		
		
		
		
	}

}

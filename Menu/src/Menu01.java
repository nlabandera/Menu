import java.util.Scanner;
//import java.lang.Object;

public class Menu01 
{


	public static void main(String[] args) 
	{
		
		
		boolean finish = false;
		
		while(!finish) 
		{
		
			System.out.println
			(
				"\n" + "Opcion 1: Leer un numero positivo y determinar cuantos d�gitos tiene. Se descartan los n�meros negativos.\n"
				+ "Opcion 2: Leer un n�mero positivo y un d�gito y decidir si el d�gito aparece o no en el n�mero. En caso de que aparezca decidir cuantas veces.\n"
				+ "Opci�n 3: Leer un numero positivo y mostrar el n�mero invertido.\n"
				+ "Opci�n 4: Leer un n�mero positivo y calcular el factorial de �ste.\n"
				+ "Opci�n 5: Leer un n�mero y que muestre un triangulo creciente. \n"
				+ "Opci�n 6: Leer un n�mero binario y pasarlo a decimales \n"
				+ "Opci�n 7: Leer una frase y decir cuantas veces aparecen las vocales en la frase \n"
				+ "Opci�n 8: Tablas de multiplicar del 1 al 10. \n"
				+ "Opci�n 9: Salir \n"
			);	
				
			Scanner usuario = new Scanner (System.in);
			System.out.println("Introduzca orden:" );
			int orden = usuario.nextInt();
			
			switch (orden)
			
			{
			
				
			case 1:
			
				
				int num;
				int cont=0;
				
				
				
				do
				{
					System.out.println("Introduzca n�mero:");
					num = usuario.nextInt();
				
				
					if (num<=0)
					System.out.println("Introduzca numero positivo");
					
					
				
				}
				while (num<0);
				
				while(num!=0)
				{
					num = num/10;
					cont++;
					
				}
				System.out.println(cont);
				
				
				break;
				
	
			
			case 2:
				
				Integer x;
				String numero;
				
				do {
					
				
					System.out.println("Introduce un n�mero positivo: ");
				
					x = usuario.nextInt();
				
					if (x < 0) 
					
						System.out.println("Por favor, introduce un n�mero positivo.");
				}
				while(x<0);	
				
					
						System.out.println("Introduce un d�gito: ");
				
						String digito = usuario.next();
				
						numero = x.toString();
				
						char numbers2[] = numero.toCharArray();
				
						int cont1 = 0;
				
						for(int j = 0; numero.length() > j; j++ ) {
						
					
							if (numbers2[j]== digito.charAt(0)){
						
								cont1++;
						
					}		
				}
				
				 if (cont1 <= 0) {
						
						System.out.println("Este digito no est� en el n�mero.\n");
						
						
					}
					
				else 
						
						System.out.println("Este digito est� en el n�mero " + cont1 + " veces");
					
					
				
				break;
				
				
			
			case 3:
				
				Integer n = 0;
				int i;
				
				 
						Integer n3 = 0;
						int i3;
						
						 
							
						//Scanner usuario = new Scanner(System.in);
						
						int num3;
						
						do
						{
							System.out.println("Introduzca n�mero:");
							num3 = usuario.nextInt();
							
							if (num3<=0)
								System.out.println("Introduzca num positivo");
						}
						while(num3<0);
						
						while(num3!=0)
						{
							System.out.print(num3%10);
							num3 = num3/10;
					
							
						}
				 
				break;
				
				
				 
				
			case 4:
				
				double factorial = 1;	//Defino la variable en "double" para que soporte m�s bytes
				
				System.out.println("Introduzca dato: ");
				double dato = usuario.nextDouble();
				
				
				while (dato!=0) {
					factorial = factorial*dato;
					dato--;
				}
				System.out.println(factorial);
				
				break;
				
			
			case 5:
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
			
				break;
				
				
				
			case 6:
				
				//Definimos variales
				
				
				Integer num1; 			
				String numero1; 			
				
				System.out.println("Introduce n�mero binario:");
				num1 = usuario.nextInt();
				
				//Convertimos el n�mero del usuario en String
				
				numero1 = num1.toString();
				
				numero1 = numero1.trim();	//Quita los espacios en blanco que puedan ocurrir
				
				int multiplicador = 0;		//Definimos una variable multiplicadora para hacer el calculo del num binario
				double valorDecimal = 0;	//Definimos esta variable para saber el numero decirmal del binario.
				
				fuera: for (int i1= numero1.length() -1; i1>=0; i1--) 
				{
					
					if(numero1.charAt(i1) !='0' && numero1.charAt(i1) !='1' ) 
					{
						
						System.out.println("Este no es un n�mero binario (0 y 1)");
						break fuera;
					
					}
					
					if(numero1.charAt(i1)=='1')
					{
						valorDecimal = valorDecimal + Math.pow(2,  multiplicador);
					}
					
					multiplicador++;
					
				}
				
				System.out.println("El valor decimal de " + numero1 + " es " + valorDecimal);
				
			
				break;
				
				
				
			case 7:
				
				usuario.nextLine();
				System.out.println("Introduzca frase:");
				String frase = usuario.nextLine();
					
				
				String vocales = "aeiou";	
				int contador[]= {0,0,0,0,0};
				int f;
				
				
				
			
					
					 for(f=0;f<frase.length();f++)
				        {
				            // recorremos las vocales para comparar con cada una de las letras
						 
				            for(int j=0;j<vocales.length();j++)
				            {
				                if(frase.charAt(f)==vocales.charAt(j))
				                {
				                    // aumentamos el contador para la vocal encontrada
				                	
				                    contador[j]++;
				                }
				            }
				        }
				 
					 for(f=0;f<vocales.length();f++)
				        {
				            System.out.println("la letra "+vocales.charAt(f)+" aparece"+": "+contador[f]+" veces");
				        }
				  
				
				
			break;
		
				
			case 8:
				
				Integer num2;
				int z=0;
				
				
				do {
					System.out.print("Eliga la tabla de multiplicar: \n" 
							+ "Si quiere salir, pulse 0 o cualquier num superior a 10. \n");
					
						num2 = usuario.nextInt();
				
					
					
					if(num2<=10 && num2>0){
						for(z=0 ; z<=10 ; z++) {
							System.out.println(num2*z);
						}
					}
					
					if (num2>10 || num2==0) {
						System.out.println("Solo del 1 al 10");
						break;		
					}
					
					
				}
				while(num2!=z);
				
				
				break;
				

			case 9: 
				
				System.out.println("Salir");
				
				finish = true;
				
				break;
				
			
				
				
			}
			
		}
		
	}
	
}
				
				
			
		
	

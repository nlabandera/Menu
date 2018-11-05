import java.util.Scanner;

public class Op7_Vocales {

	public static void main(String[] args) {
		Scanner usuario = new Scanner(System.in);
		
		System.out.println("Introduzca frase:");
		String frase = usuario.next();
			
		
		String vocales = "aeiou";	
		int contador[]= {0,0,0,0,0};
		int x=0;
		int j=0;
			
			 for(x=0;x<frase.length();x++)
		        {
		            // recorremos las vocales para comparar con cada una de las letras
		            for(j=0;j<vocales.length();j++)
		            {
		                if(frase.charAt(x)==vocales.charAt(j))
		                {
		                    // aumentamos el contador para la vocal encontrada
		                    contador[j]++;
		                }
		            }
		        }
		 
		        for(x=0;x<vocales.length();x++)
		        {
		            System.out.println("la letra "+vocales.charAt(x)+" aparece"+": "+contador[x]+" veces");
		        }
		   
			}
		 
		}

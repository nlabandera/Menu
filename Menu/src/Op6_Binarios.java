import java.util.Scanner;
import java.lang.Object;
import java.lang.Character;

public class Op6_Binarios 
{

	public static void main(String[] args) 
	{
		//Definimos variales
		
		Scanner usuario = new Scanner (System.in);
		Integer num; 			
		String numero; 			
		
		System.out.println("Introduce número binario:");
		num = usuario.nextInt();
		
		//Convertimos el número del usuario en String
		
		numero = num.toString();
		
		numero = numero.trim();	//Quita los espacios en blanco que puedan ocurrir
		
		int multiplicador = 0;		//Definimos una variable multiplicadora para hacer el calculo del num binario
		double valorDecimal = 0;	//Definimos esta variable para saber el numero decirmal del binario.
		
		fuera: for (int i= numero.length() -1; i>=0; i--) 
		{
			
			if(numero.charAt(i) !='0' && numero.charAt(i) !='1' ) 
			{
				
				System.out.println("Este no es un número binario (0 y 1)");
				break fuera;
			
			}
			
			if(numero.charAt(i)=='1')
			{
				valorDecimal = valorDecimal + Math.pow(2,  multiplicador);
			}
			
			multiplicador++;
			
		}
		
		System.out.println("El valor decimal de " + numero + " es " + valorDecimal);
		
	
		
		
		
		
		

	}

}

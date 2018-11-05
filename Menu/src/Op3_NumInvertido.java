import java.util.Scanner;

public class Op3_NumInvertido {

	public static void main(String[] args) 
	{
		
		Integer n = 0;
		int i;
		
		 
			
		Scanner usuario = new Scanner(System.in);
		
		int num;
		
		do
		{
			System.out.println("Introduzca número:");
			num = usuario.nextInt();
			
			if (num<=0)
				System.out.println("Introduzca num positivo");
		}
		while(num<0);
		
		while(num!=0)
		{
			System.out.print(num%10);
			num = num/10;
	
			
		}
		
		
	
		 
	}
	
}

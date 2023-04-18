package metodos;

import java.util.Scanner;

public class opc_main_metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Ingrese el primer numero:");
		int a = scan.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		int b = scan.nextInt();
		System.out.println("La suma es :"+suma(a,b));
		System.out.println("La resta es :"+resta(a,b));
		System.out.println("La multiplicacion es :"+producto(a,b));
		System.out.println("La division es :"+cociente(a,b));
		

	}
	
	public static int suma(int a, int b)
	{
		int sum = a+b;
		return sum;
	}
	public static int resta(int a, int b)
	{
		int resta = a-b;
		return resta;
	}
	public static int producto(int a, int b)
	{
		int pro = a*b;
		return pro;
	}
	public static int cociente(int a, int b)
	{
		int div = a/b;
		return div;
	}
}

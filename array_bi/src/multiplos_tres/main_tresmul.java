package multiplos_tres;

import java.util.Scanner;

public class main_tresmul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

	      int[] arr = new int[20];

	      System.out.println("Ingrese 20 números:");

	      for (int i = 0; i < 20; i++) {
	         arr[i] = input.nextInt();
	      }

	      System.out.println("Elementos que contienen números múltiplos de 3:");
	      for (int i = 0; i < 20; i++) {
	          if (arr[i] % 3 == 0) {
	             System.out.print(arr[i] + " ");
	          }
	       }

	}

}

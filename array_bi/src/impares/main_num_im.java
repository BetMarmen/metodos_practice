package impares;

import java.util.Scanner;

public class main_num_im {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

	      int[] arr = new int[20];

	      System.out.println("Ingrese 20 números:");

	      for (int i = 0; i < 20; i++) {
	         arr[i] = input.nextInt();
	      }

	      System.out.println("Elementos que ocupan posiciones impares:");

	      for (int i = 1; i < 20; i += 2) {
	         System.out.print(arr[i] + " ");
	      }

	}

}

package suma_dos_arra_bi;

import java.util.Scanner;

public class main_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	      System.out.print("Ingrese el número de filas: ");
	      int rows = input.nextInt();
	      System.out.print("Ingrese el número de columnas: ");
	      int cols = input.nextInt();

	      int[][] A = new int[rows][cols];
	      int[][] B = new int[rows][cols];
	      
	      System.out.println("Ingrese los elementos de la matriz A:");
	      for (int i = 0; i < rows; i++) {
	         for (int j = 0; j < cols; j++) {
	            A[i][j] = input.nextInt();
	         }
	      }

	      System.out.println("Ingrese los elementos de la matriz B:");
	      for (int i = 0; i < rows; i++) {
	         for (int j = 0; j < cols; j++) {
	            B[i][j] = input.nextInt();
	         }
	      }
	      
	      int[][] sum = new int[rows][cols];
	      int[][] sum2 = new int[rows][cols];

	      // Suma de A y B
	      for (int i = 0; i < rows; i++) {
	         for (int j = 0; j < cols; j++) {
	            sum[i][j] = A[i][j] + B[i][j];
	         }
	      }

	      // Suma de 2A y 3B
	      for (int i = 0; i < rows; i++) {
	         for (int j = 0; j < cols; j++) {
	            sum2[i][j] = (2 * A[i][j]) + (3 * B[i][j]);
	         }
	      }
	      
	      System.out.println("La suma de A y B es:");
	      for (int i = 0; i < rows; i++) {
	         for (int j = 0; j < cols; j++) {
	            System.out.print(sum[i][j] + " ");
	         }
	         System.out.println();
	      }

	      // Imprimir la suma de 2A y 3B
	      System.out.println("La suma de 2A y 3B es:");
	      for (int i = 0; i < rows; i++) {
	         for (int j = 0; j < cols; j++) {
	            System.out.print(sum2[i][j] + " ");
	         }
	         System.out.println();
	      }
	}

}

package array_bi;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	      System.out.println("Ingrese el valor de N: ");
	      int N = input.nextInt();

	      int[][] arr = new int[N][N];
	      System.out.println("Ingrese los elementos de la matriz:");
	      for (int i = 0; i < N; i++) {
	         for (int j = 0; j < N; j++) {
	            arr[i][j] = input.nextInt();
	         }
	      }

	      System.out.println("La matriz ingresada es:");
	      for (int i = 0; i < N; i++) {
	         for (int j = 0; j < N; j++) {
	            System.out.print(arr[i][j] + " ");
	         }
	         System.out.println();
	                                  }
	      System.out.println("Los elementos sobre la diagonal son:");
	      for (int i = 0; i < N; i++) {
	         for (int j = i+1; j < N; j++) {
	            System.out.print(arr[i][j] + " ");
	         }
	      }
	      System.out.println("Los elementos encima de la diagonal son:");
	      for (int i = 0; i < N; i++) {
	         for (int j = i; j < N; j++) {
	            System.out.print(arr[i][j] + " ");
	         }
	      }
	      for (int i = 0; i < arr.length; i++) {
	    	    for (int j = 0; j < arr[i].length; j++) {
	    	        if (i == j) {
	    	            System.out.print(arr[i][j] + " ");
	    	        }
	    	    }
	      }
	      for (int i = 0; i < arr.length; i++) {
	    	    for (int j = 0; j < arr[i].length; j++) {
	    	        if (i < j) {
	    	            System.out.print(arr[i][j] + " ");
	    	        }
	    	    }
}
	      for (int i = 0; i < arr.length; i++) {
	    	    for (int j = 0; j < arr[i].length; j++) {
	    	        if (i > j || i < j) {
	    	            System.out.print(arr[i][j] + " ");
	    	        }
	    	    }
	    	}
	}
	}

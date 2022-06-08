package application;

import java.util.Locale;
import java.util.Scanner;

public class GeneralMatrix {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the order of the matrix? ");
		int n = sc.nextInt();
		
		double[][] mat = new double[n][n];
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				System.out.printf("Element [%d, %d]: ", i, j);
				mat[i][j] = sc.nextDouble();
			}
		}
		System.out.printf("\nSum of positives: ");
		double sum = 0.0;
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if(mat[i][j] > 0) {
					sum += mat[i][j];
				}
			}
		}
		System.out.print(sum);
		System.out.println();
		
		System.out.printf("\nChoose one row: ");
		int row = sc.nextInt();
		System.out.print("Choosen line: ");
		for(int i=0; i<mat.length; i++) {
			System.out.print(mat[row][i] + " ");
		}
		
		System.out.printf("\n\nChoose one column: ");
		int column = sc.nextInt();
		System.out.print("Choosen line: ");
		for(int i=0; i<mat.length; i++) {
			System.out.print(mat[i][column] + " ");
		}
		
		System.out.printf("\n\nMain diagonal: ");
		for(int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.printf("\n\nAltered matrix: \n");
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if(mat[i][j] < 0) {
					mat[i][j] = Math.pow(mat[i][j], 2);
				}
			System.out.print(mat[i][j] + " ");
			}
		System.out.println();
		}
		sc.close();
	}

}

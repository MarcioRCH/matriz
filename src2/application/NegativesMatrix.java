package application;

import java.util.Locale;
import java.util.Scanner;

public class NegativesMatrix {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rows in the matrix: ");
		int row = sc.nextInt();
		System.out.print("How many columns in the matrix: ");
		int column = sc.nextInt();
		
		int[][] mat = new int[row][column];
		
		for(int i=0; i<row; i++) {
			for(int j=0 ;j<column; j++) {
				System.out.printf("Element: [%d, %d]: ", i, j);
				mat[i][j] = sc.nextInt();
			}
		}	
		System.out.printf("\nNegatives values:\n");
		int count = 0;
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				if(mat[i][j] < 0) {
					count = mat[i][j];
					System.out.println(count);
				}
			}
		}
		sc.close();
	}

}

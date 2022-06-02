package application;

import java.util.Locale;
import java.util.Scanner;

public class NegativeDiagonals {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the array order? ");
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				System.out.printf("Element: [%d, %d]: ", i, j);
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal: ");		
		for(int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		int count = 0;
		System.out.printf("\nNumber of negatives: ");
		for(int i=0; i<mat.length; i++) {
			for(int j=0 ; j<mat[i].length; j++) {
				if(mat[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.println(count);
		sc.close();
	}

}

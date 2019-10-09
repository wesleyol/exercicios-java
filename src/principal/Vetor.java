package principal;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de alturas que ser�o lidas: ");
		int n = sc.nextInt();
		double soma = 0;
		double[] vect = new double[n];
		
		
		for (int i=0; i<n; i++) {
			System.out.printf("Informe a %d� altura: ", i+1);
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}

		System.out.println();
		System.out.printf("A m�dida das alturas �: %.2f", soma/n);
		sc.close();
	}

}

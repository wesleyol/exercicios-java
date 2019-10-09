package principal;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Exercicios_4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;

		System.out.print("Informe o número da Conta: ");
		int numero = sc.nextInt();
		System.out.print("Informe o nome do titular da Conta: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Deseja fazer um depósito inicial (y/n)? ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Informe o valor do depósito inicial: ");
			double depositoIncial = sc.nextDouble();
			conta = new Conta(numero, titular, depositoIncial);
		}
		else {
			conta = new Conta(numero, titular);
		}
		
		System.out.println();
		System.out.println("Dados da Conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Informe o valor do deposito: ");
		double depositaValor = sc.nextDouble();
		conta.deposita(depositaValor);
		System.out.println("Dados atualizados da Conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Informe o valor do saque: ");
		double saqueValor = sc.nextDouble();
		conta.saque(saqueValor);
		System.out.println("Dados atualizados da Conta:");
		System.out.println(conta);
		
		double saldoatual = conta.getSaldo();
		System.out.println("Saldo novo: "+ saldoatual);
		
		sc.close();
	}
}
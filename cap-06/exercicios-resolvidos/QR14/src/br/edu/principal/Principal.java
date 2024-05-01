package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nome[] = new String[5];
		double sal[] = new double[5], novo_sal = 0.0;
		int quant[] = new int[5], i;
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < 5; i++) {
		System.out.println("Nome do funcionário " + (i+1) + ": ");
		nome[i] = sc.next();
		System.out.println("Salário do funcionário " + (i+1) + ": ");
		sal[i] = sc.nextDouble();
		System.out.println("Quantidade de tempo de serviço do funcionário " + (i+1) + ": ");
		quant[i] = sc.nextInt();
		}
		System.out.println("\n");
		System.out.println("Funcionários que não terão aumento: ");
		System.out.println("\n");
		for (i = 0; i < 5; i++) {
		if ((quant[i] <= 5) && (sal[i] >= 800)) {
		System.out.println("Funcionário " + (i+1) + ": " + nome[i]);
		}
		}
		System.out.println("\n");
		System.out.println("Funcionários que terão aumento: ");
		System.out.println("\n");
		for (i = 0; i < 5; i++) {
		if ((quant[i] > 5) || (sal[i] < 800)) {
		if ((quant[i] > 5) && (sal[i] < 800)) {
		novo_sal = sal[i] + (sal[i] * 35.0/100.0);
		} else if (quant[i] > 5) {
		novo_sal = sal[i] + (sal[i] * 25.0/100.0);
		} else {
		novo_sal = sal[i] + (sal[i] * 15.0/100.0);
		}
		System.out.println("Funcionário " + (i+1) + ": " + nome[i] + "\nNovo salário: " +
		novo_sal);
		}
	}
		sc.close();
	}
}


package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte count = 1;
		int[] vet = new int[10];
		int i;
		System.out.println("Preencha o vetor.\n");
		for (i = 0; i < 10; i++) {
		System.out.println("Preencha o valor do "+count+"º endereço do segundo vetor com um número inteiro.");
		vet[i] = sc.nextInt();
		count ++;
		}
		boolean found = false;
		System.out.println("Números maiores que 50:\n");
		for (i = 0; i < 10; i++) {
		if (vet[i] > 50) {
		System.out.println("Número: "+vet[i]+" Endereço: "+i);
		found = true;
		}
		}
		if (found == false) {
		System.out.println("Não existem números maiores que 50 no vetor.");
		}
		sc.close();
	}
}

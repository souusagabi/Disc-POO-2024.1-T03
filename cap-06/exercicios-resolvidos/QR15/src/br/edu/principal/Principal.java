package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int[] vet1 = new int[10];
		int[] vet2 = new int[5];
		int i, j;
		boolean achou;
		Scanner sc = new Scanner(System.in);
		for (i = 0; i<10; i++) {
		System.out.println("Digite um número para vet1: ");
		vet1[i] = sc.nextInt();
		}
		for (i = 0; i<5; i++) {
		System.out.println("Digite um número para vet2: ");
		vet2[i] = sc.nextInt();
		}
		System.out.println("");
		for (i = 0; i<10; i++) {
		achou = false;
		System.out.println("Número " + vet1[i]);
		for (j = 0; j<5; j++) {
		if (vet1[i] % vet2[j] == 0) {
		System.out.println("Divisível por " + vet2[j] + " na posição " + j);
		achou = true;
		}
		}
		if (achou == false) {
		System.out.println("Não possui divisores no segundo vetor");
		System.out.println("");
		}
		}
		sc.close();
		}
	}


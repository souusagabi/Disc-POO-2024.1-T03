package br.edu.principal;

import br.edu.NumerosPerfeitos.*;

public class Principal {

	public static void main(String[] args) {
		int vet[] = new int [6];
		int i;
		vet = Perfeitos.perfeitos(vet);
		for (i=0; i<3; i++) {
		System.out.println(vet[i]);
	}
	}
}

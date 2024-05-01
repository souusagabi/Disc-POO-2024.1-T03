package br.edu.NumerosPerfeitos;

public class Perfeitos {
	public static int[] perfeitos(int v[]) {
		int a, r, num, soma;
		int cont;
		cont = 0;
		num = 1;
		while (cont < 3) {
		soma = 0;
		for (a = 1; a <= num-1; a++) {
		r = num % a;
		if (r == 0) {
		soma += a;
		}
		}
		if (soma == num) {
		v[cont] = num;
		cont++;
		}
		num++;
		}
		return v;
		}

}

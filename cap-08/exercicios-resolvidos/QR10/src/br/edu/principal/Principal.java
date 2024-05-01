package br.edu.principal;

import java.util.Scanner;

public class Principal {

	Scanner sc = new Scanner(System.in);
	public static double sequencia(int n) {
	int a, b, f;
	double seq;
	seq = 1;
	for (a = 1; a <= n; a++) {
	f = 1;
	for (b = 1; b <= a; b++) {
	f *= b;
	}
	seq += 1. / f;
	}
	return seq;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int num;
	double s;
	System.out.println("Informe um número inteiro e positivo: ");
	num = sc.nextInt();
	s = sequencia(num);
	System.out.println("Valor da sequência: " + s);
	sc.close();
	}
	}


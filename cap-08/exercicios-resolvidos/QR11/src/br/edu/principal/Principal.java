package br.edu.principal;

import java.util.Scanner;

public class Principal {

	static Scanner sc = new Scanner(System.in);
	public static void leitura(String sexo[], String olhos[], String cabelos[], int idade[]) {
	int x;
	for(x = 0; x < 5; x++) {
	do {
	System.out.println("Qual o seu sexo?");
	System.out.println("Digite M para masculino ou F para feminino:");
	sexo[x] = sc.next();
	}while((!sexo[x].equals("F") && !sexo[x].equals("M")));
	do {
	System.out.println("A cor do seu olho é azul ou castanho?");
	System.out.println("Digite A para azul ou C para castanho:");
	olhos[x] = sc.next();
	}while((!olhos[x].equals("C") && !olhos[x].equals("A")));
	do {
	System.out.println("A cor do seu cabelo é louro, preto ou castanho?");
	System.out.println("Digite L para louro ou P para preto ou C para castanho:");
	cabelos[x] = sc.next();
	}while((!cabelos[x].equals("C") && !cabelos[x].equals("L") &&
	!cabelos[x].equals("P")));
	System.out.println("Digite sua idade:");
	idade[x] = sc.nextInt();
	}
	}
	public static int media_idade(String olhos[], String cabelos[],int idade[]) {
	int i, cont, soma, media;
	soma = 0;
	cont = 0;
	for(i = 0; i < 5; i++) {
	if((olhos[i].equals("C") && cabelos[i].equals("P"))) {
	soma = soma + idade[i];
	cont = cont + 1;
	}
	}
	if(cont == 0) {
	media = 0;
	}else {
	media = soma / cont;
	}
	System.out.println("Média de idade das pessoas com olhos castanhos e cabelos pretos:");
	return media;
	}
	public static int maior_idade(int idade[]) {
	int i, maior = 0;
	for(i = 0; i < 5; i++) {
	if(i == 0) {
	maior = idade[i];
	}else {
	if(idade[i] > maior) {
	maior = idade[i];
	}
	}
	}
	System.out.println("Maior idade entre os habitantes:");
	return maior;
	}
	public static int qt_individuos(String sexo[], String olhos[], String cabelos[], int idade[])
	{
	int i, qtd;
	qtd = 0;
	for(i = 0; i < 5; i++) {
	if(sexo[i].equals("F") && idade[i] >= 18 && idade[i] <= 35 &&
	olhos[i].equals("A") && cabelos[i].equals("L")) {
	qtd = qtd + 1;
	}
	}
	System.out.println("Quantidade de indivíduos do sexo feminino com idade entre 18 e 35 anos (inclusive) e que tenham olhos azuis e cabelos louros:");
	return qtd;
	}
	public static void main(String[] args) {
	String sexo[];
	String olhos[];
	String cabelos[];
	sexo = new String[5];
	olhos = new String[5];
	cabelos = new String[5];
	int idade[];
	idade = new int[5];
	int i, q, m;
	leitura (sexo, olhos, cabelos, idade);
	m = media_idade(olhos, cabelos, idade);
	System.out.println(m);
	i = maior_idade(idade);
	System.out.println(i);
	q = qt_individuos(sexo, olhos, cabelos, idade);
	System.out.println(q);
	}
}

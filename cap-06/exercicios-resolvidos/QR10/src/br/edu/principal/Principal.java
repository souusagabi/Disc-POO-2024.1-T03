package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        char[] gabarito = new char[8];

        System.out.println("Digite o gabarito da prova (A, B, C ou D):");
        for (int i = 0; i < 8; i++) {
            System.out.print("Resposta da questão " + (i + 1) + ": ");
            gabarito[i] = scanner.next().toUpperCase().charAt(0);
        }

        int[] notas = new int[10];
        
        for (int i = 0; i < 10; i++) {
        	System.out.println("Digite o número do Aluno: ");
        	int num = scanner.nextInt();
            System.out.println((i + 1) +  "º Aluno, número "+num+":");
            int nota = 0;

            for (int j = 0; j < 8; j++) {
                System.out.print("Resposta da questão " + (j + 1) + ": ");
                char resposta = scanner.next().toUpperCase().charAt(0);

                if (resposta == gabarito[j]) {
                    nota++;
                }
            }
            
            notas[i] = nota;
            System.out.println("Nota do aluno " + (i + 1) + ": " + nota);
        }

        int aprovados = 0;
        for (int nota : notas) {
            if (nota >= 6) {
                aprovados++;
            }
        }
        
        double porcentagemAprovacao = (double) aprovados / 10 * 100;
        System.out.println("\nPorcentagem de aprovação: " + porcentagemAprovacao + "%");
        
        scanner.close();
		}
	}

	


package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] modelos = new String[5];

        double[] consumo = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o modelo do carro " + (i + 1) + ": ");
            modelos[i] = scanner.nextLine();
            
            System.out.print("Digite o consumo do carro " + (i + 1) + " (km/l): ");
            consumo[i] = scanner.nextDouble();

            scanner.nextLine();
        }

        int indiceMaisEconomico = 0;
        for (int i = 1; i < 5; i++) {
            if (consumo[i] > 0 && consumo[i] > consumo[indiceMaisEconomico]) {
                indiceMaisEconomico = i;
            }
        }

        System.out.println("O modelo mais econômico é: " + modelos[indiceMaisEconomico]);

        System.out.println("\nConsumo de cada carro para percorrer 1000 km:");
        for (int i = 0; i < 5; i++) {
            if (consumo[i] > 0) {
                double litrosPara1000Km = 1000 / consumo[i];
                System.out.println(modelos[i] + ": " + litrosPara1000Km + " litros");
            }
        }
        
        scanner.close();

	}

}

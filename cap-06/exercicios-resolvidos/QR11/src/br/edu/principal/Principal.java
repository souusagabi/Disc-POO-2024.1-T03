package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] temperaturas = new double[12];
       
        String[] nomesMeses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", 
                               "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        
        for (int i = 0; i < 12; i++) {
            System.out.print("Digite a temperatura média de " + nomesMeses[i] + ": ");
            temperaturas[i] = scanner.nextDouble();
        }

        double maiorTemperatura = temperaturas[0];
        double menorTemperatura = temperaturas[0];
        int indiceMaiorTemperatura = 0;
        int indiceMenorTemperatura = 0;
        
        for (int i = 1; i < 12; i++) {
            if (temperaturas[i] > maiorTemperatura) {
                maiorTemperatura = temperaturas[i];
                indiceMaiorTemperatura = i;
            }
            
            if (temperaturas[i] < menorTemperatura) {
                menorTemperatura = temperaturas[i];
                indiceMenorTemperatura = i;
            }
        }

        System.out.println("A maior temperatura ocorreu em " + nomesMeses[indiceMaiorTemperatura] +
                           " com " + maiorTemperatura + " graus Celsius.");
        System.out.println("A menor temperatura ocorreu em " + nomesMeses[indiceMenorTemperatura] +
                           " com " + menorTemperatura + " graus Celsius.");
        
        scanner.close();
    }
}


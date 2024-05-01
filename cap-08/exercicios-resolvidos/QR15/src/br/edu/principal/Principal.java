package br.edu.principal;

import java.util.Arrays;

public class Principal {

	public static double[] ordenarVetor(double[] vetorA) {
        double[] vetorOrdenado = Arrays.copyOf(vetorA, vetorA.length);
        
        Arrays.sort(vetorOrdenado);
        
        return vetorOrdenado;
    }

    public static void main(String[] args) {
        double[] vetorA = {5.3, 2.8, 7.1, 1.6, 3.9};

        double[] vetorOrdenado = ordenarVetor(vetorA);

        System.out.println("Vetor ordenado:");
        for (double num : vetorOrdenado) {
            System.out.print(num + " ");
        }
    }
}
package br.edu.principal;

public class Principal {
	
	public static int calcularFatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            int fatorial = 1;
            for (int i = 2; i <= numero; i++) {
                fatorial *= i;
            }
            return fatorial;
        }
    }
	
	public static void calcularFatorialVetor(int[] vetorA, int[] vetorB) {
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = calcularFatorial(vetorA[i]);
        }
    }

	public static void main(String[] args) {
		
        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] vetorB = new int[10];

        calcularFatorialVetor(vetorA, vetorB);

        System.out.println("Fatoriais dos elementos do vetor A:");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Elemento " + vetorA[i] + ": " + vetorB[i]);
        }
    }
}

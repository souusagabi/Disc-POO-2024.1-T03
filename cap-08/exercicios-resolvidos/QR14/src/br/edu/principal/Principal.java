package br.edu.principal;

public class Principal {

	public static void mostrarUniao(int[] vetorA, int[] vetorB) {
        int tamanho = vetorA.length + vetorB.length;
        int[] vetorUniao = new int[tamanho];

        for (int i = 0; i < vetorA.length; i++) {
            vetorUniao[i] = vetorA[i];
        }

        for (int i = 0; i < vetorB.length; i++) {
            vetorUniao[i + vetorA.length] = vetorB[i];
        }

        System.out.println("Vetor união:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetorUniao[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
    	
        int[] vetorA = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int[] vetorB = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        mostrarUniao(vetorA, vetorB);
    }
}

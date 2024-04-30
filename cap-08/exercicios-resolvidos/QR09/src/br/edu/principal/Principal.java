package br.edu.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbs = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbs.add(sc.nextInt());
        }

        System.out.println(maiorMenor(numbs));
    }

    private static ArrayList<Integer> maiorMenor(ArrayList<Integer> numbs) {
        int menor = 0;
        int maior = 0;
        for (Integer n : numbs) {
            if (n < menor) {
                menor = n;
            }
            if (n > maior) {
                maior = n;
            }
        }
        ArrayList<Integer> resultado = new ArrayList<>();
        resultado.add(maior);
        resultado.add(menor);
        return resultado;
    }
}

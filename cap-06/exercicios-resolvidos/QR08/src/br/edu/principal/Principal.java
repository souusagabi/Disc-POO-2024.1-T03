package br.edu.principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> v1 = new ArrayList<>();
        ArrayList<Integer> v2 = new ArrayList<>();
        ArrayList<Integer> v3 = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            v1.add(sc.nextInt());
            v2.add(sc.nextInt());
        }

        ordenarCresc(v1);
        ordenarCresc(v2);
        System.out.println(v1);
        System.out.println(v2);

        v3.addAll(v1);
        v3.addAll(v2);
        ordenarCresc(v3);
        System.out.println(v3);
    }

    private static void ordenarCresc(ArrayList<Integer> vetor) { // 16, 2, 2, 17, 39, 45
        int post;
        int ant;
        for (int i = 0; i < vetor.size(); i++) {
            for (int j = 0; j < vetor.size(); j++) {
                int numbFixado = vetor.get(i);
                int numbComp = vetor.get(j);
                if (numbFixado < numbComp) {
                    vetor.set(j, numbFixado);
                    vetor.set(i, numbComp);
                }
            }
        }
    }

}

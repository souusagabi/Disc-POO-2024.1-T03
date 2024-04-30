package br.edu.principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> v = new ArrayList<>();
        ArrayList<Integer> negativos = new ArrayList<>();
        ArrayList<Integer> positivos = new ArrayList<>();

        for (int i = 1; i <= 8; i++) {
            int numb = sc.nextInt();
            v.add(numb);

            if (numb < 0) {
                negativos.add(numb);
            } else {
                positivos.add(numb);
            }

            System.out.println(v);
            System.out.println(negativos);
            System.out.println(positivos);
        }
    }

}

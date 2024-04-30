package br.edu.principal;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();

        ArrayList<Integer> soma = new ArrayList<>();
        ArrayList<Integer> produto = new ArrayList<>();
        LinkedHashSet<Integer> uniao = new LinkedHashSet<>();
        ArrayList<Integer> intercecao = new ArrayList<>();
        LinkedHashSet<Integer> diferencax = new LinkedHashSet<>();

        for (int i = 1; i <= 10; i++) {
            int nx = sc.nextInt();
            x.add(nx);
            int ny = sc.nextInt();
            y.add(ny);

            soma.add(nx + ny);
            produto.add(nx * ny);
            uniao.add(nx);
            uniao.add(ny);
            if (nx == ny) {
                intercecao.add(nx);
            } else {
                diferencax.add(nx);
            }

        }

    }

}

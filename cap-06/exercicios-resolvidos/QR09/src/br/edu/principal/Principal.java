package br.edu.principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> vagas = new ArrayList<>();
        ArrayList<String> origens = new ArrayList<>();
        ArrayList<String> destinos = new ArrayList<>();

        for (int i = 1; i <= 12; i++) {
            numeros.add(sc.nextInt());
            vagas.add(sc.nextInt());
            origens.add(sc.next());
            destinos.add(sc.next());
        }
        System.out.println("\n##################");
        System.out.println("1. Consultar");
        System.out.println("2. Efetuar reserva");
        System.out.println("3. Sair");
        int op = sc.nextInt();

        switch (op) {
            case 1 -> {
                System.out.println("\n=======================");
                System.out.println("1. Por número");
                System.out.println("2. Por origem");
                System.out.println("3. Por destino");
                int op2 = sc.nextInt();
                System.out.println();

                switch (op2) {
                    case 1 -> {
                        int n = sc.nextInt();
                        int indice = numeros.indexOf(n);
                        System.out.println("Vagas: " + vagas.get(indice));
                    }
                    case 2 -> {
                        String o = sc.next();
                        int indice = origens.indexOf(o);
                        System.out.println("Vagas: " + vagas.get(indice));
                    }
                    case 3 -> {
                        String d = sc.next();
                        int indice = destinos.indexOf(d);
                        System.out.println("Vagas: " + vagas.get(indice));
                    }
                }
            }

            case 2 -> {
                int n = sc.nextInt();
                int indice = numeros.indexOf(n);
                if (indice == -1) {
                    System.out.println("Voo inexistente!");
                } else {
                    if (vagas.get(indice) == 0) {
                        System.out.println("Voo lotado!");
                    } else {
                        System.out.println("Reserva confirmada!");
                    }
                }
            }
        }

    }

}

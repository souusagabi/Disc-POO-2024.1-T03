package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        Horario inicio = new Horario(h1, m1);
        Horario termino = new Horario(h2, m2);

    }

    private static int minutosTotais(Horario inicio, Horario termino) { // 24hr = 1440 min
        int hInicio = inicio.horas();
        int mInicio = inicio.minutos();
        int hTermino = termino.horas();
        int mTermino = termino.minutos();

        int minutosTotais;
        if (hTermino < hInicio) { // dia seguinte    15h   16:20    15:59
            minutosTotais = (1440 - (hInicio - hTermino) * 60 ) + mTermino;
        } else {
            minutosTotais = (hTermino - hInicio) * 60 + mTermino;
        }
        return minutosTotais;
    }
}

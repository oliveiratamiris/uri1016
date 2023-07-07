package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc =  new Scanner(System.in);

        int distanciaEmKm , tempoEmMinutos;

        distanciaEmKm = sc.nextInt();


        tempoEmMinutos = distanciaEmKm * 2;


        System.out.println(tempoEmMinutos + " minutos");

        sc.close();

    }
}
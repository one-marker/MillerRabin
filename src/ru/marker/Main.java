package ru.marker;

import java.util.Scanner;

/**
 * Тема: Алгоритм Теста Миллера – Рабина
 * Евлентьев М.Д.
 * Поздняков Г.А.
 * КТСО-01-17
 */
public class Main {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Алгоритм Теста Миллера – Рабина");

        MillerRabin mr = new MillerRabin();
        System.out.print("\nУкажите число, которое нужно проверить: ");
        long num = scan.nextLong();
        System.out.print("\nУкажите кол-во итераций: ");
        int k = scan.nextInt();
        boolean prime = mr.isPrime(num, k);
        if (prime)
            System.out.println("\nЧисло "+ num +" простое");
        else
            System.out.println("\nЧисло "+ num +" составное");

    }
}
